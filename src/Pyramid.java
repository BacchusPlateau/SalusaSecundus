import java.util.ArrayList;
import java.util.Scanner;

public class Pyramid {

    private PyramidLocation[][] Locations = new PyramidLocation[5][5];
    private PyramidLocation CurrentLocation;
    private int CurrentRow = 4;
    private int CurrentCol = 0;

    private ArrayList<String> Inventory = new ArrayList<String>();
    private boolean hasKey = false;

    public void GameLoop() {

        showSplash();

        Scanner scanner = new Scanner(System.in);
        String command = "";
        boolean quit = false;


        InitializeLocations();

        while(true) {

            System.out.println(CurrentLocation.DescriptionAndInventory());
            System.out.println();
            System.out.println("Command?");
            command = scanner.nextLine();

            String[] compoundCommand = command.split(" ");
            if(compoundCommand.length > 1) {
                command = compoundCommand[0];
            }


            switch(command) {
                case "quit":
                    //print score
                    System.out.println("Good-bye!");
                    quit = true;
                    break;
                case "north":
                    if(CurrentLocation.TryDirection(command, Inventory)) {
                        CurrentRow--;
                        CurrentLocation = Locations[CurrentRow][CurrentCol];
                        System.out.println("You carefully go through the unlocked door into the darkness beyond.");
                    }

                    break;
                case "get":
                    if(compoundCommand.length > 1) {
                        if (CurrentLocation.ItemsInRoom.contains(compoundCommand[1])) {
                            Inventory.add(compoundCommand[1]);
                            CurrentLocation.ItemsInRoom.remove(compoundCommand[1]);
                            System.out.println("You pick up the " + compoundCommand[1]);
                        } else {
                            System.out.println("That object isn't here to pick up!");
                        }
                    }
                    break;
                default:
                    System.out.println("I don't understand that.");
            }
            if(quit)
                break;

        }



    }

    private void InitializeLocations() {

        PyramidLocation entry = new PyramidLocation();
        entry.RoomId = "Entry";
        entry.CanGoEast = true;
        entry.CanGoNorth = true;
        entry.NorthRequiresItem = "Key";
        entry.NorthItemError = "The door is locked.";
        entry.ItemsInRoom.add("Key");
        entry.Description = "You are in a room with walls, ceilings and floor of stone.\n" +
                "There is a door to the north.\n" +
                "There is a passage to the east.\n";

        Locations[4][0] = entry;
        CurrentLocation = entry;

        PyramidLocation aboveEntry = new PyramidLocation();
        aboveEntry.RoomId = "AboveEntry";
        aboveEntry.Description = "This is a long hallway that slants down.  You can barely see your feet in front of you.";
        Locations[3][0] = aboveEntry;

    }

    private void showSplash() {
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
    }

    private void showInstructions() {

    }

}
