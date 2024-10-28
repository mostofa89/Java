package OOP.Encapsulation_and_HasRelation;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<String> playersList;

    public Team(String teamName){
        this.teamName = teamName;
        this.playersList = new ArrayList<>();

    }


    public Team(){
        this.teamName = null;
        this.playersList = new ArrayList<>();
        
    }


    public void setTeamName(String Tname){
        this.teamName = Tname;
    }

    public String getTeamName(){
        return this.teamName;
    }


    public void addPlayers(Player ... players){
        for (Player player : players){
            this.playersList.add(player.name);
        }
    }


    public void printDetails(){
        System.out.println("=====================");
        System.out.println("Team: " + this.teamName);
        System.out.println("List of Players :\n" + this.playersList);
        System.out.println("=====================");
    }

}
