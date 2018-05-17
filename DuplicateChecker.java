import java.util.List;
//Learn regex to be able to look throught the string and be able to find the characters that I need.
public class DuplicateChecker {
public void Palidrome(){
    TeamVariationsAlgorithm TeamstoCheck = new TeamVariationsAlgorithm();
    List<String>AllTeams =TeamstoCheck.Build();
    System.out.println(AllTeams.size());
    String controlteam;
    String testteam;
   for(int x = 0; x < AllTeams.size();x++) {
       controlteam = AllTeams.get(x);
       for(int p = 0; p < AllTeams.size();p++) {
           testteam = AllTeams.toString();
           testteam.compareTo(controlteam);

           if (controlteam.contains(AllTeams.get(p))) {
            AllTeams.remove(controlteam.contains(AllTeams.get(p)));
           }
       }
       }
        System.out.println(AllTeams.size());


}

}
