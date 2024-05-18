public class CeilingFun {
    private int[] speeds = {0, 1, 2, 3};
    private int speedIndex = 0;
    private boolean isForward;

    public CeilingFun(int speedIndex, boolean isForward) {
        this.speedIndex = speedIndex;
        this.isForward = isForward;
    }
    public int getSpeed() {
        return speeds[speedIndex];
    }

    public int[] getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int[] speeds) {
        this.speeds = speeds;
    }

    public int getSpeedIndex() {
        return speedIndex;
    }

    public void setSpeedIndex(int speedIndex) {
        this.speedIndex = speedIndex;
    }

    public boolean isForward() {
        return isForward;
    }

    public void setForward(boolean forward) {
        isForward = forward;
    }

    public void increaseSpeedCord() {
        if (isForward) {
            if (speedIndex < speeds.length - 1) {
                speedIndex++;
            } else {
                speedIndex = 0;
            }
        } else {
            if (speedIndex > 0) {
                speedIndex--;
            } else {
                speedIndex = speeds.length - 1;
            }
        }
    }

    public void toggleDirection() {
        isForward = !isForward;
    }

}
