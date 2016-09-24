package no4_FactoryMethodPattern;

public class ImagawasCutPrint extends CutPrint {

	protected void draw(Cuttable hanzai){
		System.out.println("�G��`��");
	}
	
	protected void cut(Cuttable hanzai){
		System.out.println("��������");
	}
	
	protected void print(Cuttable hanzai){
		System.out.println("�v�����g����");
	}
	
	protected Cuttable createCuttable(){
		return new Potato();
	}
	
}
