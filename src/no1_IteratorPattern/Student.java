package no1_IteratorPattern;

public class Student {
	private String name;
	private int sex; // �j�̎q:1 ���̎q:2
	
	public Student(String name, int sex){
		this.name = name;
		this.sex = sex;
	}
	
	public String getName(){
		return name;
	}
	
	public int getSex(){
		return sex;
	}
	
}
