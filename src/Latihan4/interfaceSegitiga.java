/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementasiinterface;

/**
 *
 * @author WINDOWS 10
 */
public class interfaceSegitiga implements interfaceBangunDatar {
    private double alas;
    private double tinggi;
    
    public interfaceSegitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * alas + tinggi;
    }
    
    @Override
    public double hitungLuas() {
        return ((alas * tinggi)/2);
    }
}
