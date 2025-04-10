package factory.abstractFactory;

import factory.abstractFactory.product.AbstractProduct;
import factory.abstractFactory.product.ProductDolarIMPL;
import factory.abstractFactory.product.ProductRealIMPL;

public class AbstracFactory implements Factory{

    @Override
    public AbstractProduct productDolar(double price) {
        return new ProductDolarIMPL(price);
    }

    @Override
    public AbstractProduct productReal(double price) {
        return new ProductRealIMPL(price);
    }
}
