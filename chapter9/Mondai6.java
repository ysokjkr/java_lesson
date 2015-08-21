public class Mondai6{
	public static void main(String[] args){
		String[] message = {"Goodmorinig", "Hello", "Goodevenig"};

		if(args.length !=1 ){
			System.out.println("how to use: java SelectGreeting number");
			System.exit(0);
		}

		int num = Integer.parseInt(args[0]);
		
		if (0 <= num && num < message.length) {
			System.out.println(message[num]);
		}else{
			System.out.println("number is 0 ~ " + (message.length - 1) + ".");
		}
	}
}