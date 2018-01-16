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
    public static void main2(){
        String input, newInput, holder, translation = "";
        boolean run = true;
        Scanner in = new Scanner(System.in);
        System.out.println("What would you like to translate into Pig Latin? ");
        newInput = in.nextLine().trim();
        input = newInput;
        while (run){
            int spacePos = input.indexOf(" ");
            if (spacePos == -1){
                spacePos = input.length();
            }
            holder = input.substring(0, spacePos);
            if (spacePos == input.length()){
                spacePos = -1;
            }
            input = input.substring(spacePos + 1, input.length());
            holder = holder.substring(1, holder.length()) + holder.substring(0,1) + "ay";
            translation += holder + " ";
            if (input.length() <= 0){
                run = false;
            }
        }
        System.out.println("You translated\n    " + newInput + "\nto\n    " + translation);
    }
}