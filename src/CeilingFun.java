public class CeilingFun {
    private int speed;
    private boolean isIncrease;

    public CeilingFun(int speed, boolean isIncrease) {
        this.speed = speed;
        this.isIncrease = isIncrease;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isIncrease() {
        return isIncrease;
    }

    public void setIncrease(boolean increase) {
        isIncrease = increase;
    }
}
