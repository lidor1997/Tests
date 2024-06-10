 class Bird {
	public void sing() {
	System.out.println("Tweet Tweet Tweet");
	}
}
 
 

 class Robin extends Bird{
	 public void sing() {
			System.out.println("LA LA LA LA LA");
			}

 }
 
 class Pelican extends Robin{
	 public void sing() {	
			System.out.println("LA LA LA LA LA 2");
			}

	 
 }


public class PolyPractice{

	public static void main(String[] args) {
		Bird b = new Bird();
		b.sing();
		System.out.println("------------------------------");
		Robin r = new Robin();
		r.sing();
		System.out.println("------------------------------");
		Robin p= new Pelican();
		p.sing();
	}
}
