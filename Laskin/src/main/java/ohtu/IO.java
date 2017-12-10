/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import java.util.Scanner;

/**
 *
 * @author hasasami
 */
public class IO {
    
    private Scanner lukija;
    
    public IO (Scanner lukija) {
        this.lukija = lukija;
    }
    
    public void print(String text) {
        System.out.print(text);
    }
    
    public int nextInt() {
       return lukija.nextInt();
    }
}
