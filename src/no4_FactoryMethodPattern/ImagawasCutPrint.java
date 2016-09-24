package no4_FactoryMethodPattern;

public class ImagawasCutPrint extends CutPrint {

	protected void draw(Cuttable hanzai){
		System.out.println("ŠG‚ğ•`‚­");
	}
	
	protected void cut(Cuttable hanzai){
		System.out.println("’¤‚·‚é");
	}
	
	protected void print(Cuttable hanzai){
		System.out.println("ƒvƒŠƒ“ƒg‚·‚é");
	}
	
	protected Cuttable createCuttable(){
		return new Potato();
	}
	
}
