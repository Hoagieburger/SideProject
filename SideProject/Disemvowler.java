/**
 * Write a description of class Disemvowler here.
 *
 * @author Joshua Hergenroeder
 * @version 30/11/17
 */
import java.util.Scanner;
public class Disemvowler
{
    public static void main(){
        String vowels = "aeiou ", output = "", voweled = "";
        Scanner input = new Scanner(System.in);
        System.out.print("What word do you want DISEMVOWELED? ");
        String userInput = input.next().toLowerCase();
        for (int i = 0; i < userInput.length(); i++){
            if (vowels.indexOf(userInput.substring(i, i + 1)) >= 0){
                voweled += userInput.substring(i, i + 1);
                output = userInput.substring(0, i) + userInput.substring(i + 1, userInput.length()) + " " + voweled;
                userInput = userInput.substring(0, i) + userInput.substring(i + 1, userInput.length());
            }
        }
        System.out.println(output);
    }
}