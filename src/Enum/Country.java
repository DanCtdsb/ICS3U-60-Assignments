package Enum;

public enum Country {
    
    CANADA(9984670, "CAN"),
    UNITED_STATES_OF_AMERCA(9372610, "USA"),
    BAHAMAS(13878, "BHS"),
    KENYA(582646 , "KEN"),
    HAITI(27750, "HTI"),
    MEXICO(1972550, "MEX"),
    SLOVENIA(20271, "SVN"),
    MALAYSIA(330803, "MYS"),
    PARAGUAY(406752, "PRY"),
    NEW_ZEALAND(268021, "NZL");

    private double landMass;
    private String countryCode;

    Country(double landMass, String countryCode) {
        this.landMass = landMass;
        this.countryCode = countryCode;
    }
    
    public String getCountryCode() {
        return countryCode;
    }

    public double getLandMass() {
        return landMass;
    }

    public double compareLandMass(Country country) {
        return this.landMass / country.getLandMass();
    }

    public double PopulationDensity(double population) {
        return population / this.landMass;
    }
}
