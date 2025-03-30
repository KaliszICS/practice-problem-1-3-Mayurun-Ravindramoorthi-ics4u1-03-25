import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.print(readFile("file.txt"));
	}
	   public static String readFile(String filename) {
        StringBuilder content = new StringBuilder();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }
	public static String backwardsReadFile(String filename){
		StringBuilder centent = new StringBuilder();
	try {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String line;
		while ((line=reader.readLine())!= null) 
		{centent.append(line).append("\n");
			
		}
		reader.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return centent.reverse().toString();
	}
}
