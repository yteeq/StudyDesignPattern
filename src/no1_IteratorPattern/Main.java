package no1_IteratorPattern;

public class Main {
	public static void main(String args[]){
		
		System.out.println(" -----  you  -----");
		Teacher you = new MyTeacher();
		you.createStudentList();
		you.callStudents();
		
		System.out.println(" -----  veteran  -----");
		Teacher vt = new VeteranTeacher();
		vt.createStudentList();
		vt.callStudents();
		
		System.out.println(" -----  new veteran  -----");
		Teacher nvt = new NewVeteranTeacher();
		nvt.createStudentList();
		nvt.callStudents();
		
		
	}
}
