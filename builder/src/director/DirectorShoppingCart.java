package director;

import builder.BuilderProduct;
import product.AbstractProduct;

import java.util.List;

public class DirectorShoppingCart {
    BuilderProduct build;
    public DirectorShoppingCart(BuilderProduct build) {
        this.build = build;
        build.build("A", 10);
        build.build("B", 20);
        build.build("C", 30);
    }

    public List<AbstractProduct> getShppingCart(){
      return this.build.getResult();
    }

}
