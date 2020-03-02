package vehiclestore;

import java.util.ArrayList;

public class Person {
    private int yob;  //Year of Birth
    private String name, address;
    private ArrayList<Vehicle> cars = new ArrayList<>();

    public Person(int yob, String name, String address) {
        this.yob = yob;
        this.name = name;
        this.address = address;
    }

    public int getYob() {
        return yob;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void addCar(Vehicle v) throws Exception {
        if (v.getOwner() != null) throw new Exception("Ennek a járműnek van már tulajdonosa!");
        v.setOwner(this);
        cars.add(v);
    }

    public void removeCar(String platenum) throws Exception {
        int ind = -1;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPlatenum().equals(platenum)) {
                ind = i;
                break;
            }
        }
        if (ind == -1) throw new Exception("Nincs ilyen járműje ennek a tulajdonosnak!");
        cars.get(ind).setOwner(null);
        cars.remove(ind);
    }

    public void listCars() {
        for (Vehicle car : cars) {
            System.out.println(car);
        }
    }

    public ArrayList<Vehicle> personVehicles() {return cars;}

    @Override
    public String toString() {
        return name + " " + yob + ": " + address;
    }
}
