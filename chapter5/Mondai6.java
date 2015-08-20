import java.io.*;

public class Mondai6{
	public static void main(String[] args){
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("which do you like? choose a or b.(a:orange, b:coffe)");
			String line = r.readLine();

			switch(line){
				case "a":
				System.out.println("I like it, too");
				break;
				case "b":
				System.out.println("Uhnnnn");
				break;
				default:
				System.out.println("no no");
				break;
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}