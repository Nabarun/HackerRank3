import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reader {
	public static void main(String[] args) {
        int count =0;
        String str = "";
        
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
        	while((str = reader.readLine()) != null){
                System.out.println((count+1)+" "+str);
            }
        }
        catch(Exception ex){
        	
        }
    }
}
