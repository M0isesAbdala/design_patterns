package entities;

import prototype.Prototype;

public class Character implements Prototype {
    private String name;
    private Arm arm;

    public Character(String nome, Arm arm) {
        this.name = nome;
        this.arm = arm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArm(Arm arm) {
        this.arm = arm;
    }

    public void show() {
        System.out.println("Personagem: " + name + ", Arma: " + arm.getType());
    }

    @Override
    public Character clone() {
        return new Character(this.name, this.arm.clone()); // clone profundo!
    }
}