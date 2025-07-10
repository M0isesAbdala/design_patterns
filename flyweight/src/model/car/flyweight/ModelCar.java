package model.car.flyweight;

public class ModelCar {
    private final String mark;
    private final String model;
    private final String color;

    public ModelCar(String mark, String model, String color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    public void show(String placa, int posX, int posY) {
        System.out.printf("Carro %s %s (%s), placa %s em (%d, %d)\n",
                this.mark, this.model, this.color, placa, posX, posY);
    }
}
