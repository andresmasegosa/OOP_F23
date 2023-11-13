package session9.d_enums;

import java.util.Objects;

public class Player{

    String name;
    Colour colour;

    public Player(String name, Colour colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", color='" + colour + '\'' +
                '}';
    }

}
