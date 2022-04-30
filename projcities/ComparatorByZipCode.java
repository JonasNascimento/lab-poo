package br.edu.ifpb;
import java.util.Comparator;

public class ComparatorByZipCode implements Comparator<City>{
    @Override
    public int compare(City o1, City o2) {
        return Integer.compare( o1.getZipCode(), o2.getZipCode() );
    }
}
