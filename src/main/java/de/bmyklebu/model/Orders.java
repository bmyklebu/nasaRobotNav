package de.bmyklebu.model;

public class Orders {
    Robots robotOrder;

    public void setRobotStartPosition(Robots robot, int iSetPositionX, int iSetPositionY) {
        robot.setCurrentRobotXPos(iSetPositionX);
        robot.setCurrentRobotYPos(iSetPositionY);
    }

    public void move(Robots robot) {

        //get current info from robot
        int icurrentRobotXPos = robot.getCurrentRobotXPos();
        int icurrentRobotYPos = robot.getCurrentRobotYPos();
        String sCurrentDirection = robot.getRobotDirection();

        if (sCurrentDirection.equalsIgnoreCase("N")) {
            robot.setCurrentRobotYPos(icurrentRobotYPos + 1);
        }

        if (sCurrentDirection.equalsIgnoreCase("E")) {
            robot.setCurrentRobotXPos(icurrentRobotXPos + 1);
        }

        if (sCurrentDirection.equalsIgnoreCase("S")) {
            robot.setCurrentRobotYPos(icurrentRobotYPos - 1);
        }

        if (sCurrentDirection.equalsIgnoreCase("W")) {
            robot.setCurrentRobotXPos(icurrentRobotXPos - 1);
        }

    }

    public void turn(Robots robot, String sTurnDirection) {
        String sCurrentHeading = robot.getRobotDirection();
        System.out.println("->"+sCurrentHeading);
        if (sTurnDirection.equalsIgnoreCase("L")|| sTurnDirection.equalsIgnoreCase("R")){

            if (sTurnDirection.equalsIgnoreCase("R")) {

                switch (sCurrentHeading.toUpperCase()) {
                    case "N" -> robot.setRobotDirection("E");
                    case "E" -> robot.setRobotDirection("S");
                    case "S" -> robot.setRobotDirection("W");
                    case "W" -> robot.setRobotDirection("N");
                }
            }

            if (sTurnDirection.equalsIgnoreCase("L")) {

                switch (sCurrentHeading.toUpperCase()) {
                    case "N" -> robot.setRobotDirection("W");
                    case "E" -> robot.setRobotDirection("N");
                    case "S" -> robot.setRobotDirection("E");
                    case "W" -> robot.setRobotDirection("S");
                }
            }

        }

    }
}
