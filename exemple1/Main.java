package exemple1;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Class1 class1 = new Class1();
		
		//Affiche le nom de la class de class1 en ayant le chemin complet
		System.out.println(class1.getClass().getName());
		
		//Pour chaque champs déclarés dans la classe
		for(Field f : class1.getClass().getDeclaredFields())
		{
			//Affiche le nom de ces champs
			System.out.println(f.getName());
		}
	}

}
