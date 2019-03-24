public class lesson {
  public static void main(String[] args) {
    /*super   no return value function name parameters*/
  /*  int min=1;
    for(int j=0;j<=5;j++) {
      int n=2;
      System.out.println(returnSum(min,min+n));
      min++;
      n+=j;
    }
    System.out.println(args[0]);
    System.out.println(args[1]);*/
  /*  int[] arr=new int[10];*//*integer array, arr is the name. new initializes array. number within parameters i.e. int[15] is the array size.
    0 based array system for most code, first index/parameter is index 0.*/
  /*  for(int n=0;n<arr.length;n++) {
      arr[n]=2*n*n+n;
      System.out.println(arr[n]);*/
    /*  int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
      for(int n=0;n<arr.length;n++) {
        int tmp=arr[n]; requires temp variable because you don't want to mess up the array elements before you go through the for loop*/
    /*    arr[n]=arr.length-tmp+1;
        System.out.println(arr[n]);/*array length starts from 0 so you have to be careful
      } */
    /*  int[][] arr2=new int[10][10];
      for (int m=0;m<10;m++) {
        for(int j=0;j<10;j++) {
          arr2[m][j]=j;
          System.out.println(arr2[m][j]);
        }
      }*/
      int[][] grid=new int[][]{
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}
      };
      for(int m=0;m<grid.length;m++) {
        for(int n=0;n<grid[0].length;n++) {
          System.out.print(grid[m][n]+" ");/*first goes downward on the grid base 0, and then right on the grid with second parameter*/
        }
        System.out.println(" ");
      }
  }

/*  public static int returnSum(int a, int b) {
    int y=0;
    for(int i=0;i<=b;i++) {\
      x+=i;
    }
    for(int i=0;i<a;i++) {
      y+=i;
    }
    return x-y;
  }
  */
}
