import java.io.*;

public class Mondai3{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	try{
	
		System.out.println("Waht time is it now?");
		String line = reader.readLine();
		int time = Integer.parseInt(line);

		if(0 <= time && time < 12 || time == 24){
			System.out.println("Goodmornig");
		}else if(time == 12){
			System.out.println("It is noon");
		}else if(12 < time && time <= 18){
			System.out.println("Goodevenig");
		}else if(18 < time && time < 24){
			System.out.println("Goodnignt");
		}else{
			System.out.println("it is out of date time");
		}
	}catch(IOException e){
			System.out.println(e);

		}catch (NumberFormatException e){
			System.out.println("it is not number.");
		}
	}
}