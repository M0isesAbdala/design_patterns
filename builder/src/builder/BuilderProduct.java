package builder;

import product.AbstractProduct;

import java.util.List;

public interface BuilderProduct {
    public void build(String name, double price);
    public List<AbstractProduct> getResult();
}
