public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public void setFirstNumber(double first){
        this.firstNumber=first;
    }

    public void setSecondNumber(double second){
        this.secondNumber=second;
    }

    public double getAdditionResult(){
        double result=this.firstNumber+this.secondNumber;
        return result;
    }

    public double getSubstractionResut(){
        double result=this.firstNumber-this.secondNumber;
        return result;
    }

    public double getMutiplicationResult(){
        double result=this.firstNumber*this.secondNumber;
        return result;
    }

    public double getDivisionResult(){
        double result=this.firstNumber/this.secondNumber;
        return result;
    }
}
