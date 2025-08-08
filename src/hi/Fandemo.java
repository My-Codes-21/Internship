package hi;

import java.util.Scanner;

public class Fandemo {
    public static void main(String[] args) {
        Qki f1 = new Qki();

        Scanner sc = new Scanner(System.in);


        boolean running = true;
        while (running){
            System.out.println("1) switch on the fan");
            System.out.println("2) switch off the fan");
            System.out.println("3) fan speed is increased ");
            System.out.println("4) fan speed is decreased  ");
            System.out.println("5) exit the application");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();

            System.out.println("enter an integer");
            switch(choice){
                case 1 ->{
                    System.out.println("option 1");
                    if(f1.status()==false){
                        f1.switchON();
                        System.out.println("fan switched on");
                    }
                }
                case 2->{
                    System.out.println("option 2");
                    if(f1.status()==true){
                        f1.switchOff();
                        System.out.println("fan switched off");
                    }

                }
                case 3 ->{
                    System.out.println("option 3");
                    f1.increase();
                    System.out.println("fan speed is increased and the speed is :"+ f1.getSpeed());
                }
                case 4->{
                    System.out.println("option 4");
                    f1.decrease();
                    System.out.println("fan speed is decreased and the speed is : "+ f1.getSpeed());
                }
                case 5 ->{
                    running = false;
                    System.out.println("option 5");
                    System.out.println("exited");;}
            }
        }

    }
}