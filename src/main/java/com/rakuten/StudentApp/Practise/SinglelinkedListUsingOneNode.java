package com.rakuten.StudentApp.Practise;

import org.apache.xmlbeans.impl.store.Cur;

import java.util.ArrayList;
import java.util.List;

public class SinglelinkedListUsingOneNode {
    int size=0;
  class Node {
      int data;
      Node next;

      Node(int data) {
          this.data = data;
          this.next = null;
      }
  }
     Node head=null;
      public void addFirst(int data)
      {
       Node newNode =new  Node(data);
       if(head==null)
       {
           head=newNode;
       }
       else
       {
            newNode.next=head;
           head=newNode;
       }
      }
     public  void addEndOfList(int data)
     {
         Node newNode =new  Node(data);
         if(head==null)
         {
          head=newNode;
         }
         else
         {
             Node currentNode=head;
             while(currentNode.next!=null)
             {
                 currentNode=currentNode.next;
             }
             currentNode.next=newNode;
             //head=currentNode;
         }
     }
    public void addElementMiddle(int data,int position)
    {
        Node newNode = new Node(data);
        Node CurrNode=null,temp=null;
              if(head==null)
              {
                  head=newNode;
              }
              else {
                  CurrNode=head;
                  int i=1;
                  while (data>i && CurrNode!=null)
                  {

                      CurrNode=CurrNode.next;
                      i++;
                  }


                  CurrNode=newNode;
                  CurrNode.next=newNode;
              }


    }

   public void InsertPos(int position, int data) {
        Node temp1 = head;
        if (position < 1)
            System.out.print("Invalid position");

        // if position is 1 then new node is
        // set infornt of head node
        // head node is changing.
        if (position == 1) {
            Node newNode = new Node(data);
            newNode.next = temp1;
            temp1 = newNode;
        } else {
            while (position-- != 0) {
                if (position == 1) {
                    // adding Node at required position
                    Node newNode = new Node(data);

                    // Making the new Node to point to
                    // the old Node at the same position
                    newNode.next = temp1.next;

                    // Replacing current with new Node
                    // to the old Node to point to the new Node
                    head.next= newNode;
                    break;
                }
                head = head.next;
            }
            if (position != 1)
                System.out.print("Position out of range");
        }

    }
    public void deleteElement(int data)
    {
        if(head==null)
        {
            System.out.println("List Is empty");
        }


//        List<Integer> deletedNum= new ArrayList<>();
//        Node currentNode=head;
//        int length=0;
//        while(currentNode!=null)
//        {
//            if(currentNode.data==data)
//            {
//                deletedNum.add(length);
//            }
//            currentNode=currentNode.next;
//            length++;
//        }
        Node currentNode1=head,previous=null;
//        for (Integer pos: deletedNum) {

            for (int i=0;i<3;i++) {
                currentNode1 = currentNode1.next;
            }
            if(currentNode1.next.next==null)
            {
                currentNode1.next=null;
            }else {
                currentNode1.next = currentNode1.next.next;
                System.out.println("currentNode : "+currentNode1.data);
            }
            //}
        head=currentNode1;


    }


      public  void printList()
      {
          if(head==null)
          {
              System.out.println("Linked List is Empty");
          }else {
            Node CurrentNode = head;
            while (CurrentNode!=null)
            {
                System.out.println(CurrentNode.data);
                CurrentNode=CurrentNode.next;
                size++;
            }
          }
          System.out.println("Size of linked list  :"+size);
      }

      public void deleteVal(int value)
     {
        Node ptr1=head, ptr2=null;

        if(ptr1==null)
        {
            System.out.println("Ptr 1is null :");
        }
        while (ptr1!=null && ptr1.next!=null)
        {
            ptr2=ptr1;
            while (ptr2.next != null) {
                if (value == ptr2.next.data) {
                    ptr2.next = ptr2.next.next;
                   // System.gc();
                }
                else {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }

     }



  public static void main(String[] args) {
      SinglelinkedListUsingOneNode oneNode = new SinglelinkedListUsingOneNode();

      oneNode.addFirst(75);
      oneNode.addFirst(45);
      oneNode.addFirst(46);
      oneNode.addFirst(47);
    //  oneNode.addElementMiddle(99,4);
      oneNode.addEndOfList(45);
      oneNode.addEndOfList(80);
      oneNode.addEndOfList(90);
      oneNode.addEndOfList(56);
      oneNode.InsertPos(3,190);

      System.out.println("After Adding");
      oneNode.printList();
     // oneNode.deleteElement(45);
      oneNode.deleteVal(45);
      System.out.println("After deleting");
      oneNode.printList();

    }
}







//     void deleteVal(int value)
//     {
//         Node temp = head;
//         Node previous = null;
//
//         if(temp == null){
//             System.out.println("Can't delete Linked List empty");
//             return;
//         }
//
//         // Case when there is only 1 node in the list
//         if(temp.next==null)
//         {
//             head = null;
//             System.out.println("Deleted: " + value);
//             return;
//         }
//
//         // if the head node itself needs to be deleted
//         if(temp.data==value)
//         {
//             head = temp.next; //changing head to next in the list
//             System.out.println("Deleted: " + value);
//             return;
//         }
//
//         // traverse until we find the value to be deleted or LL ends
//         while (temp != null && temp.data != value)
//         {
//             // store previous link node as we need to change its next val
//             previous = temp;
//             temp = temp.next;
//         }
//
//         // if value is not present then
//         // temp will have traversed to last node NULL
//         if(temp==null)
//         {
//             System.out.println("Value not found");
//             return;
//         }
//
//         // for node to be deleted : temp lets call it nth node
//         // assign (n-1)th node's next to (n+1)th node
//         previous.next = temp.next;
//         System.out.println("Deleted: " + value);
//     }
// }


//   ListNode curr = head;
//  while (curr != null) {
//          ListNode temp = curr;
//
//          while(temp!=null && (temp.val)==(curr.val)) {
//          temp = temp.next;
//          }
//
//          curr.next = temp;
//          curr = curr.next;
//          }