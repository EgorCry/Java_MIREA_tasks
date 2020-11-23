package Task_4;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    protected Shape() { }

    protected Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public abstract String toString();
}
