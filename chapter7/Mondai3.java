import java.io.*;

public class Mondai3{
	public static void main(String[] args){
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("<!DOCTYPE html>");
			System.out.println("<html>");
			System.out.println("<head>");
			System.out.println("<title>My Page</title>");
			System.out.println("/head");
			System.out.println("<body>");

			String line;

			while ((line = r.readLine()) != null){
				char c = line.charAt(0);
				String line1 = line.substring(1);
				
				if(c == '#'){
					System.out.println("<h1>" + line1 + "</h1>");
				}else if(c == '$'){
					System.out.println("<h2>" + line1 + "</h2>");
				}else
				System.out.println("<p>" + line + "<p>");
			}

			System.out.println("/body");
			System.out.println("<html>");

		}catch(IOException e){
			System.out.println(e);
		}

	}
}