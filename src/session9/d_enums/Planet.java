package session9.d_enums;

enum Planet {
    MERCURY(1, 100),
    VENUS(2, 300),
    EARTH(3, 200),
    MARS(4, 300);

    private int position;
    private int diameter;

    Planet(int position, int diameter) {
        this.position = position;
        this.diameter = diameter;
    }

    public int getPosition() {
        return position;
    }

    public int getDiameter() {
        return diameter;
    }

    public static void main(String[] args) {
        Planet p = Planet.EARTH;
        switch (p) {
            case EARTH:
                int pos = p.getPosition();
                System.out.println("It's earth! Our Homeworld.");
                System.out.println("The " + pos + " planet.");
                System.out.println("The diameter is: " + p.getDiameter());
            default:
                System.out.println("It is not earth.");
        }
    }
}