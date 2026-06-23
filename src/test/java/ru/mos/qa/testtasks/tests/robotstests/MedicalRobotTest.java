package ru.mos.qa.testtasks.tests.robotstests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mos.qa.testtasks.robots.MedicalRobot;

public class MedicalRobotTest {
    MedicalRobot medicalRobot = new MedicalRobot();

    @Test
    public void checkAndRefuel() {
        Assertions.assertEquals("Вид энергии: электрический", medicalRobot.checkAndRefuel());
    }

    @Test
    public void analyze() {
        Assertions.assertEquals("Способность: анализ", medicalRobot.analyze());
    }

    @Test
    public void performOperation() {
        Assertions.assertEquals("Способность: выполнение операции", medicalRobot.performOperation());
    }

    @Test
    public void walk() {
        Assertions.assertEquals("Способ перемещение: ходьба", medicalRobot.walk());
    }
}
