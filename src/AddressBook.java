import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> addressBook;//binary search tree
	public AddressBook() {
		addressBook= new ArrayList<BuddyInfo>();
	}
	public static void main(String[] args) {
		BuddyInfo myBestFriend = new BuddyInfo("Imaginary Friend", "1405 Prince of Wales", "No Phone", 24, 1 );
		System.out.println("Hello, " + myBestFriend.getName());
		AddressBook myAddressBook= new AddressBook();
		if(myAddressBook.addBuddy(new BuddyInfo("John", "101 Carleton crescent", "5191234567890", 20))) {
			System.out.println("Contact added successfully");
		}
		if(myAddressBook.addBuddy(new BuddyInfo("Brian", "102 Carleton way", "6131234567890", 19))) {
			System.out.println("Contact added successfully");
		}
		if(myAddressBook.addBuddy(new BuddyInfo("Sarah", "201 Carleton street", "4161234567890", 22))) {
			System.out.println("Contact added successfully");
		}
		if(myAddressBook.removeBuddy("Brian")) {
			System.out.println("Contact removed successfully");
		}
		System.out.println("Address book");
		if(myAddressBook.addBuddy(new BuddyInfo("Jessica", "301 Carleton street", "1111234567890", 23))) {
			System.out.println("Contact added successfully");
		}
		if(myAddressBook.removeBuddy("Jessica")) {
			System.out.println("Contact removed successfully");
		}
	}
	public boolean addBuddy(BuddyInfo newBuddy) {
		addressBook.add(newBuddy);
		return true;
	}
	public boolean removeBuddy(String name) {
		for (BuddyInfo buddy:addressBook) {
			if (buddy.getName().compareTo(name)==0) {
				addressBook.remove(buddy);
				return true;
			}
		}
		return false;
	}
}
