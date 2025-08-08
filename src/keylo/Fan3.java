package keylo;

public class Fan3 {
        private boolean isOn = false;
        private Fan3Speed speed;
        private String brandName;

        public Fan3() {
            this.speed = Fan3Speed.OFF;
        }

        public void switchOnTheFan() {
            isOn = true;
            speed = Fan3Speed.LOW;
            System.out.println("Starting the fan with speed: " + speed);
        }

        public void switchOfTheFan() {
            isOn = false;
            speed = Fan3Speed.OFF;
            System.out.println("Turning off the fan");
        }

        public boolean isSwitchedOn() {
            return isOn == true;
        }

        public void increaseSpeed() {
            if(isOn == false) {
                System.out.println("Please switch on the fan");
            } else {
                speed = speed.increase();
            }
        }

        public void decreaseSpeed() {
            speed = speed.decrease();
        }

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            isOn = on;
        }

        public Fan3Speed getSpeed() {
            return speed;
        }

        public void setSpeed(Fan3Speed speed) {
            this.speed = speed;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        @Override
        public String toString() {
            return "Fan3{" +
                    "isOn=" + isOn +
                    ", speed=" + speed +
                    ", brandName='" + brandName + '\'' +
                    '}';
        }
    }


