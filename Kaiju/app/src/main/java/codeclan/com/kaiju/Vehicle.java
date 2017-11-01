package codeclan.com.kaiju;

/**
 * Created by user on 01/11/2017.
 */

public abstract class Vehicle {
    private String type;
    private int healthValue;

    public Vehicle(String type, int healthValue){
        this.type = type;
        this.healthValue = healthValue;
    }
}
