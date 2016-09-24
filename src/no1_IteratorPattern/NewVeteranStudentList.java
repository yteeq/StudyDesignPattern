package no1_IteratorPattern;

import java.util.Vector;

public class NewVeteranStudentList extends NewStudentList implements Aggregate {
	public NewVeteranStudentList(){
		students = new Vector<Student>();
	}
	
//	public NewVeteranStudentList(int studentCount){
//	}
	
	public int getSize(){
		return students.size();
	}
	
	public Iterator iterator(){
		return new NewVeteranStudentListIterator(this);
	}

}
