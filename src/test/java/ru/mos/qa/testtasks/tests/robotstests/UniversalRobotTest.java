package ru.mos.qa.testtasks.tests.robotstests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mos.qa.testtasks.robots.UniversalRobot;

public class UniversalRobotTest {
    UniversalRobot universalRobot = new UniversalRobot();

    @Test
    public void checkAndRefuel() {
        Assertions.assertEquals("Вид энергии: атомная, цикл заряда: 1 раз в 50 лет",
                universalRobot.checkAndRefuel());
    }

    @Test
    public void cook() {
        Assertions.assertEquals("Способность: готовка", universalRobot.cook());
    }

    @Test
    public void weld() {
        Assertions.assertEquals("Способность: сварка", universalRobot.weld());
    }


    @Test
    public void analyze() {
        Assertions.assertEquals("Способность: анализ", universalRobot.analyze());
    }

    @Test
    public void performOperation() {
        Assertions.assertEquals("Способность: выполнение операции", universalRobot.performOperation());
    }

    @Test
    public void fly() {
        Assertions.assertEquals("Способ перемещения: полет", universalRobot.fly());
    }

    @Test
    public void walk() {
        Assertions.assertEquals("Способ перемещение: ходьба", universalRobot.walk());
    }

    @Test
    public void drive() {
        Assertions.assertEquals("Способ перемещение: езда", universalRobot.drive());
    }
}
