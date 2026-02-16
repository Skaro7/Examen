public abstract class CelestialBody {
    private String name;
    private int diameter;
    private int durationOfTheDay;

    public CelestialBody(String name, int diameter, int durationOfTheDay) {
        this.name = name;
        this.diameter = diameter;
        this.durationOfTheDay = durationOfTheDay;
    }

    public String getName() {
        return name;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getDurationOfTheDay() {
        return durationOfTheDay;
    }


    abstract String getDescription();
}
