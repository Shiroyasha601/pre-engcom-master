
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Menuall extends BookInheritance{
    private String[] Ma= {"1. Math Vary Fast ", "2. Math New Bie "};
    private String[] Ca= {"3. Car Vary Fast ", "4. Car New Bie "};
    private String[] An= {"5. Animal Vary Fast ", "6. Animal New Bie "};
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> AB = new ArrayList<String>();
    private ArrayList<String> BC = new ArrayList<String>();
    private int many = 0;
    private int i = 0;
    private int day = 0;
    private int k = 0;
    private int[] hab = new int[6];

	returnAbook comeback = new returnAbook();
	returnAbook Math=new returnAbook();
	returnAbook Car=new returnAbook();
	returnAbook Animal=new returnAbook();

	public void test1(){
		String[] name = {"1. Math", "2. Car", "3. Animal", "4. Exit"};
		printArray(name);

	}
	
	public void test2(){
		Math.Catagory("1. Math Vary Fast ", "2. Math New Bie");

	}
	
	public void test3(){
		Car.Catagory("3. Car Vary Fast ", "4. Car New Bie ");

	}
	
	public void test4(){
		Animal.Catagory("5. Animal Vary Fast ", "6. Animal New Bie ");

	}
    public void howbook(){
        System.out.print("How many book ");
        many = scanner.nextInt();
        
        int[] array = new int[many];
        for (k = 0; k < array.length;k++){
            System.out.print("Choose: ");
            hab[k] = scanner.nextInt();
            if(hab[k] == 1){
                AB.add(Ma[0]);
                BC.add(Ma[0]);
                getBook1Name();
                getBook1ID();
                getBook1Price();
            }
            if(hab[k] == 2){
                AB.add(Ma[1]);
                BC.add(Ma[1]);
                getBook2Name();
                getBook2ID();
                getBook2Price();
            }
            if(hab[k] == 3){
                AB.add(Ca[0]);
                BC.add(Ca[0]);
                getBook3Name();
                getBook3ID();
                getBook3Price();
            }
            if(hab[k] == 4){
                AB.add(Ca[1]);
                BC.add(Ca[1]);
                getBook4Name();
                getBook4ID();
                getBook4Price();
            }
            if(hab[k] == 5){
                AB.add(An[0]);
                BC.add(An[0]);
                getBook5Name();
                getBook5ID();
                getBook5Price();
            }
            if(hab[k] == 6){
                AB.add(An[1]);
                BC.add(An[1]);
                getBook6Name();
                getBook6ID();
                getBook6Price();
            }
            
            
        }
        
    }

    public void CartBook(){
        System.out.println("List of Book");
        for ( int i = 0; i < AB.size(); i++ ){
            System.out.println(AB.get(i));
        }


    }

    public void ConfriminCart(){
        System.out.print("Confirm Orders Yes/Back to Menu /Del ");
        char confirm = scanner.next().charAt(0);

        if(confirm == 'Y' ){
            cm.warings();
            System.out.print("Input Day " );
            day = scanner.nextInt();
            if(true){
                day = day + 7;
                int day7 = 7;
                if(day >= 31){
                    day = 1;
                    day += day7;
                    System.out.println("Return a book" + day);
                }
                else{
                    System.out.println("Return a book " + day);

                }
            }
            System.out.println("Don't return a book, have to pay");
            System.out.println("Finish");
            AB.clear();
            
        }
        if(confirm == 'B'){
            
        }
        if(confirm == 'D' ){
            System.out.println("Cancel Order");
            i = 0;
            AB.clear();
            BC.clear();
        }
    }

    public void hosity(){
        System.out.println("Hosity of Book");
        for ( int i = 0; i < BC.size(); i++ ){
            System.out.println(BC.get(i) + " Date return a book  "+ day);
        }

    }

    public void givebook(){
        for ( int i = 0; i < BC.size(); i++ ){
            System.out.println(BC.get(i) + day);
        }
        
        System.out.print("Choose for give book : ");
        int give = scanner.nextInt();
        if(give == 1){
            BC.remove(Ma[0]);
        }
        if(give == 2){
            BC.remove(Ma[1]);
        }
        if(give == 3){
            BC.remove(Ca[0]);
        }
        if(give == 4){
            BC.remove(Ca[1]);
        }
        if(give == 5){
            BC.remove(An[0]);
        }
        if(give == 6){
            BC.remove(An[1]);
        }
        if(give >= 1){
            System.out.print("The date of the return a book?: ");
            int returndate = scanner.nextInt();
            int overdue = returndate - day;
            int mulct = overdue * 100;
            if( returndate >= day){
                System.out.println("Price per book " + mulct);
                System.out.print("Do you want to pay? Y/D ");
                char want = scanner.next().charAt(0);
                if(want == 'Y'){
                    
                    System.out.print("How much to pay?: ");
                    int pay = scanner.nextInt();
                    if(pay >= l){
                        System.out.println("Paided");
                        System.out.println("Change money " + (pay-mulct));
                    }else{
                        System.out.println("Pay too little!");
                    }
                }
                else{
                    System.out.println("Not Paid!");
                }
            }
            if( returndate <= day){
                System.out.println("Thank You");
            }
        }
        if(give <= 0){
            System.out.println("No Data!");
        }
    }
    public void printArray(String[] name){
        for(int i = 0; i < name.length; i++){
            System.out.print(name[i]+ " ");
            System.out.println();
        }
    } 
}
