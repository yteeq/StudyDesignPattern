package no7_BuilderPattern;

public class Main {
	
	// Director �Ɏ菇���L��
	// SaltWater �ɍޗ����L��
	// �ޗ������߁ADirector�ɓn�����Ƃ�
	
	public static void main(String args[]){
		Builder builder = new SaltWaterBuilder();
		Director dir = new Director(builder);
		dir.constract();
		SaltWater saltWater = (SaltWater)builder.getResult();
		
		System.out.println(saltWater.salt);
		System.out.println(saltWater.water);
	}
}
