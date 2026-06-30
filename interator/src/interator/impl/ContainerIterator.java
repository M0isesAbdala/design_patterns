package interator.impl;


import dataStruct.Container;
import interator.Iterator;

public class ContainerIterator implements Iterator<Container> {
    private final Container struct;
    private Container currentItem = null;
    private Indexes index;
    private boolean flag = false;

    private class Indexes {
        private int index;
        private final Indexes parentIndex;

        public Indexes(int index, Indexes parentIndex) {
            this.index = index;
            this.parentIndex = parentIndex;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Indexes getParentIndex() {
            return parentIndex;
        }
    }

    public ContainerIterator(Container struct) {
        this.struct = struct;
        first();
    }

    @Override
    public void first() {
        this.currentItem = struct;
        this.index = new Indexes(0, null);
    }

    @Override
    public void next() {
//        System.out.println("NEXT CURRENT ITEM: " + this.currentItem.getName() + " INDEX: " + this.index.getIndex());
        // procurar se tem filhos para percorrer
        // procurar se tem pai para percorrer
        // verificar se o index é maior poq deve voltar
        // recursão poq não consegue pegar duas camadas para baixo

        // caso tiver filhos iniciar navegação
        if (!this.currentItem.getChildren().isEmpty() && this.index.getIndex() < this.currentItem.getChildren().size()) {
            Indexes newIndex = new Indexes(this.index.getIndex(), this.index);
            this.currentItem = this.currentItem.getChildren().get(this.index.getIndex());
            this.index.setIndex(this.index.getIndex() + 1);
            this.index = newIndex;
        } else if (this.index.getParentIndex() != null) {
            if (this.index.getParentIndex().getIndex() < this.currentItem.getParent().getChildren().size()) {
                Indexes newIndex = new Indexes(this.index.getParentIndex().getIndex(), this.index.getParentIndex());
                this.currentItem = this.currentItem.getParent().getChildren().get(this.index.getParentIndex().getIndex());
                this.index.parentIndex.setIndex(this.index.parentIndex.getIndex() + 1);
                this.index = newIndex;
            } else {
                this.currentItem = this.currentItem.getParent();
                this.index = this.index.getParentIndex();
//                System.out.println("CALL RECURSIVE ITEM: " + this.currentItem.getName() + " INDEX: " + this.index.getIndex());
                next();
            }

        } else {
            flag = true;
        }
    }

    @Override
    public boolean isDone() {
        return flag;
    }

    @Override
    public Container get() {
        return this.currentItem;
    }
}
