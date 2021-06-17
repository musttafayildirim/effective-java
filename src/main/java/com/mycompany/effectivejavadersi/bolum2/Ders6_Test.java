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


//Ders6 ile anlatılmak istenilen single responsibility ve open/close prenciplerinin
// anlaşılması... her sınıf aynı amaca yönelik bir iş yapmalı, her metod tek doğru tek bir işi
//yerine getirmeli....

public class Ders6_Test {
    public static void main(String[] args) {
        Ders6_Ucgen ucgen = new Ders6_Ucgen(1, 5);
        Ders6_Dikdortgen dikdortgen = new Ders6_Dikdortgen(1, 5);
        Ders6_Daire daire = new Ders6_Daire(4);

        System.out.println("Üçgen Alanı => " + ucgen.alanHesapla());
        System.out.println("Daire Alanı => " + daire.alanHesapla());
        System.out.println("Dikdörtgen Alanı => " + dikdortgen.alanHesapla());
        
        if(ucgen instanceof Ders6_Ucgen & ucgen instanceof Ders6_Sekil)
            System.out.println("Her üçgen bir şekildir...");
        

    }
    
  
    
    
}
