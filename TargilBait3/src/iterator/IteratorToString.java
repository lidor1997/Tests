package iterator;

public class IteratorToString {

	public static String toString(MyIterator it) {
		StringBuilder s = new StringBuilder();
		s.append("[");
		while (it.hasNext()) {
			s.append(it.next());
			if (it.hasNext()) {
                s.append(" ");
            }
			
		}
		s.append("]");
		System.out.println(s);
		return s.toString();
		
	}

}
