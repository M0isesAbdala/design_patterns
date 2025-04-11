package product;

import builder.BuilderProduct;

import java.util.ArrayList;
import java.util.List;

public class BuilderProductIMPL implements BuilderProduct {
    private List<AbstractProduct> products = new ArrayList<>();

    @Override
    public void build(String name, double price) {
        this.products.add(new ProductIMPL(price, name));
    }

    @Override
    public List<AbstractProduct> getResult() {
        return this.products;
    }
}
