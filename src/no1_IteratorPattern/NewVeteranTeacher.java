package no1_IteratorPattern;

public class NewVeteranTeacher extends Teacher{
    private NewVeteranStudentList list;
    public void createStudentList(){
        list = new NewVeteranStudentList();
        list.add(new Student("�֓��P��",1));
        list.add(new Student("��E�����b",2));
        list.add(new Student("�c�����i",1));
    }
    public void callStudents(){
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(((Student)itr.next()).getName());
        }
    }      
}