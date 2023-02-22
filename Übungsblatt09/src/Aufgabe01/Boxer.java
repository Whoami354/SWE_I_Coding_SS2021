package Aufgabe01;

public class Boxer{
    private String name;

    public Boxer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
