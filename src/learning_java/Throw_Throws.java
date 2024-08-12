package learning_java;

class NegitiveRadiusException extends Exception {
    @Override
    public String toString() {
        return " r cant be -ve";
    }

    public String getMessage() {
        return " r cant be -ve";
    }
}

public class Throw_Throws {

    public static double area(int r) throws NegitiveRadiusException {
        if (r < 0) {
            throw new NegitiveRadiusException();
        }
        return Math.PI * r * r;
    }

    public static int divided(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int c = divided(6, 0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        try {
            double ar = area(-6);
            System.out.println(ar);
        } catch (NegitiveRadiusException e) {
            System.out.println("radius cant be -ve");
        }
    }
}
