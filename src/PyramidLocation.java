import java.util.ArrayList;

public class PyramidLocation {

    public String Description; // = "You are stuck in a pyramid, sealed in by thieves who are afraid of the Mummy king";
    public String RoomId; // = "Entrance";

    public ArrayList<String> ItemsInRoom = new ArrayList<String>();
    public boolean CanGoNorth = false;
    public boolean CanGoSouth = false;
    public boolean CanGoEast = false;
    public boolean CanGoWest = false;

    public String NorthRequiresItem = "";
    public String NorthItemError = "";
    public String SouthRequiresItem = "";
    public String EastRequiresItem = "";
    public String WestRequiresItem = "";

    public String DescriptionAndInventory() {
        
        String inventoryDescription = "";
        for (String item : ItemsInRoom) {
            inventoryDescription += "There is a " + item + " on the floor.\n";
        }
        
        return Description + inventoryDescription;
    }
    
    public boolean TryDirection(String direction, ArrayList<String> inventory) {

        boolean success = false;

        switch(direction) {
            case "north":
                if(CanGoNorth) {
                    success = true;
                    if(NorthRequiresItem != "") {
                        if(!inventory.contains(NorthRequiresItem)) {
                            success = false;
                            System.out.println(NorthItemError);
                        }
                    }
                }
                break;
        }

        return success;

    }

}
