public class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String str1, String str2) {
        return str1 + str2;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator math = new Calculator();

        math.add(0, 0);
    }
}
