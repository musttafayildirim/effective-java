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
public class Ders6_Dikdortgen extends Ders6_Sekil{
    private double kisaKenar;
    private double uzunKenar;

    public Ders6_Dikdortgen(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    @Override
    double alanHesapla() {
        return kisaKenar * uzunKenar;
    }
    
    
    
}
