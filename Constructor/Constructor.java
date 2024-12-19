class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
        System.out.println(this);
    }

    Student(String n) {
        System.out.println("This is name : " +n);
        this.name = n;
    }


    void print(){
        System.out.println(this.name);
        System.out.println(this.rollno);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("sumit" , 15);
        Student s2 = new Student("sumit");

        System.out.println(s1
        );

        s1.print();

        s2.print();
        String myString = "Hello";
        String a= new String("sumit");

        System.out.println(a);

        a = new String("amit");
        System.out.println(a);

    }
}
