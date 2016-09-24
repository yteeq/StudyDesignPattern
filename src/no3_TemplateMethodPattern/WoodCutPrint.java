package no3_TemplateMethodPattern;

public abstract class WoodCutPrint {
	public abstract void draw(Cuttable hanzai);
	public abstract void cut(Cuttable hanzai);
	public abstract void print(Cuttable hanzai);
	private void createWoodCutPrint(){
		Wood hanzai = new Wood(); //Wood�N���X�́ACuttable�C���^�t�F�[�X���������Ă���
		draw(hanzai);
		cut(hanzai);
		print(hanzai);
	}
}
