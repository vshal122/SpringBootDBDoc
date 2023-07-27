package com.rakuten.StudentApp.Practise;

public class LinkedListPracticeSessionTwo {

     class Node {
         int data;
         Node next;

         public Node(int data) {
             this.data = data;
             this.next = null;
         }

     }
          Node head=null;
       public String addElement(int data,int position)
       {

           int size=getSizeOfList();
           if(position<0 || position>size)
           {
              return "Please Enter valid Position  :";
           }
           boolean f=false;
           Node newNode= new Node(data);
           position--;
           if(head==null)
           {
               head=newNode;
           }
           else {
                  Node temp=head;
                  while (position>1 && temp!=null)
                  {
                       temp=temp.next;
                       --position;
                       if(position==0)
                       {
                           f=true;
                       }
                  }
                  if(position==0 && !f)
                  {
                      newNode.next =head;
                      head=newNode;
                  }
                  else {
                      newNode.next = temp.next;
                      temp.next = newNode;
                  }

           }
           return "success";
       }
       public void addElement(int data)
       {
           Node newNode= new Node(data);

           if(head==null)
           {
               head=newNode;
           }
           else {
               newNode.next=head;
               head=newNode;
           }
       }
    public int  printElement()
    {
        Node temp=head;
        int size=0;
        if(temp==null)
        {
            System.out.println("Empty List");
        }
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
            size++;
        }
        return size;
    }
    public int  getSizeOfList()
    {
        Node temp=head;
        int size=0;
        if(temp==null)
        {
            return 0;
        }
        while (temp!=null) {
            temp=temp.next;
            size++;
        }
        return size;
    }
    public static void main(String[] args) {

        LinkedListPracticeSessionTwo obj = new LinkedListPracticeSessionTwo();
        obj.addElement(25);
        obj.addElement(24);
        obj.addElement(23);
        obj.addElement(22);

        int size=obj.printElement();
        System.out.println("size of Linked List :"+size);

        String result= obj.addElement(78,6);
        System.out.println(result);
        System.out.println();
        obj.printElement();
    }
}
