package no5_SingletonPattern;

public class RegisterNote {
	// staticで宣言することでインスタンスはこれ一つしか存在しないようにしている
	private static RegisterNote registerNote = new RegisterNote();
	// コンストラクタをptivateにすることで外部からインスタンスを生成できなくする。
	private RegisterNote(){};
	// インスタンスを生成するときはgetInstanceメソッドを実行する必要がある。
	public static RegisterNote getInstance(){
		return registerNote;
	}
}
