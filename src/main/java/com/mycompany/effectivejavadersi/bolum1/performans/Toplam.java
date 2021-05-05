/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.effectivejavadersi.bolum1.performans;

/**
 *
 * @author mustafa
 */
public class Toplam {
    public static void main(String[] args) {
    
        Long sum = 0L; 
        for(long i = 0; i < Integer.MAX_VALUE; i++){
            sum += i; // new Long(i) her seferde yeni bir obje oluşturulur.
            //long sum şeklinde tanımlanabiliyorsa bu şekilde kullanılmalı...
        }

        System.out.print(sum);
    }
}
