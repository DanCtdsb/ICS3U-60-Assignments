package Enum;

public class Main {

    public static void main(String[] args) {
        double population = 38940000;
        for (Country country : Country.values()) {
            System.out.println("--------------------------");
            System.out.println("Country code of " + country + " : " + country.getCountryCode());
            System.out.println("Land mass of " + country + " : " + country.getLandMass());
            System.out.println("The ratio of land mass between " + country + " and HAITI is " + country.compareLandMass(Country.HAITI));
            System.out.println("Population Density of " + country + " : " + country.PopulationDensity(population) + "Ppl/Km^2");
        }
    }
}
