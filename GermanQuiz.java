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
        String[] english = {"yes", "no", "woman", "man", "boy", "girl", "tree", "fire", "car", "door", "table", "ball", "north", "south", "east", "west", "house", "monkey", "blue", "black", "white", "red", "yellow", "green", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "monday", "tuesday", "wensday", "thursday", "friday", "saturday", "sunday", "january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        String[] deutsch = {"Ja", "Nein", "Fraulein", "Mann", "Junge", "M\u00e4dchen", "Baum", "Feuer", "Auto", "T\u00fcr", "Tisch", "Ball", "Norden", "S\u00fcden", "Osten", "Westen", "Haus", "Affe", "Blau", "Schwarz", "Wei\u00df", "Rot", "Gestern", "Gr\u00fcn", "Null", "Eins", "Zwei", "Drei", "Vier", "F\u00fcnf", "Sechs", "Sieben", "Acht", "Neun", "Zehn", "Montag", "Deinstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag", "Januar", "Februar", "M\u00e4rz", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "December"};
        String yesList = "yes yea yas ja";
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        while (!stop){
            int index = (int)(Math.random() * english.length);
            System.out.println("Translate this into English:\n    " + deutsch[index]);
            String response = input.nextLine().trim().toLowerCase();
            if (english[index].equals(response)){
                System.out.println("W\u00fcnderb\u00e4r. You are correct. ");
            }else{
                System.out.println("Schlect. You are incorrect. ");
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