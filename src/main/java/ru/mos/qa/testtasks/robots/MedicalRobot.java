package ru.mos.qa.testtasks.robots;


import ru.mos.qa.testtasks.robots.movement.Walkable;
import ru.mos.qa.testtasks.robots.type.Medical;

public class MedicalRobot extends Powerable implements Medical, Walkable {

    @Override
    public String checkAndRefuel() {
        String action = "Вид энергии: электрический";
        System.out.println(action);
        return action;
    }

    @Override
    public String analyze() {
        String action = "Способность: анализ";
        System.out.println(action);
        return action;
    }

    @Override
    public String performOperation() {
        String action = "Способность: выполнение операции";
        System.out.println(action);
        return action;
    }

    @Override
    public String walk() {
        String action = "Способ перемещение: ходьба";
        System.out.println(action);
        return action;
    }
}
