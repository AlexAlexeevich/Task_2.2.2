package web.model;

public class Car {
    String modelCar;
    String color;
    String numberCar;
    int year;

    public Car(String modelCar, String color, String numberCar, int year) {
        this.modelCar = modelCar;
        this.color = color;
        this.numberCar = numberCar;
        this.year = year;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
