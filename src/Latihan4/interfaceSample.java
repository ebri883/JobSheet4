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
public class interfaceSample {
    
    public static void main(String [] args) {
        
        interfaceBujurSangkar obyek1 = new interfaceBujurSangkar(10){};
        System.out.println("Luas bujur sangkar dengan sisi 10 = "+obyek1.hitungLuas());
        System.out.println("Kelilingnya = " + obyek1.hitungKeliling());
        System.out.println("\n");
        
        interfaceBangunDatar obyek2 = new interfaceSegitiga(6,8){};
        System.out.println("Luas segitiga dengan alas 6, dan tinggi 8 = " +obyek2.hitungLuas());
        System.out.println("Kelilingnya = " + obyek2.hitungKeliling());
    }
}
