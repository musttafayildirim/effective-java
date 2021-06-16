/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.effectivejavadersi.bolum2;

/**
 *
 * @author mustafa
 */

//sınıf final olduğu için Ders2_Time sınıfı türetilemez...

public final class Ders2_Time {
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    //değişmez olması daha az zarar vericidir.
    //public erişim belirleyisine sahip global alanların final ile korunması
    //durumunda bu alan ilk değerini aldıktan sonra değerini korumaya devam edecektir.
    //private ve getter metodundan kurtulmuş olduk....
    
    public final int hour;
    public final int minute;

    public Ders2_Time(int hour, int minute) {
        if(hour < 0 || hour >= HOURS_PER_DAY)
            throw new IllegalArgumentException("Hour: " + hour);
        if (minute < 0 || minute >= MINUTES_PER_HOUR)
            throw new IllegalArgumentException("Minute: " + minute);
        this.hour = hour;
        this.minute = minute;
    }
    
}
