import model.car.Car;
import model.car.FactoryModelCar;
import model.car.flyweight.ModelCar;

public class Main {

    public static void main(String[] args){
        ModelCar sedan = FactoryModelCar.getModel("Toyota", "Corolla", "Prata");
        ModelCar suv = FactoryModelCar.getModel("Jeep", "Renegade", "Preto");

        Car car1 = new Car("ABC-1234", 10, 20, sedan);
        Car car2 = new Car("XYZ-5678", 30, 40, sedan);
        Car car3 = new Car("DEF-0000", 50, 60, suv);

        car1.show();
        car2.show();
        car3.show();
    }
}
