package no4_FactoryMethodPattern;

public abstract class CutPrint {

	// FacoryMethod
	// オブジェクト生成をnewで直接行わず、
	// factoryMethod(createMethod)を挟むことで、
	// インスタンス化をサブオブジェクトでも行えるようにするメソッド
	
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
