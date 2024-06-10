package iterator;

public class Fibonacci implements MyIterator {
	private int upperBound;
	private int current;
	private int next;
	private boolean reachEnd;

	public Fibonacci(int upperBound) {
		this.upperBound=upperBound;
		this.current=1;
		this.next=1;
		this.reachEnd=false;
	}

	@Override
	public boolean hasNext() {
		return current<=upperBound;
	}

	public int next() {
	    if (!hasNext()) {
	        return current;
	    }
	    int result = current;
	    int temp = next;
	    next = result + temp;
	    current = temp;
	    return result;
	}
}
