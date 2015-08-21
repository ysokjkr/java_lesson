public class StudentTest{
	public static void main(String[] args){
		Student[] data = {
			new Student("A-san", 65, 90, 100),
			new Student("B-san", 82, 73, 64),
			new Student("C-san", 74, 31, 42),
			new Student("D-san", 100, 95, 99),
		};
		for(int i = 0; i < data.length; i++){
		System.out.println(data[i] + "\t-> " + data[i].total());
		}
	}
}