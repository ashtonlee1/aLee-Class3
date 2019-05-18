class Animal{
  public void eat(){
    System.out.println("The animal eats insects");
  }
}
class Bird extends Animal{
  public void eat(){
    System.out.println("The bird eats seeds");/*overwrites the animal eat() function*/
  }
}
class Test{
  public static void main(String[] args) {
    Animal a1= new Animal();
    a1.eat();
    Bird b1 = new Bird();
    b1.eat();
    Animal c1= new Bird();
    c1.eat();
  }
}
/*super(); does the code in the super class.*/
