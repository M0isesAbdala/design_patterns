package factory.abstractFactory.product;

public class AbstractProduct implements  Product {
    protected double price;

    public AbstractProduct(double price) {
        this.price = price;
    }

    @Override
    public String formattedPrice() {
        return String.format("$ %.2f", this.price);
    }
}
