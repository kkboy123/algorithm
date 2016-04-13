package kkboy.com;

public class AraayLinkList_que {
	
	private static int max_length = 10;
	private static int[] mylist = new int[max_length];;
	private static int head=0;
	private static int tail=0;

	public static void main(String[] args) {
		traverse();
		pop();
		push(12);
		pop();
		push(22);
		push(32);
		push(62);
		push(82);
		traverse();
		pop();
		push(92);
		traverse();
		pop();
		traverse();
		pop();
		traverse();
	}

	public static boolean isEmpty() {
		return head == tail;
	}
	
	public static void pop(){
		if (!isEmpty()) {
			System.out.println("you pop " + mylist[head]);
			head  = mylist[head+1];
			//status();
		} else {
			System.out.println("the list is empty");
		}
	}
	
	public static void push(int value){
		int next_tail= (tail +2) % max_length;
		mylist[tail] = value;
		mylist[tail+1] = next_tail;
		tail  = next_tail;
		System.out.println("you push "+value);
		//status();
	}
	
	public static void traverse() {
		if (!isEmpty()) {
			int index = head;
			for(int i=0; i< count(); i+=2)
			{
				System.out.print(mylist[index]+",");
				index = mylist[index+1];
			}
			System.out.println("");
		} else {
			System.out.println("the list is empty");
		}
	}
	
	private static int count() {
		if (isEmpty()) {
			return 0;
		}
		if (head > tail) {
			return max_length + tail - head;
		} else {
			return tail -head;
		}
	}
	public AraayLinkList_que() {
		// TODO Auto-generated constructor stub
	}private static void status() {
		System.out.println("head: "+head+" ; tail: "+tail);
		System.out.println("----------------------");
	}
}
