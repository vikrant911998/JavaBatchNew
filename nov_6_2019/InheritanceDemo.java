package nov_6_2019;


//SINGLE INHERITANCE

//Super Class or Base Class or Parent Class.
class Player{
	
	private String name;
	private int age;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}


//sub-class or Child class
class CricketPlayer extends Player{
	
	public void headShot() {
		System.out.println("Headshot method of CricketPlayer Class");
	}
	
}

class FootballPlayer extends Player{
	
}




public class InheritanceDemo {

	public static void main(String[] args) {
		
		CricketPlayer player1 = new CricketPlayer();
		player1.setName("Vikrant");
		
		player1.setAge(23);
		player1.setAddress("Rohini");
		
		player1.headShot();
		

	}

}
