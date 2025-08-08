package Phanka;
public class Fans {
    private boolean isOn = false;
    private Fanspeed1 speed;
    private String brandName="Orient";
    public Fans(){
        this.speed=Fanspeed1.OFF;
    }
    public void switchOnTheFan() {
        isOn = true;
        speed = Fanspeed1.LOW;
        System.out.println("Fan is switching on");
    }

    public void switchOffTheFan() {
        isOn = false;
        speed = Fanspeed1.OFF;
        System.out.println("Fan is switching off");
    }

    public boolean status() {
        return isOn == true;
    }

    public void increace() {
        if(status()==false){
            System.out.println("please switch on fan");
        } else {
            speed = speed.increase();
        }
    }

    public void decrease() {
        if(status()==false){
            System.out.println("The fan is already off");
        } else {
            speed = speed.decrease();
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public Fanspeed1 getSpeed() {
        return speed;
    }

    public void setSpeed(Fanspeed1 speed) {
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
        return "Fans{" +
                "isOn=" + isOn +
                ", speed=" + speed +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}