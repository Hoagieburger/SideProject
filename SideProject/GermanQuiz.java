/**
 * Write a description of class GermanQuiz here.
 *
 * @author Joshua Hergenroeder
 * @version Eins
 */
import java.lang.Math;
import java.util.Scanner;
public class GermanQuiz{
    public static void main(){
        String[] english = {"woman", "man", "boy", "girl", "tree", "fire", "car", "door", "table", "ball", "north", "south", "east", "west", "house", "monkey", "blue", "black", "white", "red", "yellow", "green"};
        String[] deutsch = {"Fraulein", "Mann", "Junge", "Maedchen", "Baum", "Feuer", "Auto", "Tuer", "Tisch", "Ball", "Norden", "Sueden", "Osten", "Westen", "Haus", "Affe", "Blau", "Schwarz", "Weiss", "Rot", "Gestern", "Grun"};
        String yesList = "yes yea yas ja";
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        while (!stop){
            int index = (int)(Math.random() * english.length);
            System.out.println("Translate this into English\n    " + deutsch[index]);
            String response = input.nextLine().trim().toLowerCase();
            if (english[index].equals(response)){
                System.out.println("You are correct. ");
            }else{
                System.out.println("You are incorrect. ");
            }
            System.out.println("Would you like to try again? ");
            response = input.nextLine().trim().toLowerCase();
            if (yesList.indexOf(response) == -1){
                stop = true;
                System.out.println("Okay. Aufwiedersehen.");
            }
        }
    }
}