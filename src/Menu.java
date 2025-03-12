import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void LogNew(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter excercise below: ");
        String ExcerciseName = scanner.nextLine();
        System.out.println("Enter Duration in hours: ");
        String ExcerciseDuration = scanner.nextLine();
        System.out.println(ExcerciseDuration);
        
        System.out.println("Excercise: " + ExcerciseName + " Duration: " + ExcerciseDuration);
    }

    public static void main(String[] args) {
        LogNew();
   }



}
