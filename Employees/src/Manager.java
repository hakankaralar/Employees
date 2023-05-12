
public class Manager extends Employee { 
    private int number_of_responsible_person;
    
    public Manager(String name, String surname, int id, int number_of_responsible_person) {
        
        super(name, surname, id);
        this.number_of_responsible_person = number_of_responsible_person;
        
    }

    
    public void displayInformatin() {
        super.displayInformation();
        System.out.println("Number of people the manager is responsible for : " + number_of_responsible_person);
        
    }
    public void raise(int amountofraise) {
        System.out.println(getAd() + " give employee " + amountofraise + " raise "  );
    }
    
}
