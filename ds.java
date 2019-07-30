public class ds{
	public static void main(String[] args){
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.pop();
		System.out.println(s.peek());
		s.display();



	
	}

	public static class Node{
		int data;
		Node next;
		public Node(){
			data=0;
			next=null;
		}
	}
	public static class LinkedList{
		Node head=new Node();
		int size;

		public LinkedList(){
			size=0;
			head.next=null;
		}
		public void append(int value){
			Node n1=new Node();
			n1.data=value;
			if(size==0){
				head=n1;
				size++;
			}
			else{
			Node nptr=head;
			while(nptr.next!=null){
				nptr=nptr.next;
			}
			nptr.next=n1;
			size++;
		}
		}
		// position follows 0 indexing.
		public void insert(int position,int value){
			Node n1=new Node();
			n1.data=value;
			if(position==0){
				if(size==0){
					head=n1;
					size++;
				}
				else{
					n1.next=head;
					head=n1;
					size++;
			
				}
			}
			else{
				Node nptr=head;
				int count=0;
				while(count!=position-1){
					nptr=nptr.next;
					count++;
				}
				n1.next=nptr.next;
				nptr.next=n1;
				size++;
		}
		}
		public void delete(int position){
			if(position==0){
				head=head.next;
			}
			else{
				Node nptr=head;
				int count=0;
				while(count!=position-1){
					nptr=nptr.next;
					count++;
				}
				nptr.next=nptr.next.next;
			}
			size--;
		}
		public void display(){
			Node nptr=head;
			while(nptr!=null){
				System.out.println(nptr.data);
				nptr=nptr.next;
			}
		}	

	}
	public static class Stack{
		int[] s=new int[10000000];
		int front;
		public Stack(){
			front=-1;
		} 
		public int size(){
			return front+1;
		}
		public void push(int x){
			front++;
			s[front]=x;
		}
		public int pop(){
			int b=s[front];
			front--;
			return b;
		}
		public int peek(){
			return s[front];
		}
		public void display(){
			for(int i=front;i>=0;i--){
				System.out.println(s[i]);
			}
		}

	}
		









		}


