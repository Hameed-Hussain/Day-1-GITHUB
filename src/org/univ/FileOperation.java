package org.univ;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Admin\\Documents\\Task Day 1\\java\\java.txt");
		
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		
		boolean canRead = f.canRead();
		System.out.println(canRead);
		
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		
		boolean exists = f.exists();
		System.out.println(exists);
		
		boolean file = f.isFile();
		System.out.println(file);
		
		boolean directory = f.isDirectory();
		System.out.println(directory);
		
		
		System.out.println("Hameed");
		System.out.println("Hameed");
		System.out.println("Hameed");
		System.out.println("Hussain");
		System.out.println("Hussain");
		System.out.println("Hussain");

		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
