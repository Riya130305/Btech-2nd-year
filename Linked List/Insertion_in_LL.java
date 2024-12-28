import java.util.*;
public class Insertion_LL {

    //Class for creating the LinkedList
    class Node{
        int data;
        Node next;

        Node (int data){
            this.data=data;
            this.next=null;
        }
    }

    //Inputing(Creation of the LinkedList)
    Node head=null;
    void creation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbre of times is run");
        int t=sc.nextInt();
        while(t--> 0)
        {
            System.out.println("enter the size");
            int size=sc.nextInt();
            for(int i=0;i<size;i++)
            {
                System.out.println("enter the data");
                int data=sc.nextInt();
                Node new_node=new Node(data);

               
                if(head==null)
                {
                    head=new_node;
                }
                else 
                {
                    System.out.println("enter 1 for insertion in the beginneing , 2 for insertion in the last,3 for insertion at desired position");
                    int m=sc.nextInt();
                    switch(m){
                    
                    //At staring
                    case 1:
                       new_node.next=head;
                        head=new_node;
                        
                        break;
                        //At End
                    case 2:

                        Node temp=head;
                        while(temp.next!=null){
                            
                            temp=temp.next;
                        }
                        temp.next=new_node;
                        break;
                    case 3:
                        Node temp1=head;
                        System.out.println("enter the postion where you want your input");
                        int p=sc.nextInt();
                        for(int j=0;j<(p-1) && temp1!=null;j++){
                            temp1=temp1.next;
                        }
                        new_node.next=temp1.next;
                        temp1.next=new_node;
                        break;
                }
            }
            }
        }
    }
    

    //Traversal (or Display the LL)
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
    public static void main(String[] args){
        Insertion_LL l=new Insertion_LL();
        l.creation();
        l.travesal();
       
    }
}
