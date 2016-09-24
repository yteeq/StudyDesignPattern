package no1_IteratorPattern;

public class NewVeteranStudentListIterator implements Iterator {
	private NewVeteranStudentList newVeteranStudentList;
	private int index;
	public NewVeteranStudentListIterator(NewVeteranStudentList list){
		this.newVeteranStudentList = list;
		this.index = 0;
	}
	public boolean hasNext(){
		if(newVeteranStudentList.getSize() > index){
			return true;
		}else{
			return false;
		}
	}
	public Student next(){
		Student s = newVeteranStudentList.getStudentAt(index);
		index++;
		return s;
	}
}
