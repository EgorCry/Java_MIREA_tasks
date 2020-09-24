package Task_5;

public class MovableCircle extends Circle implements Movable{
    private MovablePoint center;

    public MovableCircle(double radius, double x, double y) {
        setRadius(radius);
        this.center = new MovablePoint(x, y);
    }

    public void changeCenter(double x, double y){
        center.setX(x);
        center.setY(y);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                center.toString() +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void moveUpRight(double x, double y) {
        center.moveUpRight(x, y);
    }
}
