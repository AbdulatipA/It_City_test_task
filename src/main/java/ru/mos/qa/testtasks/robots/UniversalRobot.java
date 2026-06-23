package ru.mos.qa.testtasks.robots;

import ru.mos.qa.testtasks.robots.movement.Driveable;
import ru.mos.qa.testtasks.robots.movement.Flies;
import ru.mos.qa.testtasks.robots.movement.Walkable;
import ru.mos.qa.testtasks.robots.type.Cook;
import ru.mos.qa.testtasks.robots.type.Medical;
import ru.mos.qa.testtasks.robots.type.Welder;

public class UniversalRobot
        extends WelderCookRobot
        implements Cook, Medical, Welder, Driveable, Flies, Walkable {


    @Override
    public String checkAndRefuel() {
        String action = "Вид энергии: атомная, цикл заряда: 1 раз в 50 лет";
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
    public String fly() {
        String action = "Способ перемещения: полет";
        System.out.println(action);
        return action;
    }

    @Override
    public String walk() {
        String action = "Способ перемещение: ходьба";
        System.out.println(action);
        return action;
    }

    @Override
    public String drive() {
        String action = "Способ перемещение: езда";
        System.out.println(action);
        return action;
    }
}
