
public class BuddyInfo {
	private String name;
	private String address;
	private String phoneNumber;
	private int age;
	private int rank;
	public BuddyInfo (String name, String address, String phoneNumber, int age) {
		this.name=name;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.age=age;
	}
	public BuddyInfo (String name, String address, String phoneNumber, int age, int rank){
		this.name=name;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.age=age;
		this.rank=rank;
	}
	public void changeRanking (int boosterism) {
		rank +=boosterism;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {//if this were to be used in an application where the phone number is used, then change type to int
		return address;
	}
 	public String getphoneNumber() {
		return phoneNumber;
	}
	public int getAge() {//age increments each year so ability to easily change as integer is good.
		return age;
	}
	public int getRank() {//friends may climb the ladder which is my personal ranking of them
		return rank;
	}
	public void ageIncrementor() {
		age++;
	}
}
