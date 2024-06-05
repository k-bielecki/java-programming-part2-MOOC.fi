package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{

    private List<Sensor> sensorList;
    private List<Integer> readingsList;


    public AverageSensor(){
        this.sensorList = new ArrayList<>();
        this.readingsList =new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
        sensorList.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return sensorList.stream()
                .map (o -> o.isOn())
                .allMatch(o -> o == true);
    }

    @Override
    public void setOn() {
        sensorList.stream()
                .forEach(o -> o.setOn());
    }

    @Override
    public void setOff() {
        sensorList.stream()
                .forEach(o -> o.setOff());
    }

    @Override
    public int read() {
        if (isOn() == false || sensorList.isEmpty()) {
            throw new IllegalStateException("Error");
        }

        double averageDouble = sensorList.stream()
                .mapToInt(o -> o.read())
                .average()
                .getAsDouble();

        int average1 = (int)averageDouble;
        readingsList.add(average1);

        return average1;
    }

    public List<Integer> readings() {
        return readingsList;

    }
}
