/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez_05_oggetti;

import java.time.LocalDateTime;

public class MainStart {

    public static void main(String[] args) throws InterruptedException {
        Alunno a1= new Alunno();
        a1.setNome("Mario");
        a1.setCognome("Rossi");
        a1.setVoto(10);
        Alunno a2 = new Alunno();
        a2.setCognome("Guerrini");
        a2.setNome("Luca");
        a2.setVoto(8);
        long milsec = 4000;
        Thread.sleep(milsec);
        LocalDateTime ddd = a2.getDataNasc();
        if (a1.getVoto() > a2.getVoto()) {
            System.out.println(a1.getPres());
        } else {
            System.out.println(a2.getPres());
        }
    }

}
