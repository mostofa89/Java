package OOP.Encapsulation_and_HasRelation;

public class Tream_PlayerDrivercode {
    public static void main(String[] args) {
        Team b = new Team();
        b.setTeamName("Bangladesh");
        Player mashrafi = new Player("Mashrafi");
        b.addPlayers(mashrafi);
        Player tamim = new Player("Tamim");
        b.addPlayers(tamim);
        b.printDetails();
        Team a = new Team("Australia");
        Player ponting = new Player("Ponting");
        a.addPlayers(ponting);
        Player lee = new Player("Lee");
        a.addPlayers(lee);
        a.printDetails();
    }
}
