package no7_BuilderPattern;

public class Main {
	
	// Director ‚Éè‡‚ğ‹LÚ
	// SaltWater ‚ÉŞ—¿‚ğ‹LÚ
	// Ş—¿‚ğŒˆ‚ßADirector‚É“n‚·‚±‚Æ‚Å
	
	public static void main(String args[]){
		Builder builder = new SaltWaterBuilder();
		Director dir = new Director(builder);
		dir.constract();
		SaltWater saltWater = (SaltWater)builder.getResult();
		
		System.out.println(saltWater.salt);
		System.out.println(saltWater.water);
	}
}
