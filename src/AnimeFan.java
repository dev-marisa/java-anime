import models.Anime;

import java.util.ArrayList;
import java.util.Random;

public class AnimeFan {

    private ArrayList<Anime> recommendations;

    public AnimeFan() {
        recommendations = new ArrayList<Anime>();
        recommendations.add(new Anime("Puella Magi Madoka Magica", "Shaft", 2011));
        recommendations.add(new Anime("FLCL", "Gainax", 2000));
        recommendations.add(new Anime("Boku no Hero Academia", "Bones", 2016));
        recommendations.add(new Anime("Demon Slayer", "Ufotable", 2019));
    }

    public Anime getRecommendation() {
        Random r = new Random();
        return recommendations.get(r.nextInt(recommendations.size()));
    }

    public static void main(String[] args) {
        System.out.println("Loading your anime recommendations");
        AnimeFan fan = new AnimeFan();
        System.out.println("You should watch:\n" + fan.getRecommendation());
    }

}
