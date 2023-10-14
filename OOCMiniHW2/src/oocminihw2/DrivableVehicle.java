public class DrivableVehicle extends Vehicle implements Drivable {
    
    @Override
    public void accelerate(float speed) {
        
    }

    @Override
    public void brake() {

    }

    @Override
    public void turn(float angle) {
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }
}
