import java.io.*;

public class Mondai2 {
	public static void main(String[] args){
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("graph-number");
			String num = r.readLine();
			int x =  Integer.parseInt(num);
			printGraph(x);
		}catch(IOException e){
			System.out.println(e);
		}
	}
	public static void printGraph(int x){
		for(int i = -x ; i <=  x; i++){
			for(int j = 0; j < i * i; j++){
				System.out.print("*");
			}System.out.println("");
		}
	}
}