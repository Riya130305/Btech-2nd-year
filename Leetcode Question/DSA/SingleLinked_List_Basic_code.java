import java.util.*;
public class Single_list_creation {

    
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    Node head =null;

    public void creation()
    {
        int data;
        int n;
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while(tc-->0)
        {
            System.out.println("Enter a data");
            data=sc.nextInt();
            Node new_node=new Node(data);//Object

            if(head==null)
            {
                head=new_node;
            }
            else
            {
                new_node.next=head;  //new_node.next is showing the address(or link)
                head=new_node;
            }
            
        }
    }

    public void travesal()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("No Linked list is exist");

        }
        else{
            while(temp!=null)
            {
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args)
    {
        //Creating obbject of the single list creation class
        Single_list_creation obj=new Single_list_creation();
        obj.creation();
        obj.travesal();

    }
 
}
