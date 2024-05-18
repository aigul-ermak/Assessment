public class CeilingFun {
    private int speed;
    private boolean isForward;

    public CeilingFun(int speed, boolean isForward) {
        this.speed = speed;
        this.isForward = isForward;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isForward() {
        return isForward;
    }

    public void setForward(boolean forward) {
        isForward = forward;
    }
}
