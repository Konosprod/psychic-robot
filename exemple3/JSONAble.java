package exemple3;

import java.util.List;

public abstract class JSONAble implements ValueComponent{
	
	protected Object value;
	
	@SuppressWarnings("unchecked")
	public String tojson(String name) throws Exception
	{
		String s = "{";
		String className = getClass().getName();
		Object f;
		
		if(className.contains("Sequence"))
		{
			f = getClass().getSuperclass().getDeclaredField("value").get(this);
			s += "\"" + name + "\":[";
			for(int i = 0; i < ((List<JSONAble>)f).size(); i++)
			{
				s += ((List<JSONAble>)f).get(i).tojson(String.valueOf(i));
				s += ",";
			}
			
			s = s.substring(0, s.length() - 1);
			
			s += "]}";
		}
		else
		{
			
			f = getClass().getSuperclass().getDeclaredField("value").get(this);
			s += "\"" + name + "\":\"" + f.toString()+"\"";
			
			s += "}";
		}
				
		return s;
	}
	
	public Object getValue()
	{
		return value;
	}
}
