/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

import java.util.ArrayList;

public class latihanMandiri5 {
    public static void main(String[] args) {

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(70);
        angka.add(95);
        angka.add(60);
        angka.add(88);
        angka.add(75);

        int terbesar = angka.get(0);

        for (int a : angka) {
            if (a > terbesar) {
                terbesar = a;
            }
        }

        System.out.println("Data angka : " + angka);
        System.out.println("Nilai terbesar : " + terbesar);
    }
}
