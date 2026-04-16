package OddOrEven;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven{
    static Scanner reader = new Scanner(System.in);
    static int myNumber;

    private static String checkOddOrEven(){
        return (myNumber%2 == 0)? "even": "odd";
    }

    private static void takeNumber(){
        print("Choose one number: ");
        myNumber = reader.nextInt();
    }

    private static void print(String... all){
        for(String i : all){
            System.out.print(i);
        }
    }

    public static void main(String args[]){  
        while (true) {
            try{
                takeNumber();
                print("Your number ", Integer.toString(myNumber), " is ",checkOddOrEven(), "\n");
                break;
            
            }
            catch(InputMismatchException e){
                print("The number cannot be a letter\n");
                reader.nextLine();
            }
        }
    }
}