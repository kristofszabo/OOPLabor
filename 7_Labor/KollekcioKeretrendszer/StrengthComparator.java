package KollekcioKeretrendszer;

import java.util.Comparator;

public class StrengthComparator implements Comparator<Beer> {

    @Override
    public int compare(Beer b1, Beer b2) {
        return ((int) b1.getStrength() * 10) - ((int) b2.getStrength() * 10);
    }

}