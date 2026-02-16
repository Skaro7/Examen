public class Main {
    public static void main(String[] args) {

        Planet planet = new Planet("Earth", 12742, 24, "Yes", 1);
        System.out.println(planet.getDescription());

        Moon moon = new Moon("Moon", 3474, 708, "Earth", "Rocky");
        System.out.println(moon.getDescription());

    }



}
