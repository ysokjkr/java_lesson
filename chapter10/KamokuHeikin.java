public class kamoku{
	String name;
	int score;


/*
kamoku kokugo = new kamoku();
kokugo.name = "japanese";
kokugo.score = 63;
*/
	public kamoku(String name, int score){
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString(){
		return "name " + name + "score" + score; 
	}
}
public class KamokuHeikin{
	public static void main(String[] args){
		kamoku[] Kamoku = {
			new Kamoku("japanese", 63),
			new Kamoku("science", 90),
			new Kamoku("math", 75),
			new Kamoku("english", 60),
		};
		int som = 0;
		for(int i = 0; i < kamoku.length; i++){
			System.out.println(kamoku[i]);
			sum += kamoku[i].tensuu;
		}
		double heikin = (double)sum / kamoku.length;
		System.out.println("average is " + heikin)
	}
}



