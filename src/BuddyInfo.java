public class BuddyInfo {

    private String name;
    private String address;
    private String number;

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public BuddyInfo(){
        this("", "", "");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }


    public static void main(String[] args) {
        BuddyInfo newBuddy = new BuddyInfo("Homer", "Ottawa", "613-887-9823");
        String buddyName = newBuddy.getName();
        System.out.println("Hello " + buddyName + "!" );
    }
}