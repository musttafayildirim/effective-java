/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.effectivejavadersi.bolum1.constracter;

/**
 *
 * @author mustafa
 */

/*
Utility sınıfımınızın Instance'ının oluşturulmasını istemediğimiz zaman
bir tane private constructor oluşturuyoruz ve iş yapar metotlarımızı yazıyoruz.

*/

public class UtilityClass {
    
    private UtilityClass() {
        throw new IllegalStateException("Yapılandırıcı çağrılamaz");
    }
    
    public static int sayfaSayisiOgren(){
        return 15;
    }
    
    public static String yazarIsmiOgren(){
        return "Yazar Abc";
    }
    
    public static String kitapIsmiOgren(){
        return "Kitap Abc";
    }  
}
