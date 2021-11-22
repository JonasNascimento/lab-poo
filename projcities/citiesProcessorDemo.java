package br.edu.ifpb;
import java.nio.file.Paths;
import java.util.*;
import java.util.Comparator;


public class citiesProcessorDemo{
    public static void main(String[] args) {
        CitiesProcessor cp = new CitiesProcessor();

        Set<City> set = cp.buildSetOfCities(Paths.get("files/cities_duplicatas.txt"));
        cp.setCitiesSet( set );

        //cp.writeSetofCities(Paths.get("files/cities_ordered_by_name.txt"), Comparator.naturalOrder());

        ComparatorByZipCode comparadorZip = new ComparatorByZipCode();
        cp.writeSetofCities(Paths.get("files/cities_ordered_by_zipcode.txt"), comparadorZip);

        ComparatorByState comparadorState = new ComparatorByState();
        cp.writeSetofCities(Paths.get("files/cities_ordered_by_state.txt"), comparadorState);

    }
}
