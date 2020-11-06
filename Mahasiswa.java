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
 */
public class Mahasiswa {
    String nama;
    String nim;
    
    
   void perkenalan(){
       System.out.println("Hello Everyone");
       System.out.println("My Nim is ".concat(nim));
       System.out.println("My Name is ".concat(nama).concat("\n"));
   }
}
