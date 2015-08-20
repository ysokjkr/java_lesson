import java.io.*;

public class Mondai5{
	public static void main(String[] args){
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	
	try{
		System.out.println("1 or a = orange, 2 or b =coffe");
		String line = r.readLine();
		char c = line.charAt(0);

		if(c == '1' || c == 'a'){
			System.out.println("orange");
		}else if( c == '2' || c == 'b'){
			System.out.println("coffe ");
		}else{
			System.out.println("no-list");
		}
	}
	catch(IOException e){
		System.out.println(e);
	}
}
