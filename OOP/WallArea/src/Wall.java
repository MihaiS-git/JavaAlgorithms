public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0,0);
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        if (this.width>=0) {
        return width;
    } else {
        return 0;
        }
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        if (this.height >= 0) {
        return height;
    } else {
        return 0;
        }
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        double area = this.getWidth()*this.getHeight();
        return area;
    }
}
