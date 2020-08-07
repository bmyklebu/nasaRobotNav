package de.bmyklebu.model;

public class Robots {

    //initialize values with a value that cant be true (helps debugging)
    private int iCurrentRobotXPos = 5;
    private int iCurrentRobotYPos = 5;
    private int robotNr;
    private String sRobotDirection = "N";

    public int getCurrentRobotXPos() {
        return iCurrentRobotXPos;
    }

    public void setCurrentRobotXPos(int currentRobotXPos) {
        this.iCurrentRobotXPos = currentRobotXPos;
    }

    public int getCurrentRobotYPos() {
        return iCurrentRobotYPos;
    }

    public void setCurrentRobotYPos(int currentRobotYPos) {
        this.iCurrentRobotYPos = currentRobotYPos;
    }

    public int getRobotNr() {
        return robotNr;
    }

    public String getRobotDirection() {
        return sRobotDirection;
    }

    public void setRobotDirection(String sRobotDirection) {
        this.sRobotDirection = sRobotDirection;
    }

    public void setRobotNr(int robotNr) {
        this.robotNr = robotNr;
    }

    @Override
    public String toString() {
        return "Robots{" +
                "iCurrentRobotXPos=" + iCurrentRobotXPos +
                ", iCurrentRobotYPos=" + iCurrentRobotYPos +
                ", robotNr=" + robotNr +
                ", sRobotDirection='" + sRobotDirection + '\'' +
                '}';
    }
}
