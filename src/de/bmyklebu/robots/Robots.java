package de.bmyklebu.robots;

public class Robots {

    //initialize values with a value that cant be true (helps debugging)
    private int currentRobotXPos = -1;
    private int currentRobotYPos = -1;
    private int robotNr;

    public int getCurrentRobotXPos() {
        return currentRobotXPos;
    }

    public void setCurrentRobotXPos(int currentRobotXPos) {
        this.currentRobotXPos = currentRobotXPos;
    }

    public int getCurrentRobotYPos() {
        return currentRobotYPos;
    }

    public void setCurrentRobotYPos(int currentRobotYPos) {
        this.currentRobotYPos = currentRobotYPos;
    }

    public int getRobotNr() {
        return robotNr;
    }

    public void setRobotNr(int robotNr) {
        this.robotNr = robotNr;
    }


}
