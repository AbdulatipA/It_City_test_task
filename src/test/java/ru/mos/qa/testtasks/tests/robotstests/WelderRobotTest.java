package ru.mos.qa.testtasks.tests.robotstests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mos.qa.testtasks.robots.WelderRobot;

public class WelderRobotTest {
    WelderRobot welder = new WelderRobot();

    @Test
    public void checkAndRefuel() {
        Assertions.assertEquals("Вид энергии: бензин", welder.checkAndRefuel());
    }

    @Test
    public void weld() {
        Assertions.assertEquals("Способность: сварка", welder.weld());
    }

    @Test
    public void fly() {
        Assertions.assertEquals("Способ перемещения: полет", welder.fly());
    }
}
