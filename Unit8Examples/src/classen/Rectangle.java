package classen;

public class Rectangle {

    private static int count;
    public static final int ANGLES=4;
    private int x;
    private int y;
    private int height;
    private int width;

    public Rectangle() {
        count++;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        count++;
    }

    public Rectangle(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        count++;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.getX(), rectangle.getY(), rectangle.getHeight(), rectangle.getWidth());
        count++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x <0 ?-x : x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y<0 ? -y : y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height < 0 ? -height : height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width<0 ? - width :width;
    }
    public void setPosition(int x, int y){
        this.setX(x);
        this.setY(y);
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }
    public void grow(int d){
        this.width=width+Math.abs(d);
        this.height=height+Math.abs(d);
    }
    public static int getCount(){
        return count;
    }
}
