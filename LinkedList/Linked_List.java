
import java.util.*;
public class Linked_List
{ Scanner sc=new Scanner(System.in);
	Node head;
	int size;
   	class Node
	{
		int data;
		Node next;
	
	Node()
	{
		data=0;
		next=null;
	}
	}
	 public void insertbegin()
	 {
		 Node temp=new Node();
		 System.out.println("enter data to be inserted");
		 int d=sc.nextInt();
		 temp.data=d;
		 temp.next=null;
		 if(head==null)
		 { head=temp;
		 return;
		 }
		 
		 else
		 {
			 temp.next=head;
			 head=temp;
			 return;
		 }
	 }
	 public void insertend()
	 {
		 Node temp=new Node();
		 System.out.println("enter data to be inserted");
		 int d=sc.nextInt();
		 temp.data=d;
		 temp.next=null;
		 if(head==null)
		 { head=temp;
		 return;
		 }
		 else
		 {
			 Node p=new Node();
			 p=head;
			 while(p.next!=null)
			 {
				 p=p.next;
				 
			 }
			 p.next=temp;
         }
         return;
	 }
	void insertmiddle()
	{
		Node temp=new Node();
		 System.out.println("enter position where to insert");
		 int loc=sc.nextInt();
		 System.out.println("enter data to be inserted");
		 int d=sc.nextInt();
		 temp.data=d;
		 temp.next=null;
		 if(head==null)
		 { head=temp;
		   return;
	     }
		 else
		 { Node p=new Node(); p=head;
		   int count=0;
			while(count<loc)
			{ 
				p=p.next;
			}
			temp.next=p.next;
			p.next=temp;
         }
         return;
}
void display()
{
    Node r=new Node();
    r=head;
        while(r!=null)
        {
            System.out.println(r.data);
            r=r.next;
        }
}
}
	class Test{
	public static void main(String [] args)
	{  Scanner sc=new Scanner(System.in);
		Linked_List ll=new Linked_List();
        int ch=sc.nextInt();
        
		
		  
		 switch(ch)
			{
		
			case 1: ll.insertbegin();
		            break;
		    case 2: ll.insertend();
		            break;
		    case 3: ll.insertmiddle();
		            break;
            case 4: ll.display();
            default: break;
          }
          
		
    
		
    }
    
    
}