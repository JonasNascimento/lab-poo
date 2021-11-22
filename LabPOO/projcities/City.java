package br.edu.ifpb;

import java.util.Objects;


public class City implements Comparable<City>{
    private String name;
    private String State;
    private int ZipCode;


    ////////////Contructors//////////
    City(String name, String State, int ZipCode){
        this.name = name;
        this.State = State;
        this.ZipCode = ZipCode;
    }
    ///////////Getters/Setters////////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int zipCode) {
        ZipCode = zipCode;
    }

    //////////Overrides/////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City city = (City) o;
        return name.equals(city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", State='" + State + '\'' +
                ", ZipCode='" + ZipCode + '\'' +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return getName().compareTo(o.getName());
    }
}
