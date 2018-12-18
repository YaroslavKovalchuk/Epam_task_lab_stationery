import java.util.Comparator;

public class Sort implements Comparator<Stationery> {


    @Override
    public int compare(Stationery o1, Stationery o2) {
        return o1.getColor().toString().compareTo(o2.getColor().toString());
    }


}
