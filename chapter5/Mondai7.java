import java.io.*;

public class Mondai7{
	public static void main(String[] arqs){
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("put number 0-2");
			String line = r.readLine();
			int number = Integer.parseInt(line);

			switch(number){
				case 0:
				System.out.println("San");
				break;
				case 1:
				System.out.println("Mon");
				break;
				case 2:
				System.out.println("Thu");
				break;
				default:
				System.out.println("from 0 to 2 !");
				break;
			}
		}
		catch(IOException e){ 
			System.out.println(e);
		}
		catch(NumberFormatException e){ 
			System.out.println("numer!!");
		}
	}
}