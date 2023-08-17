import java.util.Scanner;

public class Stage1 {
    public void Stage1() {


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
        System.out.println("You are in a room with walls, ceilings and floor of stone.");
        System.out.println("Command?");
        // Get player command
        System.out.print("> ");
        command = sc.nextLine();

        System.out.println("Your command was " + command);

    }
}
