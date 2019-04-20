public class Audi implements ParentCar {
    int speed = 0;
    int gear = 1;
    public void changeGear(int u) {
        gear = u;
    }
    public void speedUp(int increment) {
        speed = speed+increment;
    }
    public void applyBrakes(int decrement) {
        speed = speed-decrement;
    }
    public int getSpeed() {
        return speed;
    }
    public int getGear() {
        return gear;
    }
}
