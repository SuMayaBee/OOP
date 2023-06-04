
public class Square implements IShape {
	int side;
	
	@Override
	public void calculateArea() {
		System.out.println("Area: "+side*side);
	}
}
