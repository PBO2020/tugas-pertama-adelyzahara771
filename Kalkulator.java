/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuga1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Kalkulator {

    private int hasilpengurangan;
    private int hasilpembagian;
    private int angka1;
    private int angka2;
    private int hasilperkalian;
    private int hasilpenjumlahan;

    public static void main(String[] args) {

    }

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public int getAngka1() {
        return this.angka1;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }

    public int getAngka2() {
        return this.angka2;
    }

    ;

    public void sethasilpenjumlahan(int hasilpenjumlahan) {
        this.hasilpenjumlahan = hasilpenjumlahan;
    }

    public int getpenjumlahan() {
        hasilpenjumlahan = angka1 + angka2;
        return hasilpenjumlahan;
    }

    public void sethasilpengurangan(int hasilpengurangan) {
        this.hasilpengurangan = hasilpengurangan;
    }

    public int getpengurangan() {
        hasilpengurangan = angka1 - angka2;
        return hasilpengurangan;
    }

    public void sethasilperkalian(int hasilperkalian) {
        this.hasilperkalian = hasilperkalian;
    }

    public int getperkalian() {
        hasilperkalian = angka1 * angka2;
        return hasilperkalian;
    }

    public void sethasilpembagian(int hasilpembagian) {
        this.hasilpembagian = hasilpembagian;
    }

    public int getpembagian() {
        hasilpembagian = angka1 / angka2;
        return hasilpembagian;
    }

}
