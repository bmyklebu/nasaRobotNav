package test;

import de.bmyklebu.model.Orders;
import de.bmyklebu.model.Robots;
import org.junit.Test;

import static de.bmyklebu.grid.GridBoundryValues.iBOUNDRY_X;
import static de.bmyklebu.grid.GridBoundryValues.iBOUNDRY_Y;


public class hustonTest {
@Test
    public void moonRover1 (){
        Orders orders1 = new Orders();
        Robots rover1 = new Robots();

        rover1.setRobotNr(1);
        orders1.setRobotStartPosition(rover1,5,5);
        System.out.println("start"+rover1.toString());
        orders1.turn(rover1,"L");
        orders1.move(rover1);
//        System.out.println(rover1.toString());
//        orders1.turn(rover1,"L");
//

        System.out.println(rover1.toString());

    }
    public void moonRover2 (){
        Orders orders2 = new Orders();
        Robots rover2 = new Robots();

        rover2.setRobotNr(2);
        rover2.setCurrentRobotXPos(iBOUNDRY_X);
        rover2.setCurrentRobotYPos(iBOUNDRY_Y);
        System.out.println(rover2.toString());
        orders2.move(rover2);
        orders2.turn(rover2,"L");

        System.out.println(rover2.toString());

    }
}
