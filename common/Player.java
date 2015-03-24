package Chess.common;

/**
 * Created by Администратор on 23.03.2015.
 */
public class Player {

    private String name;
    private String color;

    public Player() {

    }

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public void setColor() {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


}
