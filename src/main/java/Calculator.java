public class Calculator {
    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static double division(int a, int b) throws Exception {
        if (b == 0){
            throw new Exception("Cannot divide by 0");
        }
        return (double) a/b;
    }
}
