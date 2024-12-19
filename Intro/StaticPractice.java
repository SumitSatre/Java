class Student {
    String name;
    int rollno;
    static int a=4;
    static int b;

    static{
        System.out.println("Static block executed");
        b = a*5;
    }

    static void printName(){
       //  System.out.println(name);  
        // error: non-static variable name cannot be referenced from a static context
    }
}

class StaticPractice{
    public static void main(String[] args) {
        
    }
}