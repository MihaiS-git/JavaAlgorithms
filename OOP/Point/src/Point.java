import java.lang.Math;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        double distance = Math.sqrt(this.x*this.x + this.y*this.y);
        return distance;
    }

    public double distance(int x,int y){
        double distX = this.x - x;
        double distY = this.y - y;
        double distance = Math.sqrt(distX*distX + distY*distY);
        return distance;
    }

    public double distance(Point point) {
        double distX = point.getX() - this.x;
        double distY = point.getY() - this.y;
        double distance = Math.sqrt(distX*distX + distY*distY);
        return distance;
    }
}
