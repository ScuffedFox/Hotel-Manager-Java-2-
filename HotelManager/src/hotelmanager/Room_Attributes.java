
package hotelmanager;

public abstract class Room_Attributes {
    
    // Pulled from Create Room GUI elements
    private String roomType;
    private int bedCount;
    private boolean kitchen;
    private int bathroomTier;
    private boolean privacyBedding;
    
    abstract String getRoomType(); // Return the rooms classified type
    abstract int getBedCount(); // Return the rooms bed count
    abstract boolean hasKitchen(); // Return if a room has a kitchen
    abstract int getBathroomTier(); // Return the what bathroom tier 
    abstract boolean isPrivateBeds(); // Return if the beds have privacy walls 
    
}
