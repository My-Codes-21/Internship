package keylo;

import java.util.Scanner;
public class Fan3Demo {




        public static void main(String[] args) {
            Fan3 f1 = new Fan3();
            Scanner sc = new Scanner(System.in);
            boolean running = true;
            while (running == true) {
                System.out.println("---Fan Controls---");
                System.out.println("1) Switch on the fan.");
                System.out.println("2) Switch of the fan.");
                System.out.println("3) Increase the fan speed.");
                System.out.println("4) Decrease the fan speed.");
                System.out.println("5) Shut down the application.");
                int choice = sc.nextInt();
                //1, 2, 3, 4, 5

                switch(choice) {
                    case 1 -> {
                        if(f1.isSwitchedOn() == false) {
                            System.out.println("Starting the fan");
                            f1.switchOnTheFan();
                        } else {
                            System.out.println("Fan is already running");
                        }
                    }
                    case 2 -> {
                        f1.switchOfTheFan();
                        System.out.println("Fan is switched");
                    }
                    case 3 -> {
                        f1.increaseSpeed();
                        System.out.println("Fan speed is: " + f1.getSpeed());
                    }
                    case 4 -> {
                        f1.decreaseSpeed();
                        System.out.println("Fan speed is: " + f1.getSpeed());
                    }
                    case 5 -> {
                        running = false;
                        System.out.println("Shutting down the application.");
                    }
                }
            }




        }
    }


