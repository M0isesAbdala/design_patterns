import car.Car;
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
        Car.Builder builder = new Car.Builder();
        Car car1 = builder
                .engine("V8")
                .doors(4)
                .hasSunroof(true)
                .build();
        Car car2 = builder
                .engine("V12")
                .doors(2)
                .hasSunroof(false)
                .build();

        System.out.println("Carro 1: " + car1.getEngine() + " / " + car1.getDoors() + " / " + car1.isHasSunroof());
        System.out.println("Carro 2: " + car2.getEngine() + " / " + car2.getDoors() + " / " + car2.isHasSunroof());
    }
}