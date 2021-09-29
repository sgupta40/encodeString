import java.util.*;
import java.io.*;
/**
 * This driver utilizes the file reader scanner as data input rather than console
 *
 * @author Sameer Gupta
 * @version 2/25/2020
 */
public class FileDriver
{
    public static void main(String[] args) throws IOException
    {
        String fileName; //filename of the input file
        String outFile; //name of produced text file
        Scanner userInput = new Scanner(System.in); //read filename from user
        Scanner file; //reading file
        PrintWriter pw = new PrintWriter("output.txt"); //write resulting code to file
        Encode encode; //Encode object
        String temp; //Line from file
        String shiftedLine; //shifted string

        System.out.println("Enter the Filename: ");
        fileName = userInput.next();
        
        file = new Scanner(new File(fileName)); //opening file for reading
        
        //While loop to read through file
        while(file.hasNext())
        {
            temp = file.nextLine(); //assigning temp string to sentence in file
            //System.out.println(temp);
            
            encode = new Encode(temp); //instantiating encode object using sentence form file
            
            encode.shift(); //perfoming letter shift
            
            shiftedLine = encode.getModifiedString(); //getting modified string
            //System.out.println(shiftedLine);
            
            pw.println(shiftedLine); //Printing shofted line to file
        }
        
        pw.close(); //Closign file
        file.close();
        
        System.out.println("Data is written");
    }
}
