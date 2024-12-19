class Box{
    int l , h , w;
static {
    System.out.println("static block of Box  is called....");
}
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
        System.out.println("Box : L : " + l + " h : " + h + " w : " + w);
    }
};

class BoxWeight extends Box {
    int weight;

    static {
        System.out.println("static block of BoxWeight  is called....");
    }

    BoxWeight(){
        super();
        System.out.println("Constructor of BoxWeight  is called...." + super.toString());
        System.out.println("Constructor of BoxWeight  is called...." + this.toString());

        System.out.println(super.l);
    }

    void print(){
        System.out.println("BoxWeight : L : " + l + " h : " + h + " w : " + w);
    }
    
}


class BoxPrice extends BoxWeight{
    int weight;

    static {
        System.out.println("static block of BoxPrice  is called....");
    }

    BoxPrice(){
        super();
        System.out.println("Constructor of BoxPrice  is called....");

        System.out.println(super.l);

        super.print();
    }
}

class A extends BoxWeight{
    int weight;

    static {
        System.out.println("static block of A  is called....");
    }

    A(){
        super();
        System.out.println("Constructor of A  is called....");

        System.out.println(super.l);
    }
}


public class MultiLevelInheritance {
    public static void main(String[] args) {
        BoxPrice boxPrice = new BoxPrice();
    }
}
