package web.model;

public class Car {
    private long id;
    private String name;
    private int years;

    public Car(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public Car(long id, String name, int years) {
        this.id = id;
        this.name = name;
        this.years = years;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return " Car " +
                " id " + id +
                " name " + name +
                " years " + years;
    }
}
