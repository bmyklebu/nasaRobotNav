package de.bmyklebu.grid;

public class CurrentGrid {
   private int[] iGridPositionX = {0,1,2,3,4,5};

   private int[] iGridPositionY = {0,1,2,3,4,5};

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

}


