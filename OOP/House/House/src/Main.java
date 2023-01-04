public class Main {
    public static void main(String[] args) {
        House redHouse = new House("red");
        House anotherHouse = redHouse;
        System.out.println("redHouse color: " + redHouse.getColor());
        System.out.println("anotherHouse color: " + anotherHouse.getColor());
        System.out.println("************************************************");

        anotherHouse.setColor("blue");
        System.out.println("redHouse color: " + redHouse.getColor());
        System.out.println("anotherHouse color: " + anotherHouse.getColor());
        System.out.println("************************************************");

        House greenHouse= new House("green");
        anotherHouse=greenHouse;
        System.out.println("redHouse color: " + redHouse.getColor());
        System.out.println("greenHouse color: " + greenHouse.getColor());
        System.out.println("anotherHouse color: " + anotherHouse.getColor());
        System.out.println("************************************************");

        anotherHouse.setColor("white");
        System.out.println("redHouse color: " + redHouse.getColor());
        System.out.println("greenHouse color: " + greenHouse.getColor());
        System.out.println("anotherHouse color: " + anotherHouse.getColor());

    }
}
