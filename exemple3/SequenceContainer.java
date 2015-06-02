package exemple3;

import java.util.ArrayList;

public class SequenceContainer extends JSONAble {
	
	//private List<IntegerValue> value;
	
	@SuppressWarnings("unchecked")
	public SequenceContainer() {
		
		value = new ArrayList<IntegerValue>();
		
		((ArrayList<IntegerValue>) value).add(new IntegerValue(1));
		((ArrayList<IntegerValue>) value).add(new IntegerValue(2));
		((ArrayList<IntegerValue>) value).add(new IntegerValue(3));
	}
	
}
