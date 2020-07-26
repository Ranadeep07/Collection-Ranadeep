package Epam;

public class customList {
		static class Node{
			int data;
			Node next;
			public Node(int data)
			{
				this.data = data;
				 next = null;
			}
		}
		public Node head = null;  
	    public Node tail = null;  
		 void add(int data) {
			Node new_node = new Node(data);
			  if(head == null) {  
		            //If list is empty, both head and tail will point to new node  
		            head = new_node;  
		            tail = new_node;  
		        }  
		        else {  
		            //newNode will be added after tail such that tail's next will point to newNode  
		            tail.next = new_node;  
		            //newNode will become new tail of the list  
		            tail = new_node;  
		        }  
		}
		 void deleteFromLast()
		 {
			 if(head == null) 
			 {
				 System.out.println("The list is empty");
				 return;
			 }
			 else {
				 if(head != tail) {
					 Node temp = head;  
			 while(temp.next!= tail)
			 {
				 temp = temp.next;
			 }
			 tail=temp;
			 tail.next = null;
				 }
				 else {
					head = tail = null;
                }
            System.out.println("\nAfter deleteing");
		 }
		 }
		void display()
		{
			Node temp = head;
			System.out.println("Displaying the List:: ");
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
		
	}


