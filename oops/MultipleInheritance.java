package com.cglia.training.oops;

interface student1{
	void eat();
}
interface student2{
	void study();
}
class student implements student1,student2{
	public void eat() {
	System.out.println("The student should not eat much .");
}
	public void study() {
		System.out.println("The student should study hard .");
	}
}
public class MultipleInheritance { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s= new student();
		s.eat();
		s.study();
	}

}
