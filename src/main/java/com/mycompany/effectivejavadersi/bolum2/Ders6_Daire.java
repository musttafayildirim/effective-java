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
public class Ders6_Daire extends Ders6_Sekil{

    private double yariCap;

    public Ders6_Daire(double yariCap) {
        this.yariCap = yariCap;
    }
    
    @Override
    double alanHesapla() {
        return Math.PI * (yariCap * yariCap);
    }
    
}
