public class Test {
  public static void main (String[] args) {
    OrderedArrayList<String> array = new OrderedArrayList<>(10);
    System.out.println(array);
    array.add("dog");
    System.out.println(array);
    array.add("cat");
    //array.set(1, null);
    System.out.println(array);
    array.set(1, "bird");
    System.out.println(array);
  }
}
