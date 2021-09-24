import java.util.ArrayList;

public class AddressBook {
    private ArrayList <BuddyInfo> addressList = new ArrayList<>();

    public void addBuddy(BuddyInfo newBuddy){
        addressList.add(newBuddy);
    }

    public void removeBuddy(BuddyInfo buddyInfo){
        for (BuddyInfo buddy : addressList){
            if (buddy.equals(buddyInfo)){
                addressList.remove(buddy);
            }
        }
    }

    //new method
    public ArrayList<BuddyInfo> getAddressList() {
        return addressList;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

        //Lab3 Update 11
        BuddyInfo buddy2 = new BuddyInfo("Tommy", "Ottawa", "613");
        addressBook.addBuddy(buddy2);
    }

}