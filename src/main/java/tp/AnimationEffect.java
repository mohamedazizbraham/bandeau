package tp;

import bandeau.Bandeau;

import java.awt.*;
import java.util.Random;

public class AnimationEffect extends Effect{

    private int numberOfChange;

    public AnimationEffect(int numberOfChange) {
        this.numberOfChange = numberOfChange;
    }

    @Override
    public void doEffect(Bandeau bandeau) {
        Color back = bandeau.getBackground();
        Color front = bandeau.getForeground();
        Random random = new Random();
        for (int i = 0; i < numberOfChange; i++) {
            bandeau.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            bandeau.setForeground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            bandeau.sleep(50);
        }
        bandeau.setBackground(back);
        bandeau.setForeground(front);
    }
}