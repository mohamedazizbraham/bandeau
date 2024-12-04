package tp;

import bandeau.Bandeau;

public class ZoomEffect extends Effect {
    private int numberOfZoomSteps;
    private int fontSizeIncrement;

    public ZoomEffect(int numberOfZoomSteps, int fontSizeIncrement) {
        this.numberOfZoomSteps = numberOfZoomSteps;
        this.fontSizeIncrement = fontSizeIncrement;
    }

    @Override
    public void doEffect(Bandeau bandeau) {
        int originalFontSize = bandeau.getFont().getSize();

        for (int i = 0; i < numberOfZoomSteps; i++) {
            int newFontSize = originalFontSize + (i * fontSizeIncrement);
            bandeau.setFont(bandeau.getFont().deriveFont((float) newFontSize));
            bandeau.sleep(100); // Pause pour visualiser l'effet
        }
        for (int i = 0; i < numberOfZoomSteps; i--) {
            int newFontSize = originalFontSize + (i * fontSizeIncrement);
            bandeau.setFont(bandeau.getFont().deriveFont((float) newFontSize));
            bandeau.sleep(50); // Pause pour visualiser l'effet
        }

        bandeau.setFont(bandeau.getFont().deriveFont((float) originalFontSize));
    }
}

