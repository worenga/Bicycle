public class Bicycle {

	// the Bicycle class has
    // three fields
    public int cadence;
    public int gear_left;
    public int gear_right;
    public int speed;

    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGearLeft(int newValue) {
        gear_left = newValue;
    }
    
    public void setGearRight(int newValue) {
        gear_right = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
        

}