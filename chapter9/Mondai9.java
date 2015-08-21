public class Mondai9{
	public static void main(String[] args){
		int[][] arr = {
			{3, 1, 4, 1,},
			{5, 9, 2,},
			{6, 5,},
			{3,},
		};
		printArray(arr);

		int[][] hu = {
			{3, 1, 4, 1,},
			{5, 9, 2,},
			{6, 5, 343414,41414,41414,414,1},
			{3,},
		};
		printArray(hu);
	}
	public static void printArray(int[][] box){
		System.out.println("{");
			for(int i = 0; i < box.length ; i++){
				System.out.print("{");
				for(int j = 0; j < box[i].length; j++){
					System.out.print(box[i][j] + ",");
				}
				System.out.println("},");
			}
		System.out.println("}");
	}
}