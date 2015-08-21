public class Mondai8{
	public static void main(String[] args){
		int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
		System.out.println("befor sort");
		for (int i = 0; i < data.length; i++){
			System.out.println(data[i] + " ");
		}
		System.out.println("");
		for(int i = 0; i < data.length; i++){
			for(int j = i + 1; j < data.length; j++){
				if(data[i] > data[j]){
					int c = data[i];
					data[i] = data[j];
					data[j] = c; 
				}

			}
		}
		System.out.println("after sort");
		for (int i = 0; i < data.length; i++){
			System.out.println(data[i] + " ");
		}
		System.out.println("");
	}
}
