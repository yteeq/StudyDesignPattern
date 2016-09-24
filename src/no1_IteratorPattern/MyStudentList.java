package no1_IteratorPattern;

public class MyStudentList extends StudentList implements Aggregate {
	public MyStudentList(){
		super();
	}
	
	public MyStudentList(int studentCount){
		super(studentCount);
	}
	
	public Iterator iterator(){
		return new MyStudentListIterator(this);
	}
}
