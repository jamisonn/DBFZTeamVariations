import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Variables neededed
        int x; int y; int z; int teams = 0;

        System.out.println("Point" + " \t " + "Mid" + " \t " + "Anchor");

        //Character Roster from array to list.
        String[] characters = {"AdultGohan", "Android 16", "Android 18", "Android21", "Beerus", "Captain Ginyu", "Cell", "Frieza", "Future Trunks", "KidGohan", "Goku Black", "GokuSSJ", "GokuSSB", "Gotenks", "Hit", "Kid Buu", "Krillin", "Majin Buu", "Nappa", "Piccolo", "Tenshinhan", "VegetaSSJ", "VegetaSSB", "Yamcha"};
        List<String> characters1 = new ArrayList<String>();
        for (int o = 0; o < characters.length; o++) {
            characters1.add(characters[o]);
        }

       //Character Roster Loops
       //Point Character loop

            for (x = 0; x < 23; x++) { //1st Character loop

              String point = characters1.get(x);

                //Mid Character loop
                for (y = 0; y < 23; y++) {//2nd Character loop
                    String mid = characters1.get(y);
                    if(mid == point){//Duplicate roll
                         continue;

                    }

                    //Teams Clause - No same characters
                    if(point =="AdultGohan" && mid== "KidGohan"||point =="KidGohan" && mid== "AdultGohan"){//Teams Clause
                        continue;
                    }
                    if(point =="GokuSSJ" && mid== "GokuSSB"||point =="GokuSSB" && mid== "GokuSSJ"){
                        continue;
                    }
                    if(point =="VegetaSSJ" && mid== "VegetaSSB"||point =="VegetaSSB" && mid== "VegetaSSJ"){
                        continue;
                    }





                    //Anchor Character loop
                    for (z = 0; z < 23; z++) {//3rd Character loop
                       String anchor = characters1.get(z);
                       if(point == anchor || mid == anchor){//Duplicate roll
                         continue;
                        }

                        if(point =="AdultGohan" && anchor== "KidGohan" || mid =="AdultGohan" && anchor== "KidGohan" ||point =="KidGohan" && anchor== "AdultGohan"|| mid =="KidGohan" && anchor== "AdultGohan"){//Teams Clause
                            continue;
                        }
                        if(point =="GokuSSJ" && anchor== "GokuSSB" || mid =="GokuSSJ" && anchor== "GokuSSB" ||point =="GokuSSB" && anchor== "GokuSSJ"|| mid =="GokuSSB" && anchor== "GokuSSJ"){
                            continue;
                        }
                        if(point =="VegetaSSJ" && anchor== "VegetaSSB" || mid =="VegetaSSJ" && anchor== "VegetaSSB" ||point =="VegetaSSB" && anchor== "VegetaSSJ"|| mid =="VegetaSSB" && anchor== "VegetaSSJ"){
                            continue;
                        }


                        else {
                            ++teams;
                            System.out.println("P-" +point + " M-" + mid  + " A- " + anchor);
                        }
                    }
                }

            }

        System.out.println("There are " + teams + " variations of teams.");
    }


    }




