import java.lang.Math;
public class hw {
  public static void main(String[] args) {
    /*Problem 1 Sample*/
    int[] sample1 = new int[]{1,2,3,4,5,9};
    int[] result = reverseOrder(sample1);
    for(int m=0;m<result.length;m++) {
      System.out.println(result[m]);
    }

    /*Problem 2 Sample*/
    int[][] sample2 = new int[][]{
        {1,23,3,13},
        {500,6,7,21},
        {9,10,12,12}
    };
    printGridArray(sample2);

    /*Problem 3 Sample*/
    printBinary(132314);

    /*Problem 4*/
    int[] arr3 = new int[5];
    for(int p=0;p<=4;p++) {
      int n = Integer.parseInt(args[p]);
      arr3[p]=n;
    }
    for(int j=0;j<=4;j++) {
      for(int k=0;k<=4;k++) {
        if(arr3[j]<arr3[k]) {
          int tmp=arr3[j];
          arr3[j]=arr3[k];
          arr3[k]=tmp;
        }
      }
    }
    System.out.println(arr3[2]);

    /*Problem 5*/
    printLocker();
  }

  /*Problem 1*/
  public static int[] reverseOrder(int[] arr) {
    int[] reverse = new int[arr.length];
    for(int n=0;n<arr.length;n++) {
        reverse[n]=arr[arr.length-n-1];
    }
    return reverse;
  }

  /*Problem 2*/
  public static void printGridArray(int[][] arr2) {
    for(int m=0;m<arr2.length;m++) {
     for(int n=0;n<arr2[0].length;n++) {
       System.out.print(arr2[m][n]+" ");
     }
     System.out.println(" ");
   }
  }

  /*Problem 3*/
  public static void printBinary(int x) {
    int n = 0;
    while(Math.pow(2,n+1)<=x) {
      n++;
    }
    for(int z=n; 0<=z;z--) {
      if(Math.pow(2,z)<=x) {
        System.out.print("1");
        int power = (int)Math.round(Math.pow(2,z));
        x=x-power;
      }
      else {
        System.out.print("0");
      }
    }
    System.out.println(" ");
  }

  /*Problem 5*/
  public static void printLocker() {
    int[] arr5 = new int[100];
    for(int b=0;b<=99;b++) {
      arr5[b]=0;
    }
    for(int q=2;q<=100;q++) {
      for(int r=1;r<=100;r++) {
        if(r%q==0 && arr5[r-1]==0) {
          arr5[r-1]=1;
        }
        else if(r%q==0 && arr5[r-1]==1) {
          arr5[r-1]=0;
        }
      }
    }
    for(int c=0;c<=99;c++) {
      if(arr5[c]==0) {
        System.out.println(c+1);
      }
    }
  }
}
