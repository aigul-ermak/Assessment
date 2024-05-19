import java.time.LocalDate;

public class CeilingFun {
    private int[] speeds = {0, 1, 2, 3};
    private int speedIndex = 0;
    private boolean isForward = true;
    private LocalDate currentDate;

    public CeilingFun(LocalDate currentDate) {
        this.currentDate = currentDate;
        if (isChristmas()) {
            speedIndex = 0;
        }
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

    //  Changes the speed index based on the current direction, except on Christmas Day
    public void changeSpeedCord() {
        if (!isChristmas()) {
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
    }

    // Toggles the direction unless it's Christmas Day
    public void toggleDirection() {
        if (!isChristmas()) {
            isForward = !isForward;
        }
    }


    // Checks if the current date is Christmas Day
    private boolean isChristmas() {
        return currentDate.getMonthValue() == 12 && currentDate.getDayOfMonth() == 25;
    }

}
