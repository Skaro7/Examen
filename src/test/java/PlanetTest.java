import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PlanetTest {


        @Test
        void planetShouldReturnYesHasAMoon () {
            var planet = new Planet("Earth", 12742, 24, "Yes", 1);
            assertEquals("Yes", planet.hasAtmosphere);
        }
    }
