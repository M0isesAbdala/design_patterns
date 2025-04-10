package factory.abstractFactory;

import factory.abstractFactory.product.AbstractProduct;

public interface Products {
    public AbstractProduct productDolar(double price);
    public AbstractProduct productReal(double price);
}
