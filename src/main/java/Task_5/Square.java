package Task_5;

public class Square extends Shape{
    protected double side;

    protected Square(){}
    protected Square(double side){
        this.side = side;
    }
    protected Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getArea(){
        return getSide()*getSide();
    }
    public double getPerimeter(){
        return getSide()*4;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public String toString() {
        return "Square:\nside: " + getSide() + "\nPerimeter and Area: " +
                getPerimeter() + " " + getArea() + "\nColor and its status: " +
                (isFilled()==true ? "filled" : "not filled") + " with " + getColor();
    }
}
