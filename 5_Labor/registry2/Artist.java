package registry2;

abstract public class Artist extends Person {
    private String art;

    public Artist(String na, String ne, int y, String art) {
        super(na, ne, y);
        this.art = art;
    }

    public String getArt() {
        return art;
    }



    @Override
    public String toString() {
        return super.toString() + ", " + this.art;
    }

    public String greetings() {
        return "Szeva.";
    }
}
