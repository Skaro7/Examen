public class Planet extends CelestialBody{


    String hasAtmosphere;
    int numberOfMoons;

    public Planet(String name, int diameter, int durationOfTheDay, String hasAtmosphere, int numberOfMoons) {
        super(name, diameter, durationOfTheDay);
        this.hasAtmosphere = hasAtmosphere;
        this.numberOfMoons = numberOfMoons;
    }

    public String getHasAtmosphere() {
        return hasAtmosphere;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    @Override
public String getDescription() {
        String planetInfo = "Has atmosphere: " + hasAtmosphere + "Number of moons: " + numberOfMoons;
        return ("Planeta: " + getName() + "Diameter: " + getDiameter() + "Duration of the day: " + getDurationOfTheDay()
        + planetInfo);
    }


}
