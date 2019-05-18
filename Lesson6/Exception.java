class Exception{
  public static void main(String[] args){
    try{
      /*System.out.println(4/0);
      System.out.println("Testing");*/
      int[] arr = new int[1];
      arr[3]=2;
    }
    catch(ArithmeticException e){
      System.out.println("divide by 0 error!");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e.getMessage());
    }
  }
}
