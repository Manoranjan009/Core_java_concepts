package com.cglia.training.oops;

class Students{
	int rollno;
	String name;
	static String mentor;
	
	static {                         //when you load a class static value is stored in classloader area
		mentor="Mishra sir";
	}
	Students(){                     // when you create a object it is stored in heap area
		rollno=1;
		name="Nobody";
	}
	public void show() {
		System.out.println(rollno +" "+name+" "+mentor);
	}
	public static void mark() {
		System.out.println(mentor +" give 80 mark");        //static method only accept static data else it will show error.
	}
}

public class Static {

	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.rollno=3;
		s1.name = "Bunty";
		Students.mentor="Deepak sir";     // we can access through class name , no need to specify obj.
		
		Students s2 = new Students();
		s2.rollno=5;
		s2.name="Vishal";
		
		s1.show();
		s2.show();
		
		Students.mark();              //for static method we don't need to create a object of it.
	}

}
