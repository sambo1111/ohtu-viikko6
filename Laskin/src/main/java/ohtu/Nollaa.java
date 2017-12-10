/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author hasasami
 */
public class Nollaa implements Komento {

    private Sovelluslogiikka sovellus;
    JTextField syote;
    JTextField tuloste;

    public Nollaa(Sovelluslogiikka sovellus, JTextField syote, JTextField tuloste) {
        this.sovellus = sovellus;
        this.syote = syote;
        this.tuloste = tuloste;
    }

    @Override
    public void suorita() {

        try {
            sovellus.nollaa();
            tuloste.setText("" + sovellus.tulos());
        } catch (Exception e) {

        }
    }

    @Override
    public void peru() {

    }
}
