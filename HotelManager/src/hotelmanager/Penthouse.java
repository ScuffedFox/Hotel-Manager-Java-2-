
package hotelmanager;

public class Penthouse extends Room_Attributes{
    
    /*
    TO DO
        - Make the hot tub feature
    */
    
    private final String roomType = "Penthouse";
    private int bedCount = 1;
    private boolean kitchen = false;
    private int bathroomTier = 1;
    private boolean privacyBedding = false;
    private boolean hasHotTub = false;
    
    
    public Penthouse(){
        
    }
    
    public Penthouse(int _bedCount, boolean _kitchen, int _bathroomTier, boolean _privacyBedding){
        
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
        
    }

    @Override
    int getBedCount() {
        
    }

    @Override
    boolean hasKitchen() {
        
    }

    @Override
    int getBathroomTier() {
        
    }

    @Override
    boolean isPrivateBeds() {
        
    }
    
}
