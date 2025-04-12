package entities;

import prototype.Prototype;

public class Arm implements Prototype {
    private String type;

    public Arm(String tipo) {
        this.type = tipo;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public Arm clone() {
        return new Arm(this.type);
    }
}
