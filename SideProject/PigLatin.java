/**
 * Write a description of class PigLatin here.
 *
 * @author Joshua Hergenroeder
 * @version 29/11/17
 */
import java.util.Scanner;
public class PigLatin
{
    public static void main(){
        String translatedVersion;
        Scanner input = new Scanner(System.in);
        System.out.print("What word would you like to translate into Pig Latin? ");
        String userInput = input.next().trim().toLowerCase();
        translatedVersion = userInput.substring(1,userInput.length()) + userInput.substring(0,1) + "ay";
        System.out.println("Your translation is \"" + translatedVersion + "\".");
    }
}