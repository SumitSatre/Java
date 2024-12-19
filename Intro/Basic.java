import java.util.ArrayList;
class Basic {
    static int a = 5;
    static class Student {
        int rno;
        String name;
        String marks;
        static int a = 5;
    }

    int greet(){
        this.a = 12;
        return 34;
    }
    public static void main(String[] args) {
        Student sumit = new Student();

        System.out.println("Sumit object is : "+ a.greet());
        Basic a = new Basic();
        a.greet();

        for(int i = 0 ;i<3;i++){
            System.out.print("hi");
        }

        
    }
}