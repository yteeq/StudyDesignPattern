package no6_PrototypePattern;

public class Teacher {
	public Paper[] createManyCrystals(){
		// プロトタイプ作成
		Paper prototype = new Paper("雪の結晶");
		drawCrystal(prototype);
		cutAccordanceWithLine(prototype);
		
		// プロとタイプ登録
		PrototypeKeeper prorotypeKeeper = new PrototypeKeeper();
		prorotypeKeeper.addClonable("雪の結晶", prototype);
		
		Paper[] papers = new Paper[100];
		for(int n=0;n<papers.length;n++){
			/* この部分はプロトタイプで先に作成
			drawCrystal(papers[n]);
			cutAccordanceWithLine(papers[n]);
			*/
			// あらかじめ用意しておいたプロトタイプを複製する
			// papers[n] = (Paper)prototype.createClone();
			// PrototypeKeeperクラスからプロトタイプを取って来るように書き換え
			papers[n] = (Paper)prorotypeKeeper.getClone("雪の結晶");
		}
		return papers;
	}
	private void drawCrystal(Paper paper){
		// きれいに描くため時間がかかる
	}
	private void cutAccordanceWithLine(Paper paper){
		// 描かれた線に沿ってきれいに切るには時間がかかる
	}
}
