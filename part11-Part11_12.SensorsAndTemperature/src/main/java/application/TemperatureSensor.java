package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean temp;

    public TemperatureSensor(){
        this.temp = false;
    }

    @Override
    public boolean isOn() {
        return this.temp;
    }

    @Override
    public int read() {
        if (isOn() == true) {
            return new Random().nextInt(61)-30;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void setOn() {
        this.temp = true;

    }
    @Override
    public void setOff() {
        this.temp = false;

    }
}
