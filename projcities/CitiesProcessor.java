package br.edu.ifpb;

import java.io.IOException;
import java.lang.*;
import java.nio.charset.Charset;
import java.util.*;
import java.nio.file.*;
import java.util.Comparator;

public class CitiesProcessor {
    private Set<City> citiesSet;

    public void setCitiesSet(Set<City> set){
        citiesSet = set;
    }

    public Set<City> getCitiesSet(){
       return citiesSet;
    }


    public Set<City> buildSetOfCities(Path filePath){
        Set<City> set= new HashSet<>();
        try
        {
            List<String> linhas = Files.readAllLines(filePath, Charset.defaultCharset());

            String palavras[];
            for(String p : linhas){
                palavras = p.split(", ");
                set.add(new City(palavras[0],palavras[1],Integer.valueOf(palavras[2])));
            }

        }catch(IOException e){
            System.out.println("ERRO na varredura do arquivo");
        }

        return set;
    }

    public void writeSetofCities(Path pathDestino,Comparator<City> comparator){
        try {
            List<String> linhas = new ArrayList<>();

            TreeSet<City> treeSet = new TreeSet<>(comparator);
            treeSet.addAll(citiesSet);

            for (City c : treeSet) {
                linhas.add(c.getName() + ", " + c.getState() + ", " + c.getZipCode());
            }

            Files.write(pathDestino,
                    linhas,
                    Charset.defaultCharset(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);

        }catch(IOException e){
            System.out.println("ERRO na gravação do arquivo.");
        }
    }
}
