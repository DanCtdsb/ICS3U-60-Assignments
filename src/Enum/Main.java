package Enum;

public class Main {

    public static void main(String[] args) {
        for (Country country : Country.values()) {
            System.out.println("");
            System.out.println("Land mass of " + country + " : " + country.getLandMass());
            System.out.println("The ratio of land mass between " + country + " and HAITI is " + country.compareLandMass(Country.HAITI));
        }
    }
}
