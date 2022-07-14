package qa;

import static qa.RobotType.COOK;

public class CookRobot extends Robot{

    public CookRobot(Fuel fuelType){
        this.setFuelType(fuelType);
        this.setRobotType(COOK);
    }

    String robotInfo = "Робот повар ";

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

    public void goCook() {
        System.out.println(robotInfo + "пошел готовить");
    }

    public void stopCook() {
        System.out.println(robotInfo + "закончил готовить");
    }

    @Override
    public void goBattle() {
        System.out.println(robotInfo + "не может убивать");
    }

    @Override
    public void stopBattle() {
        System.out.println(robotInfo + "не может отдыхать после боя");
    }

    @Override
    public void goWelder() {
        System.out.println(robotInfo + "не может сваривать детали");
    }

    @Override
    public void stopWelder() {System.out.println(robotInfo + "не может закончить сваривать детали");}
}