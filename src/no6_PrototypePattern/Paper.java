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
		// newPaper と this を重ねて、this の形に切り抜く
		return newPaper;
	}
}
