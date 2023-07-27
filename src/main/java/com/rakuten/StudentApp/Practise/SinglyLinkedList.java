package com.rakuten.StudentApp.Practise;

public class SinglyLinkedList {
    Node head=null,tail=null;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
           this.next=null;
        }
    }
    public void insert(int data)
    {
        Node node= new Node(data);
        if(head==null)
        {
          tail=node;
          head=node;


        }else {
            tail.next=node;
            tail=node;
        }

    }
    public void printList()
    {
        Node Current=head;
        if(head==null)
        {
            System.out.println("List Empty");
        }
        else
        {
            Node new_node;
            while (Current!=null)
            {
                System.out.println(Current.data+" "+Current);
               Current=Current.next;
            }
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
          sll.insert(23);
//        sll.insert(13);
//        sll.insert(33);
//        sll.insert(63);
        sll.printList();

    }
}
