/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_algoritma_arya;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class stack {
int stack[];
    int indek;
    //Memesan Panjang Stack
    public stack(int a){
        stack = new int [a];
    }
    //Menghitung Panjang Stack
    public void Count(){
        int hasil = stack.length;
        System.out.println("Jumlah Stak \t:\t"+hasil);
    }
    //Mengisi Nilai dalam Stack
    public void push(int isi){
            stack[indek] = isi;
            indek++;
        }
    //Untuk Melihat Elemen Paling Atas
    public void Peek(){
        int hasil = 0;
        hasil+=stack.length-1;
        System.out.println("Peek Stack Adalah\t:\t"+stack[hasil]);
    }
    public void Print(){
        for(int i = stack.length-1 ;i>=0 ; i--){
                System.out.println(stack[i]);
            }
    }
    public void pop(int angka){
        for(int i = 0; i<stack.length ; i++){
            if(stack[i]==angka){
                stack[i]=0;
            }
        }
    }
    public static void main(String[]args){
        Scanner ir = new Scanner(System.in);
        System.out.print("Masukan Batas \t:\t");
        int batas = ir.nextInt();
        stack irin = new stack(batas);
        for(int i = 0; i<batas ; i++){
            System.out.print("Masukan Isi "+(i+1)+"\t:\t");
            int isi = ir.nextInt();
            irin.push(isi);
        }
        System.out.print("______________________________________\n");
        irin.Count();
        System.out.print("______________________________________\n");
        irin.Print();
        System.out.print("______________________________________\n");
        irin.Peek();
        System.out.print("______________________________________\n");
        System.out.print("Berapa Kali Anda Melakukan POP\t:\t");
        int bts = ir.nextInt();
        int angka;
        for(int i = 1 ; i<=bts ; i++){
            System.out.print("Masukan Angka POP\t:\t");
            angka = ir.nextInt();
            irin.pop(angka);
            System.out.print("______________________________________\n");
        }
        irin.Print();
    }
}
