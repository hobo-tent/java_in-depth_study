package test;

import java.awt.*;

public class Test {
    public static void main(String[] args) throws AWTException, InterruptedException {
//        Car car=new Car();
//        Class<? extends Car> aClass = car.getClass();
//        System.out.println(aClass);
//        ClassLoader classLoader = aClass.getClassLoader();
//        System.out.println(classLoader);
//        ClassLoader parent = classLoader.getParent();
//        System.out.println(parent);
//        ClassLoader parent1 = parent.getParent();
//        System.out.println(parent1);
        Robot robot = new Robot();
        robot.mouseMove(500,500);
        Thread.sleep(5000);
        robot.mouseMove(200,200);
    }
}
