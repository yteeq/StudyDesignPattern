package no8_AbstractFactoryPattern;

import java.util.*;

public class SampleClass{
	public static void main(String args[]){
		HotPot hotpot = new HotPot(new Pot());
		/* ��������
		hotpot.addSoup(new ChickenBonesSoup()); // �{����X�[�v
		hotpot.addMain(new Chicken()); // ���C���Ƃ��Č{��
		List<Vegetable> vegetables = new ArrayList<Vegetable>();
		vegetables.add(new ChineseCabbage()); // ����
		vegetables.add(new Leek()); // �˂�
		vegetables.add(new Chrysanthemum()); // �t�e
		hotpot.addVegetables(vegetables);
		List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
		otherIngredients.add(new Tohu()); // ����
		hotpot.addOtherIngredients(otherIngredients);
		*/
		
		// ���p����Factory�͈����Ŕ��肷��悤�ɂ��Ă���
		Factory factory = createFactory(args[0]);
		hotpot.addSoup(factory.getSoup());
		hotpot.addMain(factory.getMain());
		hotpot.addVegetables(factory.getVegetables());
		hotpot.addOtherIngredients(factory.getOtherIngredients());
	}
	private static Factory createFactory(String str){
		if("�L���`��".equals(str)){
			return new KimuchiFactory();
		}else if("�����Ă�".equals(str)){
			return new SukiyakiFactory();
		}else{
			return new MizutakiFactory();
		}
	}
}
