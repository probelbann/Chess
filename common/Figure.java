package Chess.common;

/**
 * Created by Администратор on 23.03.2015.
 */
public class Figure {

    private String name;
    private String color;

    public Figure() {
    }

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}
