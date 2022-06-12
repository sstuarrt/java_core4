package com.company.lesson5_classes.homework5.task1;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();

        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.work();

        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();

        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.work();

        Robot[] objects = new Robot[4];
        objects[0] = new Robot();
        objects[1] = new CoffeRobot();
        objects[2] = new RobotDancer();
        objects[3] = new RobotCoocker();

        System.out.println('\n');

        for (int i = 0; i < objects.length; i++){
            objects[i].work();
        }

    }
}
