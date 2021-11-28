package org.univ;

public class Singleton {

	static Singleton c ;
	
	private static Singleton collegeName() {
		System.out.println("college name is saveetha");
		int ea1 = System.identityHashCode(c);
		System.out.println(ea1);
		
		if (c==null){
			c = new Singleton();
		int ea2 = System.identityHashCode(c);	
		System.out.println(ea2);
		}
		
        return c;
	}
	private void collegeId() {
		System.out.println("ID is AdcyG568923");
	}
	private void collegeDeen() {
		System.out.println("Deen is Mrs.Batra");
	}
	public static void main(String[] args) {
		Singleton a = collegeName();
	    int ea3 = System.identityHashCode(a);
	    System.out.println(ea3);
	    
		Singleton b = collegeName();
		int ea4 = System.identityHashCode(b);
		System.out.println(ea4);
		
		a.collegeId();      a.collegeDeen();
		b.collegeId();      b.collegeDeen();
		c.collegeId();      c.collegeDeen();
		
	}
	private void sample() {
		// TODO Auto-generated method stub

	}
}
