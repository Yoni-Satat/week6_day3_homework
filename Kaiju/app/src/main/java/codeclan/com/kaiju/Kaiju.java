package codeclan.com.kaiju;

/**
 * Created by user on 01/11/2017.
 */

public abstract class Kaiju {
    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String roar(){
        return "ROAR!!!";
    }
}
