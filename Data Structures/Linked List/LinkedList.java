public class LinkedList {
  private static class Node {
    int data;
    Node next;

    public Node(int data) { this.data = data; }
  }

  private Node head;

  public void addFront(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public int getFirst() {
    if (head == null) {
      throw new IllegalStateException("Empty list!");
    }
    return head.data;
  }
  
  public int getLast() {
    if (head == null) {
      throw new IllegalStateException("Empty list!");
    }
    Node current = head;

    while (current.next != null) {
      current = current.next;
    }

    return current.data;
  }
  
  public void addBack(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node current = head;

    while (current.next != null) {
      current = current.next;
    }

    current.next = newNode;
  }

  public int size() {
    if (head == null) {
      return 0;
    }
    Node current = head;
    int count = 0;

    while (current != null) {
      count++;
      current = current.next;
    }

    return count;
  }
  
  public void clear() {
    head = null;
  }

  public void delete(int value) {
    if (head == null) {
      throw new IllegalStateException("Empty list!");
    }
    if (size() == 1 && head.data != value) {
      return;
    } 
    if (head.data == value) {
      head = head.next;
      return;
    }
    Node current = head;

    while (current.next.data != value) {
      current = current.next;
    }

    if (current.next.data == value) {
      current.next = current.next.next;
      return;
    }
  }

}