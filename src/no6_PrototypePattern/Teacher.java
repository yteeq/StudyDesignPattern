package no6_PrototypePattern;

public class Teacher {
	public Paper[] createManyCrystals(){
		// �v���g�^�C�v�쐬
		Paper prototype = new Paper("��̌���");
		drawCrystal(prototype);
		cutAccordanceWithLine(prototype);
		
		// �v���ƃ^�C�v�o�^
		PrototypeKeeper prorotypeKeeper = new PrototypeKeeper();
		prorotypeKeeper.addClonable("��̌���", prototype);
		
		Paper[] papers = new Paper[100];
		for(int n=0;n<papers.length;n++){
			/* ���̕����̓v���g�^�C�v�Ő�ɍ쐬
			drawCrystal(papers[n]);
			cutAccordanceWithLine(papers[n]);
			*/
			// ���炩���ߗp�ӂ��Ă������v���g�^�C�v�𕡐�����
			// papers[n] = (Paper)prototype.createClone();
			// PrototypeKeeper�N���X����v���g�^�C�v������ė���悤�ɏ�������
			papers[n] = (Paper)prorotypeKeeper.getClone("��̌���");
		}
		return papers;
	}
	private void drawCrystal(Paper paper){
		// ���ꂢ�ɕ`�����ߎ��Ԃ�������
	}
	private void cutAccordanceWithLine(Paper paper){
		// �`���ꂽ���ɉ����Ă��ꂢ�ɐ؂�ɂ͎��Ԃ�������
	}
}
