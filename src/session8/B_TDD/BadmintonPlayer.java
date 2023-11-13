package session8.B_TDD;

public class BadmintonPlayer {
    int wonMatches;
    private String name;
    public BadmintonPlayer(String name) {
        this.name=name;
        this.wonMatches=0;
    }

    public String getName() {
        return name;
    }

    public int getWonMatches() {
        return wonMatches;
    }
}
