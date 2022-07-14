package qa;

import static qa.Fuel.*;

public class Main {
    public static void main(String[] args) {
        createBattleRobot(ELECTRIC, 2000, 100);
        createBattleRobot(INTERNAL, 100, 50);
        createBattleRobot(NUCLEAR,1950, 2022);

        createCookRobot(ELECTRIC,2000, 100);
        createCookRobot(INTERNAL,100, 50);
        createCookRobot(NUCLEAR,1950, 2022);

        createWelderRobot(ELECTRIC,2000, 100);
        createWelderRobot(INTERNAL,100, 50);
        createWelderRobot(NUCLEAR,1950, 2022);
    }

    public static void createBattleRobot(Fuel fuelType, int last, int now){
        BattleRobot robot = new BattleRobot(fuelType);
        System.out.println("Робот боец с топливом " + robot.getFuelType());
        System.out.println();
        robot.doJob();
        robot.refillRobot(robot, last, now);
    }

    public static void createCookRobot(Fuel fuelType, int last, int now){
        CookRobot robot = new CookRobot(fuelType);
        System.out.println("Робот повар с топливом " + robot.getFuelType());
        System.out.println();
        robot.doJob();
        robot.refillRobot(robot, last, now);
    }

    public static void createWelderRobot(Fuel fuelType, int last, int now){
        WelderRobot robot = new WelderRobot(fuelType);
        System.out.println("Робот сварщик с топливом " + robot.getFuelType());
        System.out.println();
        robot.doJob();
        robot.refillRobot(robot, last, now);
    }
}