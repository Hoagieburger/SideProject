/**
 * Write a description of class Runner here.
 *
 * @author Joshua Hergenroeder
 * @version 16 January 2018
 */
import java.util.Scanner;
public class Runner
{
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("What program would you like to run? ");
        String response = input.nextLine().trim().toLowerCase();
        if (response.equals("PigLatin")){
            PigLatin.main2();
        }else if (response.equals("Rovarspraket")){
            Rovarspraket.main();
        }else if (response.equals("Disemvowler")){
            Disemvowler.main();
        }else if (response.equals("GermanQuiz")){
            GermanQuiz.main();
        }
    }
}