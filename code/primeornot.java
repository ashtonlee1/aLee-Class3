public class primeornot {
  public static void main(String[] args) {
    int test = Integer.parseInt(args[0]);
    testPrime(test);
  }
  public static void testPrime(int n) {
    if(n==1) {
      System.out.println("Composite");
    }
    else if(n==2) {
      System.out.println("Prime");
    }
    else {
      int[] primes = new int[1];
      primes[0]=2;
      int x = findRoot(n);
      for(int b=2;b<x;b++) {
        boolean initialprime = true;
        int z=findRoot(b);
        int q=0;
        while(primes[q]<z) {
          if((b%primes[q])==0) {
            initialprime = false;
          }
          q++;
        }
        if(initialprime==true) {
          primes[primes.length]=b;
        }
      }
      boolean prime=true;
      for(int p=0;p<primes.length;p++) {
        if((n%primes[p])==0) {
          prime=false;
        }
      }
      if(prime==true) {
        System.out.println("Prime");
      }
      else if(prime==false) {
        System.out.println("Composite");
      }
    }
  }
  public static int findRoot(int m) {
    int a=0;
    while(a*a<m) {
      a++;
    }
    return a;
  }
}
