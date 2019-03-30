package section5;

import java.util.Arrays;

public class MyArrayList<E> {
	private static final int INIT_CAPACITY = 10;
	private E [] theData;
	private int size;
	private int capacity = 0;
	
	public MyArrayList() {
//		theData = new E [INIT_CAPACITY]; NOT Working Generic Type Can't be new
		theData = (E []) new Object [INIT_CAPACITY];
		size = 0;
		capacity = INIT_CAPACITY;
	}
	
	public void add(int index, E anEntry) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if (size >= capacity) {
			reallocate();
		}
		for (int i = size -1 ; i >= index; i--) {
			theData[i+1] = theData[i];
		}
		
		theData[index] = anEntry;
	}
	
	private void reallocate() {
//		E [] tmp = (E []) new Object [INIT_CAPACITY];
		capacity *= 2;
		Arrays.copyOf(theData, capacity);
		
	}

	public void add(E anEntry) {
		
	}	
	
}
