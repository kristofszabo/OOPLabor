package vehiclestore;

public class Vehicle {
    private int yop; //Year of Production
    private String platenum, type;
    private Person owner;

    public Vehicle(int yop, String platenum, String type) {
        this.yop = yop;
        this.platenum = platenum;
        this.type = type;
    }

    public int getYop() {
        return yop;
    }

    public String getPlatenum() {
        return platenum;
    }

    public String getType() {
        return type;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        String s = type + " (" + platenum + ") " + yop;
        if (owner != null) return s + ": " + owner.getName();
        return s;
    }
}
