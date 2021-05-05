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
public class StringQuestion {
    public static void main(String[] args) {
     
        String s1 = new String("selam");//performans kayıplarına sebep olabilir. 
        String s2 = "selam";
        String s3 = "selam";
        
        if (s1 == s2) {
            System.out.println("s1==s2");
        }
        if (s2 == s3) {
            System.out.println("s2==s3");  
        }
        
        //Farklı objelerin aynı hashCode'ları olabilir burada hashCode'a bakmakta 
        //yanıltıcı olabilir.
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        
    }
}
