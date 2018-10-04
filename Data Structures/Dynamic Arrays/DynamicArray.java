public class DynamicArray<String> {
  private Object[] data;
  private int size;
  private int initialCapacity;

  public DynamicArray(int intitalCapacity) {
    this.initialCapacity = intitalCapacity;
    data = new Object[initialCapacity];
  }

  public String get(int index) {
    return (String) data[index];
  }

  public void set(int index, String value) {
    data[index] = value;
  }

  public void insert(int index, String value) {
    if (size == initialCapacity) {
      resize();
    }
    for (int j = size; j > index; j--) {
      data[j] = data[j - 1];
    }
    data[index] = value;
    size++;
  }

  public void resize() {
    Object[] newData = new Object[initialCapacity * 2];
    for (int i = 0; i < initialCapacity; i++) {
      newData[i] = data[i];
    }
    data = newData;
    initialCapacity *= 2;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean contains(String value) {
    for (int i = 0; i < size; i++) {
      if (((String)data[i]).equals(value)) {
        return true;
      }
    }
    return false;
  }

  public void delete(int index) {
    for (int i = index + 1; i < size; i++) {
      data[i - 1] = data[i];
    }
    size--;
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.println("data[" + i + "] = " + data[i]);
    }
  }
}