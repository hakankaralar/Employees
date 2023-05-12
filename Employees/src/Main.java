
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to employee programme ");
        String process1 = " Process...\n"
                       + "1. Engineer Process \n "
                       + "2. Manager Process\n "
                       + "Press q for quit ";
        System.out.println("**************************");
        System.out.println(process1);
        System.out.println("**************************");
        
        while(true) {
            System.out.print("Select the choose : ");
            String process = scanner.nextLine();
            
            if(process.equals("q")) {
                System.out.println("Quit from the programme");
                break;
                
            }
            else if(process.equals("1")) {
                Engineer engineer = new Engineer("Hakan", "Karalar", 1999, "java");
                String enginner_process = "1. Format\n"
                                        + "2. Display Infomation\n"
                                        + "Press q for quit ";
                System.out.println(enginner_process);
                
                while(true) {
                    System.out.print("Select the choose...");
                    String e_process = scanner.nextLine();
                    
                    if(e_process.equals("q")) {
                        System.out.println("Quit from the  enginner process...");
                        break;
                    }
                    else if(e_process.equals("1")) {
                        System.out.println("Operating System : ");
                        String operatingsystem = scanner.nextLine();
                        engineer.format(operatingsystem);
                        
                    }
                    else if(e_process.equals("2")) {
                        engineer.displayInformation();
                        
                    }
                    else {
                        System.out.println("Invalid operation...");
                        
                    }
                       
                }
              
            }
            else if(process.equals("2")) {
                
                Manager manager = new Manager("Alper"," Karalar", 2000, 50);
                String manager_process = "Manager Process.\n"
                                      + "1.Raise \n"
                                      + "2.Display Information.\n"
                                      + "Press q for quit.";
                System.out.println(manager_process);
                
                while(true) {
                    System.out.print("Select the choose : ");
                    String m_process = scanner.nextLine();
                     
                    if(m_process.equals("q")) {
                        System.out.println("Quit from the  manager process...");
                        break;
                        
                    }
                    else if(m_process.equals("1")) {
                        System.out.println("How much do you want manager to raise ");
                        int amountofraise = scanner.nextInt();
                        scanner.nextLine();
                        manager.raise(amountofraise);
                        
                    }
                    else if(m_process.equals("2")) {
                        manager.displayInformatin();
                       
                    }
                    else {
                        System.out.println("Invalid operation...");
                        
                    }
                }
                
            }
            else {
                System.out.println("Invalid operation...");
                
            }
            
            
        }
       
        
    }
}
