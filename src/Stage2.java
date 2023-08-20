import java.util.Scanner;

public class Stage2 {
    public static void main(String[] args) {

        // Initialize the game
        int score = 0;
        String command = "";
        int currentRoom = 1;
        boolean isTorchLit = false;
        boolean isDoorLocked = true;

        // Inventory Items
        boolean hasAnkh = false;
        boolean hasKey = false;
        boolean hasTorch = false;

        // Define rooms
        final int roomEntrance = 1;
        final int roomLongCorridor = 2;

        Scanner sc = new Scanner(System.in);

        System.out.println("***********************************************************************************");
        System.out.println("*                                                                                 *");
        System.out.println("*    *******  **   **  *******  *******  **   **  *******  *****                  *");
        System.out.println("*    **   **  **   **  **   **  **   **  *******  *******  **   *                 *");
        System.out.println("*    *******  *******  *******  *******  ** * **    ***    **    *                *");
        System.out.println("*    **         ***    ** **    **   **  **   **    ***    **    *                *");
        System.out.println("*    **         ***    **  **   **   **  **   **  *******  **   *                 *");
        System.out.println("*    **         ***    **   **  **   **  **   **  *******  *****                  *");
        System.out.println("*                                                                                 *");
        System.out.println("***********************************************************************************");
        System.out.println("");

        while(true) {  // just ignore this for a "while"

            // print room description

            if(currentRoom == roomEntrance) {
                System.out.println("You are in a room with walls, ceilings and floor of stone.");
                System.out.println("Your kidnappers threw you in here and closed the entrance behind you.");
                if(hasKey == false) {
                    System.out.println("There is a key on the floor.");
                }
            } else if(currentRoom == roomLongCorridor) {
                System.out.println("You're in a dark long corridor.");
                if(isTorchLit == false) {
                    System.out.println("You can't go any further without a light.");
                }
            }

            // Print inventory and score
            System.out.print("You have: ");
            if(hasKey)
            {
                System.out.print("key ");
            } else {
                System.out.print("nothing");
            }
            System.out.println();
            System.out.println("Score: " + score);

            // Get player command
            System.out.print("command > ");
            command = sc.nextLine();

            //check for quitting
            if(command.equals("quit")) {
                System.out.println("Good-bye!");
                break;
            }

            if(currentRoom == roomEntrance) {
                if (command.equals("get key") && hasKey == false)   //we could shorten this to !hasKey
                {
                    System.out.println("You pick up the key.");
                    hasKey = true;
                    score += 10;
                } else if (command.equals("north") && isDoorLocked == true) {
                    System.out.println("The door is locked. You shall not pass!");
                } else if (command.equals("north") && isDoorLocked == false) {
                    System.out.println("You carefully head north through the unlocked door.");
                    score += 5;
                    currentRoom = roomLongCorridor;
                } else if (command.equals("unlock door") && isDoorLocked == true && hasKey == true) {   //we could shorten this to hasKey
                    System.out.println("You unlock the door.");
                    isDoorLocked = false;
                    score += 10;
                } else if (command.equals("unlock door") && isDoorLocked == false && hasKey == false) {
                    System.out.println("Unlock it with what?  You don't have a key!");
                } else {
                    System.out.println("Sorry, I don't know how to do that.");
                }
            } else if (currentRoom == roomLongCorridor) {

            }
            System.out.println();  // space out the output
        } //end while
    }
}
