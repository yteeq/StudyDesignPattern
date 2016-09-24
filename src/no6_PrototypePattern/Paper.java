package no6_PrototypePattern;

public class Paper implements Clonable {
	private String name;
	public Paper(){}
	public Paper(String name){
		this.name = name;
	}
	public Clonable createClone(){
		Paper newPaper = new Paper();
		newPaper.name = this.name;
		// newPaper �� this ���d�˂āAthis �̌`�ɐ؂蔲��
		return newPaper;
	}
}
