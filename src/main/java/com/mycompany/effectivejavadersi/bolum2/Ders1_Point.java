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

/* Bu yaklaşımla oluşturmuş olduğum x ve y değişkenlerine dışarıdan erişimi kaldırdım,
    ve sadece bir kere oluşturulabilmesini sağladım. */

public class Ders1_Point {
    private final double x;
    private final double y;
    
    public Ders1_Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
}
