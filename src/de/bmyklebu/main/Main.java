package de.bmyklebu.main;

import de.bmyklebu.model.Orders;
import de.bmyklebu.model.Robots;

public class Main {

    public static void main(String[] args) {
        Orders orders = new Orders();
        Robots rob1 = new Robots();

        rob1.setRobotNr(1);
        rob1.setCurrentRobotXPos(5);
        rob1.setCurrentRobotYPos(5);
        System.out.println(rob1.toString());

        //orders.move(rob1,rob1.);



    }
}
