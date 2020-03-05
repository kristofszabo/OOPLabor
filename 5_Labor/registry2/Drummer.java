package registry2;

// Legalább 16 (ezt leszámítva)

public class Drummer {
    private String name, neptun;
    private int yob;
    private String art = "zene";

    public Drummer(String na, String ne, int y) {
        this.name = na;
        this.neptun = ne;
        this.yob = y;
    }

    public String getName() { return name; }
    public String getNeptun() { return neptun; }
    public int getYob() { return yob; }
    public String getArt() { return art; }private double weight;
    public double getWeight() { return weight; }
    protected void setWeight(double w) { // setter
        weight = w;
    }
    public String greetings() {return "Szeva."; };
    public String meet(Person p) {
        return this.greetings() + " " + p.getName() + "!";
    }

    @Override
    public String toString() {
        return name+" ("+neptun+") "+yob + ", " + this.art;
    }
}
