/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.effectivejavadersi.bolum2;

import java.util.Date;

/**
 *
 * @author mustafa
 */
public class Ders5_Ast extends Ders5_Super{
    private final Date date; //Blank final, set by constructor

    public Ders5_Ast() {
        this.date = new Date();
    }
   
    @Override
    public void overrideMe() {
        System.out.println(date);
    }
    
    public static void main(String[] args) {
        Ders5_Ast ast = new Ders5_Ast();
        ast.overrideMe();
    }
    
    //Burada sorunumuz şu
    //Extends ettiğimiz üst sınıfımız'ın constructor'ı içerisinde kullanılmış olan
    //metodumuza herhangi bir değer girilmediği için null döndürüyor.
    //ardından Ders5_Ast sınıfımızdaki overrideMe metodu çalışıyor o metottan 
    //tarih değeri dönüyor...
    
    
    //Üst metotların yapılandırıcılarının içerisinde abstract bir metot çağırmayın.....
}
