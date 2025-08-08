package FanDemo;

public class Fan1Test {

        public boolean isOn = false;
        private Fan1 speed;

        public Fan1Test() {
            speed = Fan1.off;
        }


        public void switchON(){
            isOn=true;
            speed=Fan1.low;
            System.out.println("Fan is switched on");
        }
        public void switchOff(){
            isOn=false;
            speed=Fan1.off;
            System.out.println("Fan is switched off");
        }
        public  boolean status(){
            return isOn== true;
        }
        public void increase (){
            if (status()==true) {
                speed = speed.increase();
            }
            else{
                System.out.println("switch on  the fan then sir u can increase ");
            }

        }
        public void decrease (){
            if (status()==true) {
                speed = speed.decrease();
            }
            else{
                System.out.println("the speed can't be decreased as the fan is switched off");
            }}
        public Fan1 getSpeed() {
            return speed;
        }

        public void setSpeed(Fan1 speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            isOn = on;
        }

        @Override
        public String toString() {
            return "Fan1{" +
                    "isOn=" + isOn +
                    ", speed=" + speed +
                    '}';
        }
    }

