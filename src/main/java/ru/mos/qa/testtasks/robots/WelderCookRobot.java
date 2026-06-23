package ru.mos.qa.testtasks.robots;


import ru.mos.qa.testtasks.robots.movement.Driveable;
import ru.mos.qa.testtasks.robots.movement.Flies;
import ru.mos.qa.testtasks.robots.type.Cook;
import ru.mos.qa.testtasks.robots.type.Welder;

public class WelderCookRobot extends Powerable implements Welder, Cook, Flies, Driveable {

    @Override
    public String checkAndRefuel() {
        String action = "Вид энергии: гибрид (электрический + бензин)";
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
    public String cook() {
        String action = "Способность: готовка";
        System.out.println(action);
        return action;
    }

    @Override
    public String fly() {
        String action = "Способ перемещения: полет";
        System.out.println(action);
        return action;
    }

    @Override
    public String drive() {
        String action = "Способ перемещения: езда";
        System.out.println(action);
        return action;
    }
}
