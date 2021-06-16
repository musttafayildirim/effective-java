/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.effectivejavadersi.bolum2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author mustafa
 */
public class MyHashSet<T> extends HashSet<T>{
    private int addCount = 0;

    public MyHashSet() {
    }
    
    public MyHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }
    
    //Override edilen add metodunun super'i eğer boş gelirse 
    //bir tane neyse koyuyor map içerisine.. Bizde içesidinde addCount
    //metodunu arttırdığımızdan dolayı bu add metodu kullanmadığımız halde
    //çalışıyor ve addCount 1 artıyor
    //aşağıda da size'a bir ekleyince normalde 3 tane eleman eklememize rağmen 6
    // adet eleman eklenmiş gibi değer dönüyor
    
    @Override
    public boolean add(T t){
        //addCount++;
        return super.add(t);
    }
    
    @Override
    public boolean addAll(Collection<? extends T> c){
        addCount += c.size();
        return super.addAll(c);
    }
    
    public int getAddCount() {return addCount; }
    
    public static void main(String[] args) {
        MyHashSet<String> s = new MyHashSet<String>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println(s.getAddCount());
    }
    
    
    //Bu dersten çıkarılan ders BİLMEDİĞİN CLASS'LARI EXTEND ETME
}
