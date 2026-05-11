public class PersonalInfoProgramFinal {
    public static void main(String[] args) {
        // The 3 Instances
        PersonalInfoFinal me = new PersonalInfoFinal("Alber", "104 Bergen Ave", 22, "201-903-6060");
        PersonalInfoFinal friend1 = new PersonalInfoFinal("Francisco", "425 Beech St", 30, "908-855-7574");
        PersonalInfoFinal friend2 = new PersonalInfoFinal("Omar", "175 Chestnut St", 22, "809-963-4325");

        // Display the information using accessors
        displayInfo(me);
        displayInfo(friend1);
        displayInfo(friend2);
    }

    // Method for print the data
    public static void displayInfo(PersonalInfoFinal person) {
        System.out.println("------------------------------------");
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Age: " + person.getAge());
        System.out.println("Phone Number: " + person.getPhoneNumber());
    }
}
