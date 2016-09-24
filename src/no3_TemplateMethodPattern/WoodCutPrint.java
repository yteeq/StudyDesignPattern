package no3_TemplateMethodPattern;

public abstract class WoodCutPrint {
	public abstract void draw(Cuttable hanzai);
	public abstract void cut(Cuttable hanzai);
	public abstract void print(Cuttable hanzai);
	private void createWoodCutPrint(){
		Wood hanzai = new Wood(); //Woodクラスは、Cuttableインタフェースを実装している
		draw(hanzai);
		cut(hanzai);
		print(hanzai);
	}
}
