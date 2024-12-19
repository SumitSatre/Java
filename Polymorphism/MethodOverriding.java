public class MethodOverriding {
    public static void main(String[] args) {
        Dog animal1 = new Dog(); // Upcasting
        Animal animal2 = new Cat(); // Upcasting

        System.out.println("this is : " + animal1.height);

        animal1.makeSound(); // Calls the makeSound method of Dog class
        animal2.makeSound(); // Calls the makeSound method of Cat class

        // final Animal animal = new Animal(); // error: cannot assign a value to final
        // variable animal
        // animal = new Dog();
    }
}

class Animal {
    int height = 10;

    static void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    int height = 9;

    // Override the makeSound method defined in the Animal class
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Dog {
    // Override the makeSound method defined in the Animal class
    void makeSound() {
        System.out.println("Cat meows");
    }
}
