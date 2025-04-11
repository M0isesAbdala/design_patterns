import director.DirectorShoppingCart;
import product.AbstractProduct;
import product.BuilderProductIMPL;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DirectorShoppingCart director = new DirectorShoppingCart(new BuilderProductIMPL());

        List<AbstractProduct> list = director.getShppingCart();

        for (AbstractProduct p : list){
            System.out.println("Nome: " + p.getName());
            System.out.println("preço: " + p.getPrice());
        }
    }
}