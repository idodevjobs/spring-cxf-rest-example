package com.idodevjobs.sample.model;

public class ExampleModel {
    private String string;
    private int anInt;

    public ExampleModel() {}

    public ExampleModel(String string, int anInt) {
        this.string = string;
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public String toString() {
        return "ExampleModel{" +
                "string='" + string + '\'' +
                ", anInt=" + anInt +
                '}';
    }
}
