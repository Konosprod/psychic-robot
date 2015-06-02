package exemple2;

public abstract class JSONAble {
	
	//De type Object pour rester le plus large possible
	protected Object value;
	
	//Méthode qui permet de générer un JSON d'un objet
	public String tojson(String name) throws Exception
	{
		String s = "{";
		
		s += "\"" + name + "\":\"";
		
		//Récupère l'objet value de la Superclass
		//De IntegerValue, la Superclass étant
		//JSONAble, car c'est elle qui contient
		//Le champs value
		Object o = getClass().getSuperclass().getDeclaredField("value").get(this);
	
		s += o.toString();
		
		s += "\"}";
		
		return s;
	}
	
	//Récupère la valeur
	public Object getValue()
	{
		return value;
	}
}
