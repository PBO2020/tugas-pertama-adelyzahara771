
package tuga1;

public class opp {

    public static void main(String[] args) {
       
       Kalkulator del=new Kalkulator();
       del.setAngka1(40);
       del.setAngka2(20);
       
        System.out.println("Nama : PUTRI ADELYA ZAHRA");
        System.out.println("=========================================");
        System.out.println("Angka 1 = "+del.getAngka1());
        System.out.println("Angka 2 = "+del.getAngka2());
        System.out.println("=========================================");
        System.out.println("Hasil Penjumlahan = "+del.getpenjumlahan());
        System.out.println("Hasil Pengurangan = "+del.getpengurangan());
        System.out.println("Hasil Perkalian = "+del.getperkalian());
        System.out.println("Hasil Pembagian = "+del.getpembagian());
}
}
