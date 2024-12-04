package tp;

import bandeau.Bandeau;

import java.util.Random;

public class MultichiffreEffect extends Effect{
    private int numberOfChange;
    private Character[] randomChars;

    public MultichiffreEffect(int numberOfChange, Character[] randomChars) {
        this.numberOfChange = numberOfChange;
        this.randomChars = randomChars;
    }

    @Override
    public void doEffect(Bandeau bandeau) {
        String baseMessage = bandeau.getMessage();
        String displayMessage;
        Random random = new Random();
        for (int i = 0; i < numberOfChange; i++) {
            displayMessage = "";
            for (int j = 0; j < bandeau.getMessage().length(); j++) {
                displayMessage = displayMessage + randomChars[random.nextInt(randomChars.length)];
            }
            bandeau.setMessage(displayMessage);
            bandeau.sleep(50);
        }
        bandeau.setMessage(baseMessage);
    }
}