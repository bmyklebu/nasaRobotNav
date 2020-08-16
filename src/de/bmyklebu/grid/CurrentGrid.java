package de.bmyklebu.grid;

import de.bmyklebu.model.Robots;

import static de.bmyklebu.feedback.RoverFeedback.*;

public class CurrentGrid {
    private final int[] iGridPositionX = {0, 1, 2, 3, 4, 5};
    private final int[] iGridRobotPositionX = {0, 0, 0, 0, 0, 0};

    private final int[] iGridPositionY = {0, 1, 2, 3, 4, 5};
    private final int[] iGridRobotPositionY = {0, 0, 0, 0, 0, 0};





    public boolean isXCoordinateOutOfBounds(int xCoordinate) {
        boolean outOfBounds = false;
        if (xCoordinate < iGridPositionX[0] || xCoordinate > iGridPositionX[4]) {
            outOfBounds = true;
        }

        return outOfBounds;
    }

    public boolean isYCoordinateOutOfBounds(int yCoordinate) {
        boolean outOfBounds = false;
        if (yCoordinate < iGridPositionY[0] || yCoordinate > iGridPositionY[4]) {
            outOfBounds = true;
        }

        return outOfBounds;
    }

    public void setRobotCoordsOnGrid(int yAxisMoveCoord, int xAxisMoveCoord, Robots robotToMove) {

        for (int i = 0; i < iGridPositionY.length; i++) {

            if (yAxisMoveCoord == iGridPositionY[i]) {


                if (iGridRobotPositionY[i] == 0) {
                    iGridRobotPositionY[i] = robotToMove.getRobotNr();
                    //System.out.println("y--" + iGridRobotPositionY[i]);
                }else{
                    System.out.println(STR_ROBOT_COLLISION);
                }

            }
        }
            for (int j = 0; j < iGridPositionX.length; j++) {

                if (xAxisMoveCoord == iGridPositionX[j]) {

                    if (iGridRobotPositionX[j] == 0) {
                        iGridRobotPositionX[j] = robotToMove.getRobotNr();
                        //System.out.println("x--" + iGridRobotPositionX[j]);
                    }else{
                        System.out.println(STR_ROBOT_COLLISION);
                    }

                }
            }



    }


    public void cleanXCoordsOnGrid( int xAxisMoveCoord) {


            for (int j = 0; j < iGridPositionX.length; j++) {

                if (xAxisMoveCoord == iGridPositionX[j]) {

                    if (iGridRobotPositionX[j] != 0 ) {
                        iGridRobotPositionX[j] =0;
                    }

                }
            }

        }



    public void cleanYCoordsOnGrid(int yAxisMoveCoord) {

        for (int i = 0; i < iGridPositionY.length; i++) {

            if (yAxisMoveCoord == iGridPositionY[i]) {


                if (iGridRobotPositionY[i] != 0 ) {
                    iGridRobotPositionX[i] = 0;
                }

            }



        }

    }

    public boolean isGridTileOccupied( int yAxisCoord, int xAxisCoord) {
        boolean bYAxisOccupied = false;
        boolean bXAxisOccupied = false;
        for (int i = 0; i < iGridPositionY.length; i++) {

            if (yAxisCoord == iGridPositionY[i]) {

                if (iGridRobotPositionY[i] == 0) {
                    bYAxisOccupied = false;
                }else{
                    bYAxisOccupied = true;
                }

            }

            for (int j = 0; j < iGridPositionX.length; j++) {

                if (xAxisCoord == iGridPositionX[j]) {

                    if (iGridRobotPositionX[j] == 0) {
                        bXAxisOccupied = false;
                    }else{
                        bXAxisOccupied = true;
                    }

                }
            }

        }
        if (bYAxisOccupied || bXAxisOccupied){
            return true;
        }else{
            return false;
        }

    }
}

