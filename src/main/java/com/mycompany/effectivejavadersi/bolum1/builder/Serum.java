/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.effectivejavadersi.bolum1.builder;

/**
 *
 * @author mustafa
 */



//Çok karışık bir objemiz varsa bunları oluşturmak için builder
//kalıbı birebir

public class Serum {
    private final int water; //required
    private final int sodiumIon; //required
    private final int magnesium;
    private final int creatine;
    private final int globilim;
    private final int carbohydrate;
    
    public static class Builder {
        //Required parameters
        private final int water;
        private final int sodiumIon;
        
        //Optional parameters - initialized to default values
        private int magnesium = 0;
        private int creatine = 0;
        
        private int globilim = 0;
        private int carbohydrate = 0;
        
        //Builder constractor
        public Builder(int water, int sodiumIon){
            this.water = water;
            this.sodiumIon = sodiumIon;
        }
        
        public Builder magnesium(int val) {
            magnesium = val;
            return this;
        }
        
        public Builder creatine(int val) {
            creatine = val;
            return this;
        }
        
        public Builder globilim(int val) {
            globilim = val;
            return this;
        }
        
        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }
        
        public Serum build() {
            return new Serum(this);
        }   
    }
    
    private Serum(Builder builder) {
        water = builder.water;
        sodiumIon = builder.sodiumIon;
        magnesium = builder.magnesium;
        creatine = builder.creatine;
        globilim = builder.globilim;
        carbohydrate = builder.carbohydrate;
        
    }
    
    
    public static void main(String[] args) {
        Serum serum = new Builder(100, 255).carbohydrate(10).globilim(50).build();
        
        System.out.println(serum.water);
        System.out.println(serum.sodiumIon);
        System.out.println(serum.carbohydrate);
    }

}
