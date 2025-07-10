package model.car;

import model.car.flyweight.ModelCar;

import java.util.HashMap;
import java.util.Map;

public class FactoryModelCar {
    private static Map<String, ModelCar> cache = new HashMap<>();

    public static ModelCar getModel(String mark, String model, String color) {
        String chave = mark + "-" + model + "-" + color;
        if (!cache.containsKey(chave)) {
            cache.put(chave, new ModelCar(mark, model, color));
        }
        return cache.get(chave);
    }
}
