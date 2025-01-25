import java.util.*;
class Node
{
    int data;
    Node next;
    Node prev;

    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
} 
class Doublell{//connection established here
    Node head=null;
    Node tail=null;
    //Insertion at beginning 
     void pushed_start(int data)
    {
        Node new_node = new Node(data);
        if(head==null)
        {
            head=new_node;
            tail=new_node;
        }
        else
        {
            new_node.next=head;
            head.prev=new_node;
            head=new_node;
        }
    }

    void pushed_back(int data)
    {
        Node new_node=new Node(data);
        if(head==null)
        {
            head=new_node;
            tail=new_node;
        }
        else{
            new_node.prev=tail;
            tail.next=new_node;
            tail=new_node;
        }
    }

    void pop_front()
    {
        if(head==null)
        {
            System.out.println("Empty list");
            return;
        }
        Node current=head;
        head=head.next;
        if(head!=null)//Edge case for the single linked list node.
        {
            head.prev=null;
        }
        current.next=null;
        // delete current; NO NEED THIS IN JAVA AS IT WILL ALREADY GO TO THE GARBAGE COLLECTER
    }

    void pop_end()
    {
        Node current=tail;
        tail=tail.prev;
        if(tail!=null)//Edge case for the single linked list node.
        {
            tail.next=null;
        }
        tail.prev=null;
        
    }
    void print()
    {
        if(head==null)
        {
            System.out.println("empty");
        }
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
    
}

public class Main{
    public static void main(String[] args)
    {
        Doublell c = new Doublell();
        c.pushed_start(23);
        c.pushed_start(39);
        c.pushed_start(21);
        c.pushed_back(129);
        c.pushed_back(189);
        c.pop_front();
        c.pop_front();
        c.pop_end();
        c.print();

    }
}
