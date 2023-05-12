
public class Employee {

    private String name;
    private String surname;
    private int id;

    public Employee(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getAd() {
        return name;
    }

    public void setAd(String ad) {
        this.name = name;
    }

    public String getSoyad() {
        return surname;
    }

    public void setSoyad(String soyad) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void displayInformation() {
        System.out.println("Employee Information");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Id: " + id);
        
    }
    
}
