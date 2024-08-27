package web.model;

public class Car {
    private String Color;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String color, String model, int year) {
        Color = color;
        this.model = model;
        this.year = year;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
