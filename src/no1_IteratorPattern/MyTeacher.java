package no1_IteratorPattern;

public class MyTeacher extends Teacher {
	
	private MyStudentList studentList;
	
	public void createStudentList(){
		studentList = new MyStudentList(5);
		studentList.add(new Student("Ôˆä—º‘¾",1));
		studentList.add(new Student("Ô‰H—¢”ü",2));
		studentList.add(new Student("‰ª“c”ü‰›",2));
		studentList.add(new Student("¼Xr‰î",1));
		studentList.add(new Student("’†–ìX—æØ",2));
	}
	
	public void callStudents(){

		 for(int i=0; i<studentList.getLastNum(); i++){
			Student student = studentList.getStudentAt(i);
			System.out.println(student.getName() + " : " + student.getSex());
		}
		
	}
	
}
