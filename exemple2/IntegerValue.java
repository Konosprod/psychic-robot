package exemple2;

import exemple2.JSONAble;

public class IntegerValue extends JSONAble {
	
	public IntegerValue(int v) {
		
		//Créer un objet Integer pour value
		//value étant la valeur de la classe
		//JSONAble
		value = new Integer(v);
	}
}
