package qa;

import static qa.RobotType.WELDER;

public class WelderRobot extends Robot{

    public WelderRobot(Fuel fuelType){
        this.setFuelType(fuelType);
        this.setRobotType(WELDER);
    }

    String robotInfo = "Робот сварщик ";

    @Override
    public void walk() {
        System.out.println(robotInfo + "пошел");
    }

    @Override
    public void run() {
        System.out.println(robotInfo + "побежал");
    }

    @Override
    public void fly() {System.out.println(robotInfo + "полетел");}

    @Override
    public void goBattle() {
        System.out.println(robotInfo + "не может убивать");
    }

    @Override
    public void stopBattle() {
        System.out.println(robotInfo + "не может отдыхать после боя");
    }

    @Override
    public void goCook() {
        System.out.println(robotInfo + "не умеет готовить");
    }

    @Override
    public void stopCook() {
        System.out.println(robotInfo + "не может закончить готовить");
    }

    @Override
    public void goWelder() {
        System.out.println(robotInfo + "пошел сваривать детали");
    }

    @Override
    public void stopWelder() {
        System.out.println(robotInfo + "закончил сваривать детали");
    }
}