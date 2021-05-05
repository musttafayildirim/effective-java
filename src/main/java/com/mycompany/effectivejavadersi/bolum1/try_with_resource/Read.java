/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.effectivejavadersi.bolum1.try_with_resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mustafa
 */
public class Read {
    static String firstLineOfFile(String path) throws IOException {
        //BufferedReader br = new BufferedReader(new FileReader(path)); 
        //try-with-resource şeklinde hazırladığımızda 
        //artık bu yapının kapatılmasını kontrol etmek zorunda kalmıyoruz.
        //zaten kapatamıyoruz da...
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        } finally {
            //br.close();
        }
    }
}
