package complex;
//Feladat 3. ---------------------------------
public class Time {
    private int min;

    public Time(int hh, int min){
        this.min = (hh*60+min)%(24*60);
    }
    public Time(){
        this(0,0);
    }

    public Time(int hh){
        this(hh,0);
    }
    public int getMinsOnly(){
        return min;
    }

    public int getMins(){
        return min % 60;
    }
    
    public int getHours(){
        return min /60;
    }

    @Override
    public String toString(){
        return String.format("%02d:%02d", getHours(), getMins());
    }

    public Time add(Time t){
        return new Time(0,(this.min+t.min)%(24*60));
    }
    public Time sub(Time t){
        int difference = this.min-t.min;
        return new Time(0, difference > 0 ? difference : 24*60 + difference);
    }

    public void addMins(int mins){
        this.min=(this.min+mins)%(24*60);
    }

    public void addHours(int hours){
        this.min = (this.min+hours*60)%(24*60);
    }

    public boolean greaterThan(Time t){
        return this.min > t.min;
    }

    public boolean lessThan(Time t){
        return this.min < t.min;
    }

    public int compareTo(Time t){
        if(greaterThan(t)){
            return 1;
        }else if(lessThan(t)){
            return -1;
        }else{
            return 0;
        }
    }


}
