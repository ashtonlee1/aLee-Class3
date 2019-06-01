public class Selectionsort{
  public static int[] selectionSort(int[] arr){
    for(int n=0;n<arr.length;n++){
      int lowest=n;
      for(int m=n;m<arr.length;m++){
        if(arr[m]<arr[lowest]){
          lowest=m;
        }
      }
      int temp=arr[lowest];
      arr[lowest]=arr[n];
      arr[n]=temp;
    }
    return arr;
  }
  public static void main(String[] args) {
    int[] sample={5,3,4,2,6,1,7};
    sample=selectionSort(sample);
    for(int n=0;n<sample.length;n++){
      System.out.println(sample[n]);
    }
  }
}
