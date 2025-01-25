package yoking.exercise8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class registerUser {

	public static String registerUser (String name, int age, String mail) {
		
		StringBuilder data = new StringBuilder ();
		data.append("name:"+name+ "\n");
		data.append("age:"+age+ "\n");
		data.append("mail:"+mail+ "\n");
		
		try (FileWriter writer = new FileWriter ("File.data")){
			writer.write(data.toString());
		}catch(IOException e) {
			
		}
		
		
		return data.toString();
		
	}
	
	
}
