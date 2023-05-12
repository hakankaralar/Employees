
public class Engineer extends Employee {
    private String languages;

    
    public Engineer(String name, String surname, int id, String languages) {
        super(name, surname, id);
        this.languages = languages;
        
    }

    public void displayInformation() {
        super.displayInformation(); 
        System.out.println("Language known by enginner: " + languages);
        
    }
    public void format(String operating_system) {
        System.out.println(getAd() + " " + operating_system + " upload ");
    }
    
    
    
}
