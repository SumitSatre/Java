public class StaticBlock {
    public static void main(String[] args) {
        Student amit = new Student();
        Student rahul = new Student();
        Student sumit = new Student();
        
    }
}

class Student {
    static int a=4;
    static int b;

    static{
        System.out.println("Static block executed");
        b = a*5;
    }
}