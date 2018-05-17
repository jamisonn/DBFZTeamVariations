import java.util.ArrayList;
import java.util.List;

public class TeamVariationsAlgorithm {
    public List<String> Build(){
        //Variables neededed
        int x; int y; int z; int teams = 0;
        TeamArrayBuilder Array = new TeamArrayBuilder();
        List<String> characters1 =Array.TeamArray();
        List<String> AllTeams = new ArrayList<String>();
        StringBuilder Team;

        //Crunching
        //May13- Fix bug where Array will stop if 2 characters are the same as before

        for (x = 0; x < characters1.size(); x++) { //1st Character loop

            String point = characters1.get(x);

            //Mid Character loop
            for (y = 0; y < characters1.size(); y++) {//2nd Character loop
                String mid = characters1.get(y);
                if(mid == point){//Duplicate roll
                    continue; }

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
                for (z = 0; z < characters1.size(); z++) {//3rd Character loop
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

                    Team = new StringBuilder(point);
                    Team.append("."+mid+"."+anchor+".");
                   AllTeams.add(Team.toString());
                }
            }

        }
    return AllTeams;
    }
}
