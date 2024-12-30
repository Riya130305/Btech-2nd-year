import java.util.*;
public class Deletion_in_LL {
    class Node{
        int data;
        Node next;
        //Construection
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Creation of LL
    Node head=null;
    int size=0;//class level intization
    void creation(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a size");
        size=sc.nextInt();
        
        for(int i=0;i<size;i++)
        {
            int n=sc.nextInt();
            Node new_node = new Node(n);
            if(head==null){
                head=new_node;
            }
            else{
                new_node.next=head;
                head=new_node;
                
            }
        }    
    }
    //printing the linked list
    // void print(){
    //     for(Node i=head;i!=null;i=head.next)
    //     {
    //         System.out.println(i.data);
    //     }
    // }

    //Code for deleating any element
    void delete(){
        int n,p,m;
        Scanner sc1 = new Scanner(System.in);
        do{
            if(head==null){
                System.out.println("ll is empty");
            }
            else
            {
            System.out.println("enter 1 for delete from starting , 2 for delete the last value , 3 3 for any position ");
            m = sc1.nextInt();
            switch(m){
                //From starting
                case 1:
                Node temp=head;
                temp=head.next;
                head=temp;
                break;
                //From last
                case 2:
                Node temp1=head;
                Node ptr = temp1.next;
    
                while(temp1!=null && temp1.next!=null){
                    temp1=ptr;
                    ptr=temp1.next;
                }
                break;
                //From any postion
                case 3:
                System.out.println("enter the position");
                p=sc1.nextInt();
                Node temp2=head;
                Node ptr1 =temp2.next;
                int count=0;
                for(int i=0;i<size;i++){
                    count++;
                    if(count==p){
                        temp2.next=ptr1.next;
                        break;
                    }
                    temp2=ptr1;
                    ptr1=ptr1.next;
                }
                break;
    }
    
            }
            System.out.println("press 0 to delete the data");
            n=sc1.nextInt();
        }
        while(n==0);
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
        public static void main(String[] args){
        //creating the object
        Deletion_in_LL obj=new Deletion_in_LL();
        obj.creation();
        obj.delete();
        obj.travesal();

    }

}
