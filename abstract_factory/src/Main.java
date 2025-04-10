import factory.abstractFactory.AbstracFactory;
import factory.abstractFactory.AbstracFactoryIMPL;
import factory.abstractFactory.product.AbstractProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AbstracFactory abstracFactory = new AbstracFactoryIMPL();

        AbstractProduct p1 = abstracFactory.productDolar(10.20);
        AbstractProduct p2 = abstracFactory.productReal(56.49);

        System.out.println("Produto abstrado em dolar: " + p1.formattedPrice());
        System.out.println("Produto abstrado em real: " + p2.formattedPrice());
    }
}