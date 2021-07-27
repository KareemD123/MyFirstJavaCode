import groovy.console.ui.SystemOutputInterceptor;

import java.awt.*;
import java.util.Date;
import javax.swing.JFrame;

public class MyFirstJavaCode {

    public static void main(String[] args) {
        System.out.println("Hello World...!!!");
        double z = Math.max(2, 5);
        double y = Math.sqrt(4);
        String name = "Bro";
        boolean result = name.equals("Hello");
        System.out.println(result);
//        JFrame myFrame = new JFrame("MY FIRST WINDOW");
//        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        myFrame.setVisible(true);

        Rectangle recc = new Rectangle();
        recc.setLength(10.5);
        recc.setWidth(5);

        System.out.println(recc.getArea());
    }
}





//        byte age = 30, temp = 20;
//        Date now = new Date();
//        now.getTime();
////        System.out.println(now);
////        byte x = 1;
//        Point point1 = new Point();
//        point1.y = 1;
//        Point point2 = point1;
//        point1.x = 2;
////        System.out.println(point2);
//        String message = "Hellooooo Java" + "!!!";
//        boolean doesItEndWith = message.endsWith("!!");
////        System.out.println(message.length());
//        final float pi = 3.14F;
////        pi = 1;
//    double result = 10 / 3;
//    int x = 1;
//    int y = x++;
//    System.out.println(y);
//
//        age = 35;
//        long viewsCount = 123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = false;
////        System.out.println("Hello World");
////        System.out.println(age);
////        System.out.println(viewsCount);

//        static void extra(args){
//            println('Hello World...!!!');
//            double z = Math.max(2, 5);
//            double y = Math.sqrt(4);
//            Strng name = "Bro";
//            boolean result = name.equals("Hello");
//            System.out.println(result);
//
//        }



