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

    public void increaseSpeedCord() {
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

    public void toggleDirection() {
        if (!isChristmas()) {
            isForward = !isForward;
        }
    }

    public void setCurrentDate(LocalDate date) {
        this.currentDate = date;
        if (isChristmas()) {
            speedIndex = 0;
        }
    }

    private boolean isChristmas() {
        return currentDate.getMonthValue() == 12 && currentDate.getDayOfMonth() == 25;
    }

}
