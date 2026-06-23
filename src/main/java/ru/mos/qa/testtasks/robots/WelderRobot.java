package ru.mos.qa.testtasks.robots;


import ru.mos.qa.testtasks.robots.movement.Flies;
import ru.mos.qa.testtasks.robots.type.Welder;

public class WelderRobot extends Powerable implements Welder, Flies {

    @Override
    public String checkAndRefuel() {
        String action = "Вид энергии: бензин";
        System.out.println(action);
        return action;
    }

    @Override
    public String weld() {
        String action = "Способность: сварка";
        System.out.println(action);
        return action;
    }

    @Override
    public String fly() {
        String action = "Способ перемещения: полет";
        System.out.println(action);
        return action;
    }
}
