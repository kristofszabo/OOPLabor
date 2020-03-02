package vehiclestore;

import java.time.Year;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();
        vehicles.add(new Vehicle(1980, "ASD-459", "Car - Lada 1600"));
        vehicles.add(new Vehicle(2019, "YEE-331", "Car - Tesla Model 3"));

        people.add(new Person(1996, "Brék Elek", "Budapest, Irinyi József u. 42, 1117"));
        people.add(new Person(1969, "Füty Imre", "Budapest, Kruspér u. 2, 1111"));

        System.out.println(vehicles.get(0));
        System.out.println(vehicles.get(1));
        System.out.println(people.get(0));
        System.out.println(people.get(1));
        System.out.println();

        try {
            people.get(0).addCar(vehicles.get(0));
            people.get(0).addCar(vehicles.get(1));
            people.get(0).listCars();
            System.out.println();

            //people.get(0).addCar(vehicles.get(0));
            people.get(0).removeCar("YEE-331");
            //people.get(0).removeCar("YEE-331");
            people.get(0).listCars();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Régebbi járművek: " + oldCars(vehicles, 1999));
        System.out.println("Régebbi jármű tulajdonosok:");
        ArrayList<Person> retrofans = oldCars(people);
        for (Person p : retrofans) {
            System.out.println("\t" + p);
        }
    }

    public static int oldCars(ArrayList<Vehicle> vehicles, int yop) {
        int num = 0;
        for (Vehicle v : vehicles) {
            if (v.getYop() < yop) num++;
        }
        return num;
    }

    public static ArrayList<Person> oldCars(ArrayList<Person> people) {
        int year = Year.now().getValue() - 10;
        ArrayList<Person> retrofans = new ArrayList<>();
        for (Person p : people) {
            ArrayList<Vehicle> personVehicles = p.personVehicles();
            for (Vehicle v : personVehicles) {
                if (v.getYop() < year) {
                    retrofans.add(p);
                    break;
                }
            }
        }
        return retrofans;
    }

}
