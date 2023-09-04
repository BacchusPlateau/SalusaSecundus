import java.util.Scanner;

public class Stage1_1 {

    public void Stage1_1()   {

        SimpleRoom currentRoom = new SimpleRoom();
        currentRoom.name = "Pyramid entrance";
        currentRoom.description = "You are in a room with walls, ceilings and floor of stone.";

        // Initialize the game
        int score = 0;
        String command = "";
        int room = 1;
        boolean hasAnkh = false;

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
        System.out.println(currentRoom.description);
        System.out.println("Command?");
        // Get player command
        System.out.print("> ");
        command = sc.nextLine();

        System.out.println("Your command was " + command);

    }
}