package tp;

import bandeau.Bandeau;

public class Main {
    public static void main(String[] args) {
        Bandeau b = new Bandeau();
        ZoomEffect e1 = new ZoomEffect(20, 5);
      //  AnimationEffect e2 = new AnimationEffect(100);
     //   MultichiffreEffect e3 = new MultichiffreEffect(100, new Character[] {'%', '$', '£', '*', '*', 'µ', '¤', ')', '}', '{', 'ç', '#'});

        Scenario scenario = new Scenario(b);
        scenario.addEffect(e1);
     //   scenario.addEffect(e2);
      //  scenario.addEffect(e3);
        scenario.play();
    }
}