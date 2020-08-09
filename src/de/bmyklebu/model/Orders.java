package de.bmyklebu.model;

import de.bmyklebu.grid.CurrentGrid;

public class Orders {
    Robots robotOrder;

    public void setRobotStartPosition(Robots robot, int iSetPositionX, int iSetPositionY) {
        CurrentGrid grid = new CurrentGrid();
        if (grid.isCoordinateOutOfBounds(iSetPositionX,iSetPositionY)){
            System.out.println("Rover will be sent off the grid");
        }else{
            robot.setCurrentRobotXPos(iSetPositionX);
            robot.setCurrentRobotYPos(iSetPositionY);
        }

    }

    public void move(Robots robot) {
        CurrentGrid grid = new CurrentGrid();
        //get current info from robot
        int iCurrentRobotXPos = robot.getCurrentRobotXPos();
        int iCurrentRobotYPos = robot.getCurrentRobotYPos();
        String sCurrentDirection = robot.getRobotDirection();

        if (sCurrentDirection.equalsIgnoreCase("N")) {
            if (grid.isYCoordinateOutOfBounds(iCurrentRobotYPos+1)){
                System.out.println("Moon rover will move off the grid");
            }else {
                robot.setCurrentRobotYPos(iCurrentRobotYPos + 1);
            }
        }

        if (sCurrentDirection.equalsIgnoreCase("E")) {
            if (grid.isXCoordinateOutOfBounds(iCurrentRobotXPos+1)){
                System.out.println("error");
            }else {
                robot.setCurrentRobotXPos(iCurrentRobotXPos + 1);
            }
        }

        if (sCurrentDirection.equalsIgnoreCase("S")) {
            if (grid.isYCoordinateOutOfBounds(iCurrentRobotYPos-1)){
                System.out.println("Moon rover will move off the grid");
            }else {
                robot.setCurrentRobotYPos(iCurrentRobotYPos - 1);
            }
        }

        if (sCurrentDirection.equalsIgnoreCase("W")) {
            if (grid.isXCoordinateOutOfBounds(iCurrentRobotXPos-1)){
                System.out.println("error");
            }else{
                robot.setCurrentRobotXPos(iCurrentRobotXPos - 1);
            }

        }

    }

    public void turn(Robots robot, String sTurnType) {
        String sCurrentHeading = robot.getRobotDirection();
        System.out.println("->"+sCurrentHeading);
        if (sTurnType.equalsIgnoreCase("L")|| sTurnType.equalsIgnoreCase("R")){

            if (sTurnType.equalsIgnoreCase("R")) {

                switch (sCurrentHeading.toUpperCase()) {
                    case "N" -> robot.setRobotDirection("E");
                    case "E" -> robot.setRobotDirection("S");
                    case "S" -> robot.setRobotDirection("W");
                    case "W" -> robot.setRobotDirection("N");
                }
            }

            if (sTurnType.equalsIgnoreCase("L")) {

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
