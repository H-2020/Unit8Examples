package classen;

public class RectangleApp {

    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");
        Rectangle rectangle1=new Rectangle();
        rectangle1.setX(5);
        rectangle1.setY(8);
        rectangle1.setHeight(10);
        rectangle1.setWidth(20);


        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getX());
        System.out.println(rectangle1.getY());


        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle();

        System.out.println(Rectangle.getCount());
    }
}
