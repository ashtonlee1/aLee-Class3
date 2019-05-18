import java.util.*;

public class OrderedArrayList<E extends Comparable<E>> extends NoNullArrayList<E> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  private int findPos(E e) {
    int position=0;
    for (int n=0;n<super.size();n++) {
      if (e.compareTo(super.get(n))>=0) {
        position++;
      }
    }
    return position;
  }
  @Override
  public boolean add(E e) {
    int position=findPos(e);
    super.add(position,e);
    return true;
  }
  @Override
  public void add(int index, E e) {
    this.add(e);
  }
  @Override
  public E set(int index, E e) {
    super.remove(index);
    this.add(e);
    return e;
  }
}
