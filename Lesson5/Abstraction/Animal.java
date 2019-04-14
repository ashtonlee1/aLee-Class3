abstract class Animal { /*Abstraction:
    Hides complexity of data
    aboids repetitive code
    gives flexibility to change implementation of abstract behavior

    Animals - Cats, Birds, etc*/
    abstract void move();
    abstract void eat();
    public void label() {
        System.out.println("I'm an animal.");
    }
    /*every class that inherits from Animal must implement these functions*/
}
class Bird extends Animal {/*extend comes from only one class*/
    void eat() {
        System.out.println("Eats seeds.");
    }
    void move() {
        System.out.println("Moves by flying.");
    }
}
class Fish extends Animal {
    void eat() {
        System.out.println("Eats seafood.");
    }
    void move() {
        System.out.println("Moves by swimming.");
    }
}
