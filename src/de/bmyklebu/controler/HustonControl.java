package de.bmyklebu.controler;

import de.bmyklebu.logic.Orders;
import de.bmyklebu.model.Robots;

import static de.bmyklebu.grid.GridBoundryValues.iBOUNDRY_X;
import static de.bmyklebu.grid.GridBoundryValues.iBOUNDRY_Y;

public class HustonControl {



    public void moonRover1 (){

        Orders orders1 = new Orders();
        Robots rover1 = new Robots();

        rover1.setRobotNr(1);
        rover1.setCurrentRobotXPos(iBOUNDRY_X);
        rover1.setCurrentRobotYPos(iBOUNDRY_Y);
        orders1.turn(rover1,"L");
        orders1.move(rover1);
        System.out.println(rover1.toString());

    }

    public void moonRover2 (){

        Orders orders2 = new Orders();
        Robots rover2 = new Robots();

        rover2.setRobotNr(1);
        rover2.setCurrentRobotXPos(iBOUNDRY_X);
        rover2.setCurrentRobotYPos(iBOUNDRY_Y);
        orders2.turn(rover2,"R");
        orders2.move(rover2);
        System.out.println(rover2.toString());

    }

    public void moonRover3 (){
        Orders orders3 = new Orders();
        Robots rover3 = new Robots();

        rover3.setRobotNr(2);
        rover3.setCurrentRobotXPos(iBOUNDRY_X);
        rover3.setCurrentRobotYPos(iBOUNDRY_Y);
        orders3.turn(rover3,"L");
        orders3.move(rover3);
        System.out.println(rover3.toString());

    }

}
