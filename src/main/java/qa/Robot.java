package qa;

import static qa.Fuel.*;

public abstract class Robot {

    private Fuel fuelType;
    private RobotType robotType;

    public Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public RobotType getRobotType() {
        return robotType;
    }

    public void setRobotType(RobotType robotType) {
        this.robotType = robotType;
    }

    public abstract void walk();
    public abstract void run();
    public abstract void fly();

    public abstract void goBattle();
    public abstract void stopBattle();

    public abstract void goCook();
    public abstract void stopCook();
    public abstract void goWelder();
    public abstract void stopWelder();

    public void refill(int last, int now, Fuel typeFuel, Fuel robotTypeFuel){

        if ((typeFuel == NUCLEAR)&&(robotTypeFuel == NUCLEAR)){
            if (now - last >= 50)
                System.out.println("Робот пошел заправляться " + typeFuel);}

        else if ((typeFuel == ELECTRIC)&&(robotTypeFuel == ELECTRIC)){
            if ((now/last) <= 20)
                System.out.println("Робот пошел заправляться " + typeFuel);}

        else if ((typeFuel == INTERNAL)&&(robotTypeFuel == INTERNAL)) {
            if (last - now < last)
                System.out.println("Робот пошел заправляться " + typeFuel);
        }
        else System.out.println("Робот не может заправляться " + typeFuel);
    }

    public void doJob(){
        goBattle();
        stopBattle();
        goCook();
        stopCook();
        goWelder();
        stopWelder();
        System.out.println();
    }

    public void makeMovements(){
        walk();
        run();
        fly();
    }

    public void refillRobot(Robot robot, int last, int now){
        robot.refill(last, now, ELECTRIC, robot.getFuelType());
        robot.refill(last, now, NUCLEAR, robot.getFuelType());
        robot.refill(last, now, INTERNAL, robot.getFuelType());
        System.out.println("---------------------------------------");
    }
}