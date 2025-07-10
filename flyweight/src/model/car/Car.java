package model.car;

import model.car.flyweight.ModelCar;

public class Car {
    private String plate;
    private int posX, posY;
    private ModelCar model;

    public Car(String plate, int posX, int posY, ModelCar model) {
        this.plate = plate;
        this.posX = posX;
        this.posY = posY;
        this.model = model;
    }

    public void show() {
        this.model.show(plate, posX, posY);
    }
}
