package hi;

public class Qki {
    public boolean isOn = false;
    private Fanspeed speed;

    public Qki() {
        speed = Fanspeed.off;
    }


    public void switchON(){
        isOn=true;
        speed=Fanspeed.low;
        System.out.println("Fan is switched on");
    }
    public void switchOff(){
        isOn=false;
        speed=Fanspeed.off;
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
    public Fanspeed getSpeed() {
        return speed;
    }

    public void setSpeed(Fanspeed speed) {
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
        return "Qki{" +
                "isOn=" + isOn +
                ", speed=" + speed +
                '}';
    }
}