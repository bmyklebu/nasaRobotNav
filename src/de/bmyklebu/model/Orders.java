package de.bmyklebu.model;

public class Orders {
    Robots robotOrder;

    public void setRobotStartPosition(int iSetPositionX, int iSetPositionY) {
        robotOrder.setCurrentRobotXPos(iSetPositionX);
        robotOrder.setCurrentRobotYPos(iSetPositionY);
    }

    public void move(Robots robot, int imovementValue, String sdirection) {
        //TODO incorperste movementvalue with for loop
        int iRobotNr = robot.getRobotNr();

        int icurrentRobotXPos = robot.getCurrentRobotXPos();
        int icurrentRobotYPos = robot.getCurrentRobotYPos();

        if (sdirection.equalsIgnoreCase("N")) {
            this.robotOrder.setCurrentRobotYPos(icurrentRobotYPos + 1);

        }

        if (sdirection.equalsIgnoreCase("E")) {
            this.robotOrder.setCurrentRobotXPos(icurrentRobotXPos + 1);

        }

        if (sdirection.equalsIgnoreCase("S")) {
            this.robotOrder.setCurrentRobotYPos(icurrentRobotYPos - 1);
        }

        if (sdirection.equalsIgnoreCase("W")) {
            this.robotOrder.setCurrentRobotXPos(icurrentRobotXPos - 1);
        }


    }
}
