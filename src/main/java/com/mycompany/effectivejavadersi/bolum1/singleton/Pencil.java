/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.effectivejavadersi.bolum1.singleton;

/**
 *
 * @author mustafa
 */


/*
Singleton dediğimiz zaman bu sınıfta bu context'te sadece bir tane object olmasını
istiyoruz demektir.
En iyi singleton oluşturma yöntemi Enum kullanmaktır.


*/
public enum Pencil {
    INSTANCE;
    
    public void write(){
        System.out.println("Write!");
    }
    
    public static void main(String[] args){
        Pencil pencil1 = Pencil.INSTANCE;
        Pencil pencil2 = Pencil.INSTANCE;
        
        System.out.println("Pencil1 hashcode => " + pencil1.hashCode());
        pencil1.write();
        System.out.println("Pencil2 hashcode => " + pencil2.hashCode());
        pencil2.write();
    }
}
