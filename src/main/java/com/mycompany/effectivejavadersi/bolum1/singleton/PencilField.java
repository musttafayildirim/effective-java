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
INSTANCE field'ı public olarak tanımlanmıştır bu sayede getInstance metoduna gerek
kalmamıştır. bunun için bir tane private constractor yapmamız gerekiyor.
*/


public class PencilField {
    
    public static final PencilField INSTANCE = new PencilField();
    
    private PencilField(){
    }
    
    public void write(){
        System.out.println("Write!");
    }
    
    
    
    public static void main(String[] args) {
        PencilField pencil1 = PencilField.INSTANCE;
        PencilField pencil2 = PencilField.INSTANCE;
        
        System.out.println("Pencil1 (Field) hashcode => " + pencil1.hashCode());
        pencil1.write();
        System.out.println("Pencil2 (Field) hashcode => " + pencil2.hashCode());
        pencil2.write();
    }
    
}
