package LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(9);
        linkedList.append(11);
        linkedList.append(12);
        linkedList.printList();

        System.out.println("-------- Doubly Linked List --------");
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.printList();
        dll.getHead();
        dll.append(2);
        dll.printList();
        }
    }