class Box{
    int l , h , w;

    Box(){
        System.out.println("Constructor of Box  is called....");
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(int l , int h , int w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    void print(){
        System.out.println("L : " + l + " h : " + h + " w : " + w);
    }
};

class BoxWeight extends Box {
    int weight;

    BoxWeight(){
        super();
        System.out.println("Constructor of BoxWeight  is called...." + super.toString());
        System.out.println("Constructor of BoxWeight  is called...." + this.toString());

        System.out.println(super.l);
    }
    
}

public class Inheritance1 {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight();
        boxWeight.print();


        // Accessing of variables and methods is always dpends on datatype 

        // Because BoxWeight has access of all the properties of Box then this will work fine
        Box box = new BoxWeight();
        System.out.println("this is box : " + box.h);


        // This will give error because box dont know BoxWeight box does not have properties of BoxWeight
        // BoxWeight boxW = new Box();
        // System.out.println("this is box : " + boxWeight.h);

        //  error: incompatible types: Box cannot be converted to BoxWeight
    }
}