import java.io.*;

public class Mondai3{
	public static void main(String[] args){
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("please write sentence.");
			String line = r.readLine();
			for(int i = 0; i < line.length(); i++){
				char code = line.charAt(i);
				System.out.println("Unicode of" + " \" " + code + " \" " + " is " + (int)code);
			}

		}catch(IOException e){
			System.out.println(e);
		}
	}
}