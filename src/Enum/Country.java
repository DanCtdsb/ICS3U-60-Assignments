package Enum;

public enum Country {

    CANADA(9984670, "CAN", 1867),
    UNITED_STATES_OF_AMERCA(9372610, "USA", 1776),
    BAHAMAS(13878, "BHS", 1973),
    KENYA(582646, "KEN", 1963),
    HAITI(27750, "HTI", 1804),
    MEXICO(1972550, "MEX", 1810),
    SLOVENIA(20271, "SVN", 1991),
    MALAYSIA(330803, "MYS", 1957),
    PARAGUAY(406752, "PRY", 1811),
    NEW_ZEALAND(268021, "NZL", 1947);

    private double landMass;
    private String countryCode;
    private int indepYear;

    Country(double landMass, String countryCode, int indepYear) {
        this.landMass = landMass;
        this.countryCode = countryCode;
        this.indepYear = indepYear;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public double getLandMass() {
        return landMass;
    }

    public int getIndepYear() {
        return indepYear;
    }

    public double compLandMass(Country country) {
        return this.landMass / country.getLandMass();
    }

    public double popDensity(double population) {
        return population / this.landMass;
    }

    public int countryAge(int age) {
        return age - this.indepYear;
    }

    public int compareAge(Country country) {
        return Math.abs(this.indepYear - country.getIndepYear());
    }
}
