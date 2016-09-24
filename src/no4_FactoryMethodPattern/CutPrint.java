package no4_FactoryMethodPattern;

public abstract class CutPrint {

	// FacoryMethod
	// �I�u�W�F�N�g������new�Œ��ڍs�킸�A
	// factoryMethod(createMethod)�����ނ��ƂŁA
	// �C���X�^���X�����T�u�I�u�W�F�N�g�ł��s����悤�ɂ��郁�\�b�h
	
    protected abstract void draw( Cuttable hanzai );
    protected abstract void cut( Cuttable hanzai );
    protected abstract void print( Cuttable hanzai );
    protected Cuttable createCuttable(){
    	return new Wood();
    }
    public void createCutPrint(){
        Cuttable hanzai = createCuttable();
        draw( hanzai );
        cut( hanzai );
        print( hanzai );
    }
	
}
