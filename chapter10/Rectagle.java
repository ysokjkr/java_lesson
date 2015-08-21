public class Rectagle{
	int width;
	int height;

	public Rectagle(int width, int height){
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString(){
		return "[" + width + "," height + "]";
	}
}