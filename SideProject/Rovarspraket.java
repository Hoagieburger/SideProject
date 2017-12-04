/**
 * Write a description of class Rovarspraket here.
 *
 * @author Joshua Hergenroeder
 * @version 29/11/17
 */
import java.util.Scanner;
public class Rovarspraket
{
    public static void main(){
        String ans = "", con = "bcdfghjlkmnpqrstvwxyz";
        Scanner input = new Scanner(System.in);
        System.out.print("What word would you like to translate into Rovarspraket? ");
        String userInput = input.next().trim().toLowerCase();
        for (int i = 0; i < userInput.length(); i++){
            if (con.indexOf(userInput.substring(i, i + 1)) >= 0){
                ans += userInput.substring(i, i + 1) + "o" + userInput.substring(i, i + 1);
            }else{
                ans += userInput.substring(i, i + 1);
            }
        }
        System.out.println("Your translated word is \"" + ans + "\".");
    }
}