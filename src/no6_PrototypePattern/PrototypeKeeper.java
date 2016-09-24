package no6_PrototypePattern;

import java.util.*;

/*
 * �v���ƃ^�C�v�𖼑O�œo�^���ĕێ����Ă������߂̃N���X
 */
public class PrototypeKeeper {
	private Map<String, Clonable> map;
	public PrototypeKeeper(){
		this.map = new HashMap<String, Clonable>();
	}
	public void addClonable(String key, Clonable prototype){
		map.put(key, prototype);
	}
	public Clonable getClone(String key){
		Clonable prototype = map.get(key);
		return prototype.createClone();
	}
}
