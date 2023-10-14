public class SailingVehicle extends Vehicle implements Sailable {
    private boolean sailHoisted = false;

    @Override
    public void hoistSail() {
        sailHoisted = true;
    }

    @Override
    public void lowerSail() {
        sailHoisted = false;
    }

    @Override
    public boolean isSailHoisted() {
        return sailHoisted;
    }

    public void landHo() {
        
    }
}
