package no1_IteratorPattern;

import java.util.Vector;

public class NewStudentList {
	protected Vector<Student> students;
	public void add(Student student){
		students.add(student);
	}
	public Student getStudentAt(int index){
		return students.get(index);
	}
}
