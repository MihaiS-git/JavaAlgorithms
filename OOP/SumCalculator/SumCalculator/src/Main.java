public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator=new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Addition: " + calculator.getAdditionResult());
        System.out.println("Substraction: " + calculator.getSubstractionResut());
        System.out.println("Multiplication: " + calculator.getMutiplicationResult());
        System.out.println("Division: " + calculator.getDivisionResult());
    }
}
