package qa;

import static qa.RobotType.BATTLE;

public class BattleRobot extends Robot{

    public BattleRobot(Fuel fuelType){
        this.setFuelType(fuelType);
        this.setRobotType(BATTLE);
    }

    String robotInfo = "Боевой робот ";

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
        System.out.println(robotInfo + "пошел убивать");
    }

    @Override
    public void stopBattle() {
        System.out.println(robotInfo + "пошел отдыхать");
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
        System.out.println(robotInfo + "не может сваривать детали");
    }

    @Override
    public void stopWelder() {System.out.println(robotInfo + "не может закончить сваривать детали");}
}