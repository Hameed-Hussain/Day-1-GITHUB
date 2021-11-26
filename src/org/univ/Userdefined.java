package org.univ;

public class Userdefined {

	public static void main(String[] args) {
		
		 try {
			 throw new UserDefinedException();
			}
		 catch (UserDefinedException e) {
			System.out.println("exception handled");		
			}
	}
}
