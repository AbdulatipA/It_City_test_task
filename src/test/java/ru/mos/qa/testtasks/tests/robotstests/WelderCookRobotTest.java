package ru.mos.qa.testtasks.tests.robotstests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mos.qa.testtasks.robots.WelderCookRobot;

public class WelderCookRobotTest {
    WelderCookRobot welderCookRobot = new WelderCookRobot();

    @Test
    public void checkAndRefuel() {
        Assertions.assertEquals("Вид энергии: гибрид (электрический + бензин)", welderCookRobot.checkAndRefuel());
    }

    @Test
    public void weld() {
        Assertions.assertEquals("Способность: сварка", welderCookRobot.weld());
    }

    @Test
    public void cook() {
        Assertions.assertEquals("Способность: готовка", welderCookRobot.cook());
    }

    @Test
    public void fly() {
        Assertions.assertEquals("Способ перемещения: полет", welderCookRobot.fly());
    }

    @Test
    public void drive() {
        Assertions.assertEquals("Способ перемещения: езда", welderCookRobot.drive());
    }
}
