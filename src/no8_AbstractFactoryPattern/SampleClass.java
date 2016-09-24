package no8_AbstractFactoryPattern;

import java.util.*;

public class SampleClass{
	public static void main(String args[]){
		HotPot hotpot = new HotPot(new Pot());
		/* 書き換え
		hotpot.addSoup(new ChickenBonesSoup()); // 鶏がらスープ
		hotpot.addMain(new Chicken()); // メインとして鶏肉
		List<Vegetable> vegetables = new ArrayList<Vegetable>();
		vegetables.add(new ChineseCabbage()); // 白菜
		vegetables.add(new Leek()); // ねぎ
		vegetables.add(new Chrysanthemum()); // 春菊
		hotpot.addVegetables(vegetables);
		List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
		otherIngredients.add(new Tohu()); // 豆腐
		hotpot.addOtherIngredients(otherIngredients);
		*/
		
		// 利用するFactoryは引数で判定するようにしておく
		Factory factory = createFactory(args[0]);
		hotpot.addSoup(factory.getSoup());
		hotpot.addMain(factory.getMain());
		hotpot.addVegetables(factory.getVegetables());
		hotpot.addOtherIngredients(factory.getOtherIngredients());
	}
	private static Factory createFactory(String str){
		if("キムチ鍋".equals(str)){
			return new KimuchiFactory();
		}else if("すき焼き".equals(str)){
			return new SukiyakiFactory();
		}else{
			return new MizutakiFactory();
		}
	}
}
