package de.bmyklebu.controler;

import de.bmyklebu.model.Orders;
import de.bmyklebu.model.Robots;

import static de.bmyklebu.grid.GridBoundryValues.iBOUNDRY_X;
import static de.bmyklebu.grid.GridBoundryValues.iBOUNDRY_Y;

public class HustonControl {
    Orders orders1 = new Orders();
    Robots rover1 = new Robots();

    public void moonRover1 (){
        Orders orders = new Orders();
        Robots rover1 = new Robots();

        rover1.setRobotNr(1);
        rover1.setCurrentRobotXPos(iBOUNDRY_X);
        rover1.setCurrentRobotYPos(iBOUNDRY_Y);
        System.out.println(rover1.toString());
        orders.move(rover1,"N");
        System.out.println(rover1.toString());

    }

}
