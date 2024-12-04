package tp;

import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.List;

public class Scenario {

    private Bandeau bandeau;
    private List<Effect> effects = new ArrayList<>();

    public Scenario(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public void addEffect(Effect e) {
        effects.add(e);
    }

    public void play() {
        for (Effect e : effects) {
            e.doEffect(bandeau);
            bandeau.sleep(500);
        }
    }
}