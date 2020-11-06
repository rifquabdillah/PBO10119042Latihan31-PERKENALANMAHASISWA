/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author Muhammad RIfqu Abdillah
 *  Nama : Muhammad Rifqu Abdillah
 *  Kelas: Pbo-IF1
 *  Nim : 10119042 
 * 
 * Deksripsi : Program ini berisi tentang 
 */
public class PBO10119042Latihan31 {
    
    public static void main(String[] args){
        
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = "10119042";
        mahasiswa1.nama = "Rifqu Abdillah";
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim = "10110270";
        mahasiswa2.nama = "Rizki Adam Kurniawan";
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nim = "101190281";
        mahasiswa3.nama = "Indra Tiola";
        
        
        mahasiswa1.perkenalan();
        mahasiswa2.perkenalan();
        mahasiswa3.perkenalan();
        
    }
    
}
