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
public class Erotus implements Komento {

    private Sovelluslogiikka sovellus;
    JTextField syote;
    JTextField tuloste;
    private int edellinenVahennetty;

    public Erotus(Sovelluslogiikka sovellus, JTextField syote, JTextField tuloste) {
        this.sovellus = sovellus;
        this.syote = syote;
        this.tuloste = tuloste;
    }

    @Override
    public void suorita() {

        try {
            sovellus.miinus(Integer.parseInt(syote.getText()));
            tuloste.setText("" + sovellus.tulos());
            edellinenVahennetty = Integer.parseInt(syote.getText());
        } catch (Exception e) {

        }
    }

    @Override
    public void peru() {
        sovellus.plus(edellinenVahennetty);
        tuloste.setText("" + sovellus.tulos());
    }
}
