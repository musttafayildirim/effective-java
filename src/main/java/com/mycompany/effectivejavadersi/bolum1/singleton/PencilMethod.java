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
private static final olarak tanımlanan instance'a ulaşmak için public getInstance
metodu ile ulaşılmıştır.
*/

public class PencilMethod {
    private static final PencilMethod INSTANCE = new PencilMethod();
    
    private PencilMethod(){
    }
    //multi thread uygulamalar için sağlıklı olmama ihtimali olmaya bilir.
    public static PencilMethod getInstance(){ 
        return INSTANCE;
    }
    
    public void write(){
        System.out.println("Write!");
    }
    
    
    //Bu kod normalde class'ın dışında olur....
    public static void main(String[] args) {
        PencilMethod pencil1 = PencilMethod.getInstance();
        PencilMethod pencil2 = PencilMethod.getInstance();
        
        System.out.println("Pencil1 (Method) hashcode => " + pencil1.hashCode());
        pencil1.write();
        System.out.println("Pencil2 (Method) hashcode => " + pencil2.hashCode());
        pencil2.write();
    }
    
    
    //methodun avantajı: lambda expression kullanımına olanak sağlamıştır.
    //Pencil::getInstance
}
