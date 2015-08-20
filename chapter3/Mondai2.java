import java.io.*;

public class Mondai2{
	public static void main(String[] args){

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{

			System.out.println("your name1");
			String name1 = reader.readLine();
			System.out.println("your age1");
			String line1 = reader.readLine();
			int age1 = Integer.parseInt(line1);


			
			System.out.println("your name2");
			String name2 = reader.readLine();
			System.out.println("your age2");
			String line2 = reader.readLine();
			int age2 = Integer.parseInt(line2);

			double average_age = (age1 + age2) / 2.0;

			System.out.println("Average age of "+ name1+ " and "+ name2+ " is "+ average_age);

		}catch(IOException e){
			System.out.println(e);

		}catch (NumberFormatException e){
			System.out.println("It is not number");
		}
	}
}