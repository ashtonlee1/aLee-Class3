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
    for(int a = 1; a<100; a++) {
      if(a%5==1) {
        System.out.println(a);
      }
      else if(a%5==4) {
        System.out.println(a);
      }
    }

    //Problem 3

    int score = 91;
    if(score<71) {
      System.out.println("D");
    }
    else if(71<=score && score<81) {
      System.out.println("C");
    }
    else if(81<=score && score<91) {
        System.out.println("B");
    }
    else if(91<=score && score<101) {
        System.out.println("A");
    }

    //Problem 4
    int n = 3;
    while(n>2) {
      if(n%3==0 && n%12!=0) {
        System.out.println(n);
      }
      if(n%4==0 && n%12!=0) {
        System.out.println(n);
      }
      n++;
    }
  }
}
