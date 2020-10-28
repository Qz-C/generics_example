package model.entities;

public class Seller implements Comparable<Seller> {
    private String name;
    private Double sales;

    public Seller(){

    }

    public Seller(String name, Double sales) {
        this.name = name;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSales() {
        return sales;
    }

    public void setSales(Double sales) {
        this.sales = sales;
    }

    @Override
    public int compareTo(Seller other) {
        return sales.compareTo(other.getSales());
    }

    @Override
    public String toString(){
        return name + ", $" + sales;
    }
}
