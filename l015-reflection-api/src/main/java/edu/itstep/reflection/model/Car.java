package edu.itstep.reflection.model;

import edu.itstep.reflection.annotation.Column;

public class Car {

    static {
        System.out.println("CAR INITALIZED");
    }

    private int horsepower;

    @Column("serial_number")
    private final String serialNumber;

    public Car() {
        this.serialNumber = "";
    }

    public Car(int horsepower, String serialNumber) {
        this.horsepower = horsepower;
        this.serialNumber = serialNumber;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void printSerialNumber() {
        System.out.println(this.serialNumber);
    }
}
