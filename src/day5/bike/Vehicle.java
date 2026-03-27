package day5.bike;

public class Vehicle {
    boolean isOn;
    int speed;
    int gear;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void updateGear() {
        if (speed <= 20) {
            gear = 1;
        } else if (speed <= 30) {
            gear = 2;
        } else if (speed <= 40) {
            gear = 3;
        } else {
            gear = 4;
        }
    }

    public void accelerate() {
        updateGear();
        speed += gear;
        updateGear();
    }

    public void decelerate() {
        updateGear();
        speed -= gear;
        if (speed < 0) {
            speed = 0;
        }
        updateGear();
    }
}