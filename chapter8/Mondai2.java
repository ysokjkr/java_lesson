public class Mondai2{
	public static void main(String[] args){
	graph2(8);
	}

	public static void graph2(int y){
		for(int j = y; j > 0 ; j--){
			graph1(j * j);
		}
		for(int j = 0; j <= y; j++){
			graph1(j * j);
		}

		/*
	public static void garah2(int y){
		for(int j = -y; j <= y; j++){
			graph1( j * j);
		}
	}
		*/

	}
	public static void graph1(int x){
		for(int i = 0; i < x; i++){
			System.out.print("*");
		}System.out.println("");
	}


	/*
	public static void graph(int x){
		for(int i = 0; i < x; i++){
			for(int j = 0; j < i * i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	*/
	
}