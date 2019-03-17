public class hw
{
  public static void main(String[] args)
  {

    //Problem 1
    int sum = 0;
    for(int i = 1; i<51; i++) {
      sum += i;
    }
    System.out.println(sum);

    //Problem 2
    for(int b = 4; b<97; b+=10) {
      int a = b + 2;
      System.out.println(b);
      System.out.println(a);
    }

    //Problem 3
    int score = 91;
    if(score<81) {
      if(score<71) {
        System.out.println("D");
      }
      else {
        System.out.println("C");
      }
    }
    else {
      if(score<91) {
        System.out.println("B");
      }
      else {
        System.out.println("A");
      }
    }

    //Problem 4
    int n = 3;
    while(n>2) {
      System.out.println(n);
      System.out.println(n+1);
      System.out.println(n+3);
      System.out.println(n+5);
      System.out.println(n+6);
      n+=12;
    }
  }
}
