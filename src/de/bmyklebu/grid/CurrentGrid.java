package de.bmyklebu.grid;

import de.bmyklebu.model.Robots;

import static de.bmyklebu.feedback.RoverFeedback.*;

public class CurrentGrid {
   private int[] iGridPositionX = {0,1,2,3,4,5};
   private int[] iGridRobotPositionX = {0,0,0,0,0,0};

   private int[] iGridPositionY = {0,1,2,3,4,5};
   private int[] iGridRobotPositionY = {0,0,0,0,0,0};

    public int[] getGridPositionX() {
        return iGridPositionX;
    }

    public void setGridPositionX(int[] iGridPositionX) {
        this.iGridPositionX = iGridPositionX;
    }

    public int[] getGridPositionY() {
        return iGridPositionY;
    }

    public void setGridPositionY(int[] iGridPositionY) {
        this.iGridPositionY = iGridPositionY;
    }

    public boolean isCoordinateOutOfBounds(int xCoordinate, int yCoordinate){
        boolean outOfBounds = false;
        if (xCoordinate < iGridPositionX[0] || xCoordinate > iGridPositionX[4]){
            outOfBounds = true;
        }
        if (yCoordinate < iGridPositionY[0] || yCoordinate > iGridPositionY[4]){
            outOfBounds = true;
        }
        return outOfBounds;
    }
    public boolean isXCoordinateOutOfBounds(int xCoordinate) {
        boolean outOfBounds = false;
        if (xCoordinate < iGridPositionX[0] || xCoordinate > iGridPositionX[4]) {
            outOfBounds = true;
        }

        return outOfBounds;
    }

        public boolean isYCoordinateOutOfBounds(int yCoordinate){
        boolean outOfBounds = false;
        if (yCoordinate < iGridPositionY[0] || yCoordinate > iGridPositionY[4]){
            outOfBounds = true;
        }

        return outOfBounds;
    }

    public void setRobotCoordsOnGrid(int yAxisMoveCoord, int xAxisMoveCoord, Robots robotToMove){

        for (int i = 0; i < iGridPositionY.length; i++) {

            if (yAxisMoveCoord == iGridPositionY[i]){

               if (iGridRobotPositionY[i]==0){
                   iGridRobotPositionY[i]= robotToMove.getRobotNr();
               }

               if (iGridRobotPositionY[i]!= 0){
                   System.out.println(STR_GRID_COLLISION);
               }

           }

            for (int j = 0; j < iGridPositionX.length; j++) {

                if (xAxisMoveCoord == iGridPositionX[i]){

                    if (iGridRobotPositionX[i]==0){
                        iGridRobotPositionX[i]= robotToMove.getRobotNr();
                    }

                    if (iGridRobotPositionX[i]!= 0){
                        System.out.println(STR_GRID_COLLISION);
                    }

                }
            }

        }

    }
//    public void getRobotCoordsOnGrid(int xAxisCoord, int yAxisCoord){
//        for (int i = 0; i < iGridPositionY.length; i++) {
//            if(yAxisCoord == iGridPositionY[i]){
//                if (iGridRobotPositionY[i]!= 0){
//
//                }
//
//            }
//            for (int j = 0; j < iGridPositionX.length; j++) {
//
//            }
//        }
//
//    }

}


