package ru.mos.qa.testtasks.tests.robotstests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mos.qa.testtasks.robots.CookRobot;

public class CookRobotTest {
    CookRobot cookrobot = new CookRobot();

    @Test
    public void checkAndRefuel() {
        Assertions.assertEquals("Вид энергии: электрический", cookrobot.checkAndRefuel());
    }

    @Test
    public void cook() {
        Assertions.assertEquals("Способность: готовка", cookrobot.cook());
    }

    @Test
    public void drive() {
        Assertions.assertEquals("Способ перемещение: езда", cookrobot.drive());
    }
}
