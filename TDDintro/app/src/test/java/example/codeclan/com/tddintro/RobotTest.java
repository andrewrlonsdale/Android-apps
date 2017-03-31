package example.codeclan.com.tddintro;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrew on 16/01/2017.
 */
public class RobotTest {
    Robot robot;

    @Before
    public void setUp() throws Exception {
        robot = new Robot("C3P0", "Gold");
    }

    @Test
    public void canSetUpRobot() {
        assertEquals("C3P0", robot.getName());
    }

    @Test
    public void canGetRobotColour() {
        assertEquals("Gold", robot.getColour());
    }

    @Test
    public void batteryStartsAt100() {
        assertEquals(100.0, robot.checkBattery(), 0.1);
    }

    @Test
    public void canMakeDrink() {
        assertEquals("I am making a mockito", robot.makeDrink("mockito"));
    }

    @Test
    public void makingDrinkReducesBatteryBy10Percent() {
        robot.makeDrink("booze");
        assertEquals(90.0, robot.checkBattery(), 0.1);
    }

    @Test
    public void washingUpReducesBatteryBy30Percent() {
        robot.doWashing();
        assertEquals(70.0, robot.checkBattery(), 0.1);
    }

    @Test
    public void canDust() {
        assertEquals("I am dusting", robot.doDusting());
    }

    @Test
    public void dustingReducesBatteryBy20Percent() {
        robot.doDusting();
        assertEquals(80.0, robot.checkBattery(), 0.1);
    }

    @Test
    public void chargingBatteryReturnsItTo100() {
        robot.doDusting();
        robot.doWashing();
        robot.chargeBattery();
        assertEquals(100.0, robot.checkBattery(), 0.01);
    }
}