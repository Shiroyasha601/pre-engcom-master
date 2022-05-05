
import java.util.Scanner;

public class returnAbook{
    Scanner scanner = new Scanner(System.in);
    char user;
    public void First(){
        Customer user = new Customer();
        while(true) {
            System.out.println("Welcome ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            if(choice == 1){
                user.register();
                
            }
            else if(choice == 2){
                user.Login();
                break;
            }
            else{
                System.out.println("No Choose");
                continue;
            }
        }
    }
    public void Warnings(){
        System.out.println("Don't lose the book");
        System.out.println("Exceeding the return date of the book, adjusted according to the date of the book, 100 per day");
        System.out.println("If not returned, adjust according to the price of the book.");
    }

    public void Catagory() {
        System.out.println("No Skill");
    }

    public void Catagory(String...Menu)
    {
        for (int i=0;i<Menu.length;i++) {
        System.out.println(Menu[i]);
        }
    } 
}
