import java.util.ArrayList;
import java.util.List;

public class TeamArrayBuilder {
    public List<String> TeamArray(){
        //Character Roster from array to list.

        String[] characters = {"AdultGohan", "Android 16", "Android 18", "Android21", "Beerus", "Captain Ginyu", "Cell", "Frieza", "Future Trunks", "KidGohan", "Goku Black", "GokuSSJ", "GokuSSB", "Gotenks", "Hit", "Kid Buu", "Krillin", "Majin Buu", "Nappa", "Piccolo", "Tenshinhan", "VegetaSSJ", "VegetaSSB", "Yamcha"};
        List<String> characters1 = new ArrayList<String>();
        for (int o = 0; o < characters.length; o++) {
            characters1.add(characters[o]);
        }
        return characters1;
    }
}
