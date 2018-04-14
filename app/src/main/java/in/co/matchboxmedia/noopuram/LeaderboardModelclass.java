package in.co.matchboxmedia.noopuram;

/**
 * Created by mrkai on 1/3/18.
 */

public class LeaderboardModelclass {
    String dept_name;
    String points;

    public LeaderboardModelclass() {

    }

    public LeaderboardModelclass(String dept_name, String points) {
        this.dept_name = dept_name;
        this.points = points;

    }

    public String getDept_name() {
        return dept_name;
    }


    public String getPoints() {
        return points;
    }


}
