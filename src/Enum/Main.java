package Enum;

public class Main {

    public static void main(String[] args) {
        double population = 3.894e7;
        int year = 2025;
        Country testCountry = Country.NEW_ZEALAND;

        for (Country country : Country.values()) {
            System.out.println("--------------------------");
            System.out.println(country + " (" + country.getCountryCode() + ")");
            System.out.println("Land mass: " + country.getLandMass());
            System.out.println("The ratio of land mass with " + testCountry + " is "
                    + country.compLandMass(testCountry));
            System.out.println("Population Density at " + population + " people is : "
                    + country.popDensity(population) + "Ppl/Km^2");
            System.out.println("Independence year: " + country.getIndepYear());
            System.out.println("Age: " + country.countryAge(year) + " years old");
            System.out.println(country + " is " + country.compareAge(testCountry) + " years"
                    + ((country.getIndepYear() <= testCountry.getIndepYear())
                            ? " older"
                            : " younger")
                    + " than " + testCountry);
        }
    }
}
