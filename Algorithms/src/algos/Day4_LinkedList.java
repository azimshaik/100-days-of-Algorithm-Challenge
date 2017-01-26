package algos;

//Add element at Head
public class Day4_LinkedList {
	public static Node head = null;
	int lenght;
	Day4_LinkedList(){
		
	}
    public class Node {
    	int data;
    	Node next;
    	Node(int data){
    		this.data = data;
    		this.next = null;
    	}
    	Node(int data, Node next){
    		this.data = data;
    		this.next = next;
    	}

    }
    public void addAtFirst(int data){
    	if(head==null){
    		head = new Node(data);
    		}else{
    			Node temp = new Node(data);
    			temp.next = head;
        		head = temp;	
    		}
    }
    public void addAtTail(int data){
    	Node temp = head;
    	while(temp.next!=null){
    		temp = temp.next;
    	}
    	temp.next = new Node(data);
    }
    public static void show(){
    	Node temp = head;
    while(temp!=null){
    	System.out.println(temp.data);
    	temp = temp.next;
    }
    	
    }
    public static void main(String[] args) {
    	Day4_LinkedList ll = new Day4_LinkedList();
    	ll.addAtFirst(12);
    	ll.addAtFirst(1278);
    	ll.addAtFirst(4556);
    	ll.addAtFirst(67);
    	ll.addAtTail(6787);
    	ll.addAtTail(756);
    	ll.show();
    }
}
