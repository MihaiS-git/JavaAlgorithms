public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carerra");
        car.setColor("Blue");
        car.setConvertible(true);
        car.setDoors(4);

        System.out.println("make= "+ car.getMake());
        System.out.println("model= "+car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setColor("Red");
        targa.setConvertible(false);
        targa.setDoors(2);
        targa.describeCar();
    }
}
