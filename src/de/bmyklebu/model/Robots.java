package de.bmyklebu.model;

public class Robots {

    //initialize values with a value that cant be true (helps debugging)
    private int currentRobotXPos = 5;
    private int currentRobotYPos = 5;
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

    @Override
    public String toString() {
        return "Robots{" +
                "currentRobotXPos=" + currentRobotXPos +
                ", currentRobotYPos=" + currentRobotYPos +
                ", robotNr=" + robotNr +
                '}';
    }
}
