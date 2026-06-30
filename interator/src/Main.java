import dataStruct.Container;
import interator.Iterator;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Container a = new Container("A");
        Container b = new Container("B");
        Container c = new Container("C");
        Container d = new Container("D");
        Container e = new Container("E");

        b.add(d);
        d.add(e);
        a.add(b);
        a.add(c);

        Iterator<Container> iterator = a.createIterator();
        while (!iterator.isDone()){
            Container item = iterator.get();
            item.greets();
            iterator.next();
            Thread.sleep(500l);
        }
    }

}
