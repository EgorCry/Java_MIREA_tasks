package Task_5;

public class Circle extends Shape{
    protected double radius;

    protected Circle(){}

    protected Circle(double radius){

    }
    protected Circle(double radius, String color, boolean filled){
        setRadius(radius);
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(getRadius(), 2);
    }

    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return "Circle: \nRadius: " + getRadius() + "\n" +
                "Perimeter: " + getPerimeter() + "\nArea: " +
                getArea() + "\nColor and its status: " +
                (isFilled()==true ? "filled" : "not filled") + " with " + getColor();
    }
}
