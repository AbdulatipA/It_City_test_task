package ru.mos.qa.testtasks.robots;


import ru.mos.qa.testtasks.robots.movement.Driveable;
import ru.mos.qa.testtasks.robots.type.Cook;

public class CookRobot extends Powerable implements Cook, Driveable {

    @Override
    public String checkAndRefuel() {
        String action = "Вид энергии: электрический";
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
    public String drive() {
        String action = "Способ перемещение: езда";
        System.out.println(action);
        return action;
    }
}
