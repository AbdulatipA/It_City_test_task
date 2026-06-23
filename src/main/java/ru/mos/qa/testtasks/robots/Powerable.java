package ru.mos.qa.testtasks.robots;

// использую 1 абстрактный класс, так-как он подходит по смыслу и идее ко всем реализациям,
//Для остальных частных случаев использую интерфейсы, так-как они объединяют разные классы по смыслу
// (ну и наследоваться можно только 1 раз)
public abstract class Powerable {
    public abstract String checkAndRefuel();
}
