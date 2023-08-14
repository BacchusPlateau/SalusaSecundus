
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("You wake up from what seems like a year's long sleep.   You are in a room with walls, ceilings and floor of stone.");
        System.out.println("Command?");

        String command = scanner.nextLine();
        System.out.println("Your command was: " + command);



    }
}