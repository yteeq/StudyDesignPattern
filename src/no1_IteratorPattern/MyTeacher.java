package no1_IteratorPattern;

public class MyTeacher extends Teacher {
	
	private MyStudentList studentList;
	
	public void createStudentList(){
		studentList = new MyStudentList(5);
		studentList.add(new Student("�Ԉ䗺��",1));
		studentList.add(new Student("�ԉH����",2));
		studentList.add(new Student("���c����",2));
		studentList.add(new Student("���X�r��",1));
		studentList.add(new Student("����X���",2));
	}
	
	public void callStudents(){

		 for(int i=0; i<studentList.getLastNum(); i++){
			Student student = studentList.getStudentAt(i);
			System.out.println(student.getName() + " : " + student.getSex());
		}
		
	}
	
}
