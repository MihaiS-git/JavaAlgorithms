public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(6,5);
        Point p2 = new Point(3,1);

        System.out.println(p1.distance());
        System.out.println(p2.distance());
        System.out.println("******************************************");
        System.out.println(p1.distance(3,1));
        System.out.println(p2.distance(6,5));
        System.out.println("******************************************");
        System.out.println(p1.distance(p2));

    }
}
