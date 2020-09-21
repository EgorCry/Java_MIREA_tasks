package Task_5;

public class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "Object moved to x: " + x + " with speed: " + xSpeed + " and in y: " + y + " with speed: " + ySpeed;
    }

    public void moveUp(){
        ySpeed++;
    }
    public void moveDown(){
        ySpeed--;
    };
    public void moveLeft(){
        xSpeed--;
    };
    public void moveRight(){
        xSpeed++;
    };
}
