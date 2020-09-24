package Task_5;

public class MovableRectangle implements Movable {
    private double width, height;
    private MovablePoint upleft;
    private MovablePoint downrigth;

    MovableRectangle(double width, double height, double x, double y){
        setWidth(width);
        setHeight(height);
        this.upleft = new MovablePoint(x, y);
        this.downrigth = new MovablePoint(x+width, y-height);
    }

    public void setNewCoordinates(double x, double y){
        upleft.setXY(x, y);
        downrigth.setXY(x-width, y-height);
    }

    public void setWidthCoor(double width){
        downrigth.setX(downrigth.getX()-getWidth()+width);
        setWidth(width);
    }

    public void setHeightCoor(double height){
        downrigth.setY(downrigth.getY() + getHeight() - height);
        setHeight(height);
    }

    public void setHWCoor(double width, double height){
        downrigth.setX(downrigth.getX()-getWidth()+width);
        downrigth.setY(downrigth.getY() + getHeight() - height);
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void moveUpRight(double x, double y) {
        upleft.moveUpRight(x, y);
        downrigth.moveUpRight(x, y);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "width=" + width +
                ", height=" + height +
                ", Up and Left coordinates: " +
                upleft.toString() + ", Down and Right coordinates: " +
                downrigth.toString();
    }
}
