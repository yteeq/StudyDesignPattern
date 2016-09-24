package no3_TemplateMethodPattern;

public class TanakasWoodCutPrint extends WoodCutPrint {

	@Override
	public void draw(Cuttable hanzai) {
		System.out.println("�G��`��");
	}

	@Override
	public void cut(Cuttable hanzai) {
		System.out.println("��������");
	}

	@Override
	public void print(Cuttable hanzai) {
		System.out.println("�v�����g����");
	}
	
}
