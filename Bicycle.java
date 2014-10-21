public class Bicycle {

	// the Bicycle class has
    // three fields
    public int cadence;

    public int coolgear_left;
    public int coolgear_right;

    public int speed;

        
    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        

    public void setGearLeft(int newValue) {
        coolgear_left = newValue;
    }
    
    public void setGearRight(int newValue) {
        coolgear_right = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
        

}