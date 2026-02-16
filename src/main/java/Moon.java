public class Moon extends CelestialBody{

    String orbitsPlanet;
    String typeOfSurface;


    public Moon(String name, int diameter, int durationOfTheDay, String orbitsPlanet, String typeOfSurface) {
        super(name, diameter, durationOfTheDay);
        this.orbitsPlanet = orbitsPlanet;
        this.typeOfSurface = typeOfSurface;
    }

    public String getOrbitsPlanet() {
        return orbitsPlanet;
    }

    public String getTypeOfSurface() {
        return typeOfSurface;
    }

    @Override
    public String getDescription() {
        String moonInfo = "Orbits planet: " + orbitsPlanet + "Type of surface: " + typeOfSurface;
        return ("Moon: " + getName() + "Diameter: " + getDiameter() + "Duration of the day: " + getDurationOfTheDay()
        + moonInfo);
    }
}

