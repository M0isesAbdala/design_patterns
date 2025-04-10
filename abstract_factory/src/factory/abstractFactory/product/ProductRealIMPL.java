package factory.abstractFactory.product;

public class ProductRealIMPL extends AbstractProduct{

    public ProductRealIMPL(double price) {
        super(price);
    }

    @Override
    public String formattedPrice() {
        return String.format("R$ %.2f", this.price).replace('.', ',');
    }
}
