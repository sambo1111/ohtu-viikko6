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
public class Summa implements Komento {

    private Sovelluslogiikka sovellus;
    private JTextField syote;
    private JTextField tuloste;
    private int edellinenSummattu;

    public Summa(Sovelluslogiikka sovellus, JTextField syote, JTextField tuloste) {
        this.sovellus = sovellus;
        this.syote = syote;
        this.tuloste = tuloste;
    }

    @Override
    public void suorita() {
        try {
            sovellus.plus(Integer.parseInt(syote.getText()));
            tuloste.setText("" + sovellus.tulos());
            edellinenSummattu = Integer.parseInt(syote.getText());
        } catch (Exception e) {

        }
    }

    @Override
    public void peru() {
        sovellus.miinus(edellinenSummattu);
        tuloste.setText("" + sovellus.tulos());
    }
}
