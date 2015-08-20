public class Mondai2{
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < i * i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		int i = 0;
		
		while(i  < 10){
			int j = 0;
			while(j < i * i){
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}
	}
}