
package hotelmanager;

public class Standard_Room extends Room_Attributes{
    
    private final String roomType = "Standard";
    private int bedCount = 1;
    private boolean kitchen = false;
    private int bathroomTier = 1;
    private boolean privacyBedding = false;
    
    public Standard_Room(){
        
    }
    
    public Standard_Room(int _bedCount, boolean _kitchen, int _bathroomTier, boolean _privacyBedding){
        
        bedCount = _bedCount;
        kitchen = _kitchen;
        bathroomTier = _bathroomTier;
        
        if(bedCount == 1){
            privacyBedding = false;
        }else{
            privacyBedding = _privacyBedding;
        }
    }

    @Override
    String getRoomType() {
        return this.roomType;
    }

    @Override
    int getBedCount() {
        return this.bedCount;
    }

    @Override
    boolean hasKitchen() {
        return this.kitchen;
    }

    @Override
    int getBathroomTier() {
        return this.bathroomTier;
    }

    @Override
    boolean isPrivateBeds() {
        return this.privacyBedding;
    }
}
