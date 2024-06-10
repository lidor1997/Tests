package iterator;

import java.util.NoSuchElementException;

public class MyArray implements MyIterator {
	private int[] arr;
	private int i=0;
	public MyArray(int[] arr) {
		this.arr=arr;
	}

	@Override
	public boolean hasNext() {
		return i<arr.length;
	}

	@Override
	public int next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
			
		}
		return arr[i++];
	}

}
