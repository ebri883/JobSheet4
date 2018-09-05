/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author GokuJawa
 */
public class singa extends hewan{
    
    @Override
    void setNama(){
        String singa = "Diablo";
        System.out.println("Nama singa: "+singa);
    }
    
    @Override
    void setSuara(){
        String suara = "Roaaaarrr";
        System.out.println("Suara singa: "+suara);
    }
    
    @Override
    void setBerat(){
        Double berat = 10.0;
        System.out.println("Berat singa: "+berat+" Kg");
    }
}
