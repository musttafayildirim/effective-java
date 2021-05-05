/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.effectivejavadersi.bolum1.hashCode_ve_equals_metotlarini_beraber_ezin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author mustafa
 */
public final class TelefonRehberi implements Comparable<TelefonRehberi>{
    private final short alanKod;
    private final short prefix;
    private final short numara;
    
    public TelefonRehberi(int alanKod, int prefix, int numara){
        numaraKontrol(alanKod, 999, "alan kod");
        numaraKontrol(prefix, 999, "prefix");
        numaraKontrol(numara, 9999, "numara");
        this.alanKod = (short) alanKod;
        this.prefix = (short) prefix;
        this.numara = (short) numara;
    }
    
    private static void numaraKontrol(int arg, int max, String name){
        if(arg < 0 || arg > max)
            throw new IllegalArgumentException(name + ": " + arg);
    }
    
    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }
        if (!(o instanceof TelefonRehberi)) {
            return false;
        }
        
        TelefonRehberi telefonRehberi = (TelefonRehberi) o;
        return telefonRehberi.numara == numara && telefonRehberi.prefix == prefix
                && telefonRehberi.alanKod == alanKod;
    }

   
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.alanKod;
        hash = 83 * hash + this.prefix;
        hash = 83 * hash + this.numara;
        return hash;
    }
    
    
    //equals veya hashCode'dan herhangi birisi override edildi ise diğerinin de 
    //override edilmesi gerekmektedir. 
    //Aksi taktirde oluşturulan aynı objeleri farklı olarak algılayacaktır.

    @Override
    public String toString() {
        return "TelefonRehberi{" + "alanKod=" + alanKod + ", prefix=" + prefix + ", numara=" + numara + '}';
    }
    
    //size ait olan alanların toString metodunu override etmeyi ihmal etmeyin...
    
    
    
    private static final ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
    
    private static TelefonRehberi rasgeleNumaraUretici(){
        return new TelefonRehberi((short) threadLocalRandom.nextInt(1000), 
                                  (short) threadLocalRandom.nextInt(1000),
                                  (short) threadLocalRandom.nextInt(1000));
    }
    
    
    
    
    public static void main(String[] args) {
        Map<TelefonRehberi, String> telefonRehberiMap = new HashMap<>();
        telefonRehberiMap.put(new TelefonRehberi(216,322, 8740), "Ahmet");
        telefonRehberiMap.put(new TelefonRehberi(212,323, 8540), "Murat");
        telefonRehberiMap.put(new TelefonRehberi(216,322, 8640), "Harun");
        telefonRehberiMap.put(new TelefonRehberi(216,453, 8540), "Hasan");
        telefonRehberiMap.put(new TelefonRehberi(226,352, 3262), "Mehmet");
        System.out.println(telefonRehberiMap);
       
        
        System.out.println("Set ile rastgele üretilmiş telefon numaraları");
        //Rastgele Telefon numarası üretme
        
        //Set<TelefonRehberi> telefonRehberiSet = new HashSet<>();
        
        Set<TelefonRehberi> telefonRehberiSet = new TreeSet<>();       
        // TreeSet sıralama yapmak için kullanılır.
        // Comparable arayüzünü implemente ederek compareTo metodunu override
        // ediyoruz bu sayede elimizdeki son durum alan kodlarına göre listelenmiş
        // bir şekilde oluşuyor.
        
        for(int i = 0; i < 10; i++){
            telefonRehberiSet.add(rasgeleNumaraUretici());
        }
        System.out.println(telefonRehberiSet);
         
    }
    
    
    /*
    Hashcode veya equals OVERRIDE edilmeden önce 
        {
            com.mycompany.effectivejavadersi.bolum1.hashCode_ve_equals_metotlarini_beraber_ezin.TelefonRehberi@4272c0=Murat, 
            com.mycompany.effectivejavadersi.bolum1.hashCode_ve_equals_metotlarini_beraber_ezin.TelefonRehberi@43e047=Mehmet, 
            com.mycompany.effectivejavadersi.bolum1.hashCode_ve_equals_metotlarini_beraber_ezin.TelefonRehberi@42de75=Harun, 
            com.mycompany.effectivejavadersi.bolum1.hashCode_ve_equals_metotlarini_beraber_ezin.TelefonRehberi@43088a=Hasan, 
            com.mycompany.effectivejavadersi.bolum1.hashCode_ve_equals_metotlarini_beraber_ezin.TelefonRehberi@42ded9=Ahmet
        }
 
    
    Hashcode ve equals OVERRIDE edildikten sonra
    
        {
            TelefonRehberi{alanKod=212, prefix=323, numara=8540}=Murat, 
            TelefonRehberi{alanKod=226, prefix=352, numara=3262}=Mehmet, 
            TelefonRehberi{alanKod=216, prefix=322, numara=8640}=Harun, 
            TelefonRehberi{alanKod=216, prefix=453, numara=8540}=Hasan, 
            TelefonRehberi{alanKod=216, prefix=322, numara=8740}=Ahmet
        }
    */

    @Override
    public int compareTo(TelefonRehberi diger) {
        int alanKodFarki = this.alanKod - diger.alanKod;
        if(alanKodFarki != 0)
                return alanKodFarki;
        return 0;
    }
}