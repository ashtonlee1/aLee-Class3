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
