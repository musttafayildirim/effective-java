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

// class final tanımlanarak extend edilemez hale türetilemez hale gelmiş oldu...

public final class Ders3_Complex{
    private final double re;
    private final double im;

    //değişkenleri private olarak tanımladığımız için ilk değerlerini 
    //constructor içerisinde tanımlıyoruz.
    
    public Ders3_Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    
    
    //Aşağıdaki her fonksiyonda yeni bir Ders3_Complex objesi oluşturarak bu objeyi
    //döndürüyoruz. Burada ram maliyetleri yükselecektir lakin objelerimizin durum
    //bilgisini tutuyor olacağız....
    
    public static Ders3_Complex valueOf(double re, double im) {return new Ders3_Complex(re, im); }
    
    public static Ders3_Complex valueOfPolar(double r, double theta) {
        return new Ders3_Complex(r * Math.cos(theta), r * Math.sin(theta));
    }
    
    public static final Ders3_Complex ZERO = new Ders3_Complex(0, 0);
    public static final Ders3_Complex ONE = new Ders3_Complex(1, 0);
    public static final Ders3_Complex I = new Ders3_Complex(0, 1);

    public double realPart() {return re;}
    
    public double imaginaryPart() {return im;}
    
    public Ders3_Complex add(Ders3_Complex c) {return new Ders3_Complex(re + c.re, im + c.im); }
    
    public Ders3_Complex substact(Ders3_Complex c) {return new Ders3_Complex(re - c.re, im - c.im); }
    
    public Ders3_Complex multiply(Ders3_Complex c) {return new Ders3_Complex(re * c.re, im * c.im); }
    
    public Ders3_Complex divide(Ders3_Complex c){
        double tmp = c.re * c.re + c.im * c.im;
        return new Ders3_Complex((re * c.re + im * c.im) / tmp, (im * c.re - re * c.im) / tmp);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.re) ^ (Double.doubleToLongBits(this.re) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.im) ^ (Double.doubleToLongBits(this.im) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ders3_Complex other = (Ders3_Complex) obj;
        if (Double.doubleToLongBits(this.re) != Double.doubleToLongBits(other.re)) {
            return false;
        }
        if (Double.doubleToLongBits(this.im) != Double.doubleToLongBits(other.im)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders3_Complex{" + "re=" + re + ", im=" + im + '}';
    } 
    
}
