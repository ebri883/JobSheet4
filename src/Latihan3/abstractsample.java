/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author WINDOWS 10
 */
public class abstractsample {
    public static void main(String [] args) {
        
        bangunDatar obyek1 = new bujurSangkar(10);
        
        System.out.println("Luas bujur sangkar dengan sisi 10 = " + obyek1.hitungLuas());
        System.out.println("Kelilingnya = " + obyek1.hitungKeliling());
        System.out.println("\n");
        
        bangunDatar obyek2 = new lingkaran(7);
        System.out.println("Luas lingkaran dengan jari-jari 7 = " + obyek2.hitungLuas());
        System.out.println("Kelilingnya = " + obyek2.hitungKeliling());       
    }
}
