/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.effectivejavadersi.bolum2;

/**
 *
 * @author mustafa
 */
public class Ders6_Ucgen extends Ders6_Sekil{

    private double taban;
    private double yukseklik;

    public Ders6_Ucgen(double taban, double yukseklik) {
        this.taban = taban;
        this.yukseklik = yukseklik;
    }
   
    double alanHesapla() {
        return (taban * yukseklik) / 2;
    }
    
}
