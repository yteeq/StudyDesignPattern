package no1_IteratorPattern;

public class VeteranTeacher extends Teacher{
    private MyStudentList list;
    public void createStudentList(){
        list = new MyStudentList(3);
        list.add(new Student("����Y��",1));
        list.add(new Student("���b��",2));
        list.add(new Student("�������Y",1));
    }
    public void callStudents(){
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(((Student)itr.next()).getName());
        }
    }      
}