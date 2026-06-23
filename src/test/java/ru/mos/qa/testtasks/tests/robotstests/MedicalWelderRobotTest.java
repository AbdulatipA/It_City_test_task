package ru.mos.qa.testtasks.tests.robotstests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mos.qa.testtasks.robots.MedicalWelderRobot;

public class MedicalWelderRobotTest {
    MedicalWelderRobot medicalWelderRobot = new MedicalWelderRobot();

    @Test
    public void checkAndRefuel() {
        Assertions.assertEquals("Вид энергии: гибрид (электрический + бензин)", medicalWelderRobot.checkAndRefuel());
    }

    @Test
    public void analyze() {
        Assertions.assertEquals("Способность: анализ", medicalWelderRobot.analyze());
    }

    @Test
    public void performOperation() {
        Assertions.assertEquals("Способность: выполнение операции", medicalWelderRobot.performOperation());
    }

    @Test
    public void weld() {
        Assertions.assertEquals("Способность: сварка", medicalWelderRobot.weld());
    }

    @Test
    public void fly() {
        Assertions.assertEquals("Способ перемещения: полет", medicalWelderRobot.fly());
    }

    @Test
    public void walk() {
        Assertions.assertEquals("Способ перемещение: ходьба", medicalWelderRobot.walk());
    }
}
