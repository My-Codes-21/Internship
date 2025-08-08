package Phanka;
import java.util.ArrayList;
import java.util.Scanner;
public class FanDemo1 {
            public static void main(String[] args) {
                ArrayList<Fans> fanArrayList = new ArrayList<>();
                int i = 1;
                while (i <= 180){
                Fans f1 = new Fans();
                fanArrayList.add(f1);
                i++;
                }

                System.out.println("No of fans in the FanList : "+fanArrayList.size());
            }
        }

//        Fans f1 = new Fans();
//        Scanner sc = new Scanner(System.in);
//        boolean running = true;
//        while (running==true) {
//            System.out.println("--Fan Controls--");
//            System.out.println("1-Switch on the fan");
//            System.out.println("2-Switch off the fan");
//            System.out.println("3-Increase speed of fan");
//            System.out.println("4-Decrease speed of fan");
//            System.out.println("5-quit");
//            int choice = sc.nextInt();
//
//            switch (choice) {
//                case 1 -> {
//                    if(f1.isOn()==false){
//                        System.out.println("Starting the fan");
//                        f1.switchOnTheFan();
//
//                    }
//                    else{
//                        System.out.println("fan is already runninng");
//                    }
//                }
//                case 2 -> {
//                    if(f1.isOn()==true){
//                        System.out.println("Fan switched off");
//                        f1.switchOffTheFan();
//                    }
//                    else{
//                        System.out.println("Fan is already switched off");
//                    }
//                }
//                case 3 -> {
//                    f1.increace();
//                    System.out.println("Fan speed is: "+f1.getSpeed());
//                }
//                case 4 -> {
//                    f1.decrease();
//                    System.out.println("Fan speed is: "+f1.getSpeed());
//                }
//                case 5 -> {
//                    running=false;
//                    System.out.println("option 5");
//                }
//            }
//
//        }sc.close();
//
//    }
//}