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

}