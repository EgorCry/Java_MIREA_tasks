package Task_5;

public class MovablePoint implements Movable{
    private double x, y;

    public MovablePoint(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        setX(x);
        setY(y);
    }

    @Override
    public void moveUpRight(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                '}';
    }
}
