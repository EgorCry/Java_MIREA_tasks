package Task_5;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }

    public String toString() {
        return "Circle move to x: " + center.x + " with speed: " + center.xSpeed + " and in y: " +
                center.y + " with speed: " + center.ySpeed;
    }

    public void moveUp(){
        center.ySpeed++;
    }
    public void moveDown(){
        center.ySpeed--;
    };
    public void moveLeft(){
        center.xSpeed--;
    };
    public void moveRight(){
        center.xSpeed++;
    };
}
