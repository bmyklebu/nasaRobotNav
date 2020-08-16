package de.bmyklebu.logic;

import de.bmyklebu.grid.CurrentGrid;
import de.bmyklebu.model.Robots;

import static de.bmyklebu.feedback.RoverFeedback.STR_GRID_COLLISION;
import static de.bmyklebu.feedback.RoverFeedback.STR_ROBOT_COLLISION;

public class Orders {
    Robots robotOrder;



    public void move(Robots robot) {
        CurrentGrid grid = new CurrentGrid();
        //get current info from robot
        int iCurrentRobotXPos = robot.getCurrentRobotXPos();
        int iCurrentRobotYPos = robot.getCurrentRobotYPos();
        String sCurrentDirection = robot.getRobotDirection();

        if (sCurrentDirection.equalsIgnoreCase("N")) {
            if (grid.isYCoordinateOutOfBounds(iCurrentRobotYPos + 1)) {
                System.out.println(STR_GRID_COLLISION);
            } else {

                if (grid.isGridTileOccupied(iCurrentRobotYPos + 1,iCurrentRobotXPos)){
                    System.out.println(STR_ROBOT_COLLISION);
                }else{
                    grid.cleanYCoordsOnGrid(iCurrentRobotYPos);
                    grid.setRobotCoordsOnGrid(iCurrentRobotYPos + 1, iCurrentRobotXPos, robot);
                    robot.setCurrentRobotYPos(iCurrentRobotYPos + 1);
                }

            }
        }

        if (sCurrentDirection.equalsIgnoreCase("E")) {
            if (grid.isXCoordinateOutOfBounds(iCurrentRobotXPos + 1)) {
                System.out.println(STR_GRID_COLLISION);
            } else {
                if (grid.isGridTileOccupied(iCurrentRobotYPos,iCurrentRobotXPos + 1)){
                    System.out.println(STR_ROBOT_COLLISION);
                }else{
                    grid.cleanXCoordsOnGrid(iCurrentRobotXPos);
                    grid.setRobotCoordsOnGrid(iCurrentRobotYPos, iCurrentRobotXPos + 1, robot);
                    robot.setCurrentRobotXPos(iCurrentRobotXPos + 1);
                }

            }
        }

        if (sCurrentDirection.equalsIgnoreCase("S")) {
            if (grid.isYCoordinateOutOfBounds(iCurrentRobotYPos - 1)) {
                System.out.println(STR_GRID_COLLISION);
            } else {
                if (grid.isGridTileOccupied(iCurrentRobotYPos - 1,iCurrentRobotXPos)){
                    System.out.println(STR_ROBOT_COLLISION);
                }else{
                    grid.cleanYCoordsOnGrid(iCurrentRobotYPos);
                    grid.setRobotCoordsOnGrid(iCurrentRobotYPos - 1, iCurrentRobotXPos, robot);
                    robot.setCurrentRobotYPos(iCurrentRobotYPos - 1);
                }

            }
        }

        if (sCurrentDirection.equalsIgnoreCase("W")) {
            if (grid.isXCoordinateOutOfBounds(iCurrentRobotXPos - 1)) {

                System.out.println(STR_GRID_COLLISION);
            } else {
                if (grid.isGridTileOccupied(iCurrentRobotYPos,(iCurrentRobotXPos - 1))){
                    System.out.println(STR_ROBOT_COLLISION);
                }else{
                    grid.cleanXCoordsOnGrid(iCurrentRobotXPos);
                    grid.setRobotCoordsOnGrid(iCurrentRobotYPos, iCurrentRobotXPos - 1, robot);
                    robot.setCurrentRobotXPos(iCurrentRobotXPos - 1);
                }

            }

        }

    }

    public void turn(Robots robot, String sTurnType) {
        String sCurrentHeading = robot.getRobotDirection();
        //System.out.println("heading :" + sCurrentHeading);
        if (sTurnType.equalsIgnoreCase("L") || sTurnType.equalsIgnoreCase("R")) {

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
