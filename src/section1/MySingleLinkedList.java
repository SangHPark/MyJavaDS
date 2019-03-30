package section1;

public class MySingleLinkedList <T> {
	public Node<T> head;
	public int size;
	
	public MySingleLinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirst(T item) {
//		T t = new T(); //not OK
//		T[] array = new T [100]; //not OK
		Node <T> newNode = new Node<T>(item);  // T: type parameter, OK
//		Node <T> [] arr = new Node<T> [100]];  // not OK
		
		newNode.next = head;
		head = newNode;
		size ++;
	}
	
	public void addAfter(Node<T> before, T item) {
		Node<T> temp = new Node<T>( item );
		temp.next = before.next;
		before.next = temp;
		size ++;
	}
	
	public T removeFirst() {
		if (head == null) {
			return null;
		}
		
			T temp = head.data;
			head = head.next;
			size --;
			return temp;
	}
	
	public T removeAfter(Node <T> before) {
		if (before == null) {
			return null;
		}
		
		T temp = before.next.data;
		before.next = before.next.next;
		size --;
		return temp;
	}
	
	public void add(int index, T item) { //insert
		if (index < 0 || index > size) {
			return;
		}
		if (index == 0) {
			addFirst(item);
		} 
		else {
			Node<T> q = getNode(index - 1);
			addAfter(q, item);
		}
	}
	
	public T remove(int index) {  //delete

		if (index < 0 || index >= size) {
			return null;
		}
		
		if (index == 0) {
			return removeFirst();
		}
		
		Node <T> prev = getNode(index - 1);
		return removeAfter(prev);
		
	}
	

	
	public int indexOf(T item) { //search
		Node <T> p = head;
		int index = 0;
		
		while(p != null) {
			if (p.data.equals(item)) {
				return index;
			}
			
			p = p.next;
			index ++;
		}
		
		return -1;
	}
	
	public Node <T> getNode(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		
		Node <T> p = head;
		for (int i = 0; i < index; i++) {
			p = p.next;
		}
		
		return p;
	}
	
	public T get(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
//		
//		Node <T> p = head;
//		for (int i = 0; i < index; i++) {
//			p = p.next;
//		}
//		
//		return p.data;
		return getNode(index).data;
	}
	
	
	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<>();
		list.add(0, "Saturdsay");
		list.add(1, "Friday");
		list.add(0, "Monday");             //M,S,F
		list.add(2, "Tuesday");            //M,S,T,F
		
		String str = list.get(2);          // str = "Tuesday"
		list.remove(2);            		   //M, S, F
		int pot = list.indexOf("Friday");  //pos = 2

	}

}
