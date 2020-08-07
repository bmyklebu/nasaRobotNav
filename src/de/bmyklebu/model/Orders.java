package de.bmyklebu.model;

public class Orders {
    Robots robotOrder;

    public void setRobotStartPosition(Robots robot, int iSetPositionX, int iSetPositionY) {
        robot.setCurrentRobotXPos(iSetPositionX);
        robot.setCurrentRobotYPos(iSetPositionY);
    }

    public void move(Robots robot, String sDirection) {

        int iRobotNr = robot.getRobotNr();

        int icurrentRobotXPos = robot.getCurrentRobotXPos();
        int icurrentRobotYPos = robot.getCurrentRobotYPos();
        robot.setRobotDirection(sDirection);

        if (sDirection.equalsIgnoreCase("N")) {
            robot.setCurrentRobotYPos(icurrentRobotYPos + 1);
        }

        if (sDirection.equalsIgnoreCase("E")) {
            robot.setCurrentRobotXPos(icurrentRobotXPos + 1);
        }

        if (sDirection.equalsIgnoreCase("S")) {
            robot.setCurrentRobotYPos(icurrentRobotYPos-1);
        }

        if (sDirection.equalsIgnoreCase("W")) {
            robot.setCurrentRobotXPos(icurrentRobotXPos-1);
        }


    }
}
