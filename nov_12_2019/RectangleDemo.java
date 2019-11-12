package nov_12_2019;

class Rectangle{
	private int length;
	private int breadth;
	
	public Rectangle(int a,int b){
		this.length = a;
		this.breadth = b;
	}
	
	public int Area() {
		return (this.length*this.breadth);
	}
}

public class RectangleDemo {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(10,20);
		Rectangle obj1 = new Rectangle(5,2);
		
		System.out.println(obj.Area());
		System.out.println(obj1.Area());

	}

}
