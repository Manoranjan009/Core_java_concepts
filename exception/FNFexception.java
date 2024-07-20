package com.cglia.training.exception;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FNFexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f =new FileReader("C:\\Users\\Lenovo\\Documents\\ABSTRACT.docx\\");
			System.out.println("Reading from file."+f.read());
			f.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex);
		}
		catch(IOException i) {
			System.out.println(i);
		}
        
	}

}
