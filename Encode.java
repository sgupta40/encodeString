
/**
 * This class established basis of program that shifts characters in string by
 * one space
 *
 * @author sgupta40
 * @version 2/20/19
 */
public class Encode
{
    String original;
    StringBuilder modified;
    
    public Encode(String inString)
    {
        original = inString;
        modified = new StringBuilder(inString);
        
    }
    
    public void shift()
    {
        char tempChar;
        for(int i = 0; i < original.length();i++)
        {
            tempChar = original.charAt(i);
            tempChar = (char)(tempChar+1);
            modified.setCharAt(i, tempChar);
        }
    }
    
    public String getOriginalString()
    {
        return original;
    }
    public String getModifiedString()
    {
        return modified.toString();
    }
    public String toString()
    {
        return "Original: " + original +
                    "\n" + "Modified: " + modified;
    }
}
