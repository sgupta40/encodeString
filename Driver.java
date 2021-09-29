import java.util.*;
/**
 * THis class attains all variables needed for Encode class
 *
 * @author Sgupta40
 * @version 2/20/20
 */
public class Driver
{

    public static void main(String[] args)
    {

        String original;
        Encode object;
        Scanner input = new Scanner(System.in);
        char rec = 'y';
        while(rec == 'Y' || rec == 'y')
        {
            System.out.println("Please type a sentence: ");
            original = input.nextLine();


            object = new Encode(original);
            
            object.shift();
            
            System.out.println(object.toString());
            
            System.out.println("");
            
            System.out.println("Would you like to repeat the program: ");
            rec = input.next().charAt(0);
        }
        System.out.println("Thank You");
    }
}
