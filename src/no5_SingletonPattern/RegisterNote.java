package no5_SingletonPattern;

public class RegisterNote {
	// static�Ő錾���邱�ƂŃC���X�^���X�͂����������݂��Ȃ��悤�ɂ��Ă���
	private static RegisterNote registerNote = new RegisterNote();
	// �R���X�g���N�^��ptivate�ɂ��邱�ƂŊO������C���X�^���X�𐶐��ł��Ȃ�����B
	private RegisterNote(){};
	// �C���X�^���X�𐶐�����Ƃ���getInstance���\�b�h�����s����K�v������B
	public static RegisterNote getInstance(){
		return registerNote;
	}
}
