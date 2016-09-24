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
		// newPaper ‚Æ this ‚ğd‚Ë‚ÄAthis ‚ÌŒ`‚ÉØ‚è”²‚­
		return newPaper;
	}
}
