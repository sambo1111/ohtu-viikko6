package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));

        QueryBuilder query = new QueryBuilder();

        Matcher m1 = query.playsIn("PHI")
                .hasAtLeast(10, "goals")
                .hasFewerThan(20, "assists").build();

        Matcher m2 = query.playsIn("EDM")
                .hasAtLeast(60, "points").build();
        
        //OR
        Matcher m = query.oneOf(m1, m2).build();
        
        //NOT
        Matcher m3 = query.not(query.playsIn("EDM").build()).build();

        for (Player player : stats.matches(m3)) {
            System.out.println(player);
        }
    }
}
