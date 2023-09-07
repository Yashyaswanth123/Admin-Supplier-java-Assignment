package calculator;

import java.util.function.BiConsumer;

public class Admin {

	public static void main(String[] args) {
			BiConsumer<String, Integer> bicon = (name,age) -> {
				if(name.equals("Admin")  && age> 30)
					System.out.println("True"); 
				else
					System.out.println("False");
				
			};
			bicon.accept("Admin", 35);
	}

}
