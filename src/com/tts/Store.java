package com.tts;

public class Store {

    private String type;
    private int numLocations;
    private int numEmployees;
    private double avgDailySales;
    private String hours;



    public Store() {
        type = "Grocery";
        numLocations = 3;
        numEmployees = 10;
        avgDailySales = 5000;
        hours = "11 am to 10 pm";


    }

    Store Grocery = new Store();

    Store Liquor = new Store();





    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumLocations() {
        return numLocations;
    }

    public void setNumLocations(int numLocations) {
        this.numLocations = numLocations;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    public double getAvgDailySales() {
        return avgDailySales;
    }

    public void setAvgDailySales(double avgDailySales) {
        this.avgDailySales = avgDailySales;
    }


    public static void main(String[] args) {

        Boolean isOpen = new Boolean(true);
        Boolean isClosed = new Boolean(false);
        System.out.println(isOpen);
        System.out.println(isClosed);

        public String hoursOfOp() {
            System.out.println("We are open " + hours);
        }

    }


}
