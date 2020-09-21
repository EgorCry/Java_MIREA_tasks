package Task_5;

public class Rectangle extends Shape{
    protected double width, length;
    public Rectangle(){}
    public Rectangle(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }
    Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }
    public Rectangle(double width, String color, boolean filled){
        setWidth(width);
        setColor(color);
        setFilled(filled);
    }
    public Rectangle(double width, double length, String color, boolean filled){
        setWidth(width);
        setLength(length);
        setColor(color);
        setFilled(filled);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return getLength()*getWidth();
    }
    public double getPerimeter(){
        return 2*(getWidth()+getLength());
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public String toString() {
        return "Rectangle:\nwidth and length: " + getWidth() +
                " " + getLength() + "\nPerimeter and area: " +
                getPerimeter() + " " + getArea() + "\nColor and status: " +
                (isFilled()==true ? "filled" : "not filled") + " with " + getColor();
    }
}
