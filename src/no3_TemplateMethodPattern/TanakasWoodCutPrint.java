package no3_TemplateMethodPattern;

public class TanakasWoodCutPrint extends WoodCutPrint {

	@Override
	public void draw(Cuttable hanzai) {
		System.out.println("ŠG‚ğ•`‚­");
	}

	@Override
	public void cut(Cuttable hanzai) {
		System.out.println("’¤‚·‚é");
	}

	@Override
	public void print(Cuttable hanzai) {
		System.out.println("ƒvƒŠƒ“ƒg‚·‚é");
	}
	
}
