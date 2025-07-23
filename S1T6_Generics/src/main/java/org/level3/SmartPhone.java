package org.level3;

public class SmartPhone implements Phone {

    private String brand;
    private String model;
    private double price;

    public SmartPhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public String call() {
        return "El SmartPhone \"" + this.brand + "\" está haciendo una llamada . . .";
    }

    public String takePic() {
        return "El SmartPhone \"" + this.brand + "\" está tomando una foto . . .";
    }

    public String toString() {
        return "Marca: " + this.brand + ". Modelo: " + this.model + ". Precio: " + this.price +"€.";
    }
}
