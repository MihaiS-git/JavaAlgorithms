public class Rational {
    private long a;
    private long b;

    public Rational() {                                                     //constructor
        a = 0;
        b = 1;
    }

//    public Rational(long a) {                                               //another constructor(not used yet)
//        this.a = a;
//        this.b = 1;
//    }
//
//    public Rational(long a, long b) {                                       //another constructor(not used yet)
//        this.a = a;
//        this.b = b;
//    }

    public long getA() {                                                    //getter for 'a' the numerator of the fraction
        return a;
    }

    public void setA(long a) {                                              //setter for 'a'
        this.a = a;
        simplify();                                                         //call of the simplify method to simplify the fraction
    }

    public long getB() {                                                    //getter for 'b' the denominator of the fraction
        return b;
    }

    public void setB(long b) {                                              //setter for 'a'
        this.b = b;
        simplify();                                                         //call of the simplify method to simplify the fraction
    }

    protected static int compareFractions(Rational r1, Rational r2) {          //method to compare 2 objects of Rational type
        long a1 = r1.getA();                                                //get the numerator of the fraction object r1
        long b1 = r1.getB();                                                //get the denominator of the fraction object r1
        long a2 = r2.getA();                                                //get the numerator of the fraction object r2
        long b2 = r2.getB();                                                //get the denominator of the fraction object r1
        float v1 = (float) a1 / b1;                                         //find the Float type value of the fraction in the object r1
        float v2 = (float) a2 / b2;                                         //find the Float type value of the fraction in the object r2
        if (v1 >= v2) {                                                     //compare the 2 values and set flags
            return 1;
        } else {
            return 2;
        }
    }

    protected static Rational multiply(Rational r1, Rational r2) {             //method for the multiplication of 2 object of Rational type
        Rational prod = new Rational();                                     //declare a new instance of the Rational class for the new product object
        prod.a = r1.a * r2.a;                                               //calculate the product of numerators
        prod.b = r1.b * r2.b;                                               //calculate the product of denominators
        prod.simplify();                                                    //call of the simplify method
        return prod;                                                        //return product
    }

    protected static Rational divide(Rational r1, Rational r2) {               //method to calculate the division
        Rational temp = new Rational();                                     //declare a new instance of the Rational class for the new temp object, the inverse of the second fraction
        temp.a = r2.b;
        temp.b = r2.a;
        return multiply(r1, temp);                                          //call of the multiply method to multiply the first fraction with the inverse of the second fraction and return the result
    }

    protected static Rational sum(Rational r1, Rational r2) {                  //method to calculate the sum of 2 Rational objects
        Rational sum = new Rational();                                      //declare a new instance of the Rational class for the new sum object
        sum.a = r2.b * r1.a + r2.a * r1.b;                                  //multiply each numerator of the 2 fractions with the denominator of the other fraction and calculate the sum
        sum.b = r1.b * r2.b;                                                //multiply the 2 denominators to obtain 2 fractions with common denominator
        sum.simplify();                                                     //call of the simplify method
        return sum;                                                         //return sum
    }

    protected static Rational diff(Rational r1, Rational r2) {                 //method to calculate the difference between 2 fractions, the result is always positive
        Rational diff = new Rational();                                     //declare a new instance of the Rational class for the new sum object
        diff.a = Math.abs(Math.abs(r2.a * r1.b) - Math.abs(r1.a * r2.b));   //multiply each numerator of the 2 fractions with the denominator of the other fraction and calculate the absolute difference
        diff.b = r1.b * r2.b;                                               //multiply the 2 denominators to obtain 2 fractions with common denominator
        diff.simplify();                                                    //call of the simplify method
        return diff;                                                        //return the difference
    }

    @Override
    public String toString() {                                              //override the Java 'toString()' method to format the output as a fraction of the Rational class objects 'a/b'
        return a + "/" + b;
    }

    private long cmmdc(long a, long b) {                                    //method to calculate the greatest common factor of 2 Long numbers by difference till the numbers are equal, the result is the greatest common factor Euclid's Algorithm
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

    protected void simplify() {                                             //method to simplify a fraction calling the cmmdc method and establish the sign to the numerator
        if (a * b > 0) {
            a = Math.abs(a);
            b = Math.abs(b);
        } else {
            a = -Math.abs(a);
            b = Math.abs(b);
        }
        long cmd = cmmdc(Math.abs(a), b);
        a = a / cmd;
        b = b / cmd;
    }
}
