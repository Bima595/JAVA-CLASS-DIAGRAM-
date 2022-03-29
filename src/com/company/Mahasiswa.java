package com.company;

import java.util.Scanner;

public class Mahasiswa {
    Scanner in = new Scanner(System.in);
    private String Nama;
    private String Nim;
    private String Pasword;

    public String getNim() {

        return Nim;
    }

    public void setNim(String Nim) {
        if (Nim.length() != 15) {
            System.out.println("NIM wajib Harus 15");
            System.out.print("Masukkan Nim Anda: ");
            Nim = in.next();
         setNim(Nim);
        } else {
            this.Nim = Nim;
        }
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getPasword() {
        return Pasword;
    }

    public void setPassword(String Password) {
        if (Pasword.length() < 8) {


            System.out.println("Password Anda Minimal 8 Karakter");
            System.out.print("Masukkan Password Anda: ");
            Nama = in.next();
            setPassword(Pasword);
        } else {
            this.Pasword = Pasword;
        }
    }

    public void input() {
        System.out.println("Daftar / Register");
        System.out.print("Masukkan Nama Anda: ");
        Nama = in.nextLine();
        setNama(Nama);

        System.out.print("Masukkan Nim Anda: ");
        Nim = in.next();
        setNim(Nim);

        System.out.print("Masukkan Password Anda: ");
        Pasword = in.next();
        setPassword(Pasword);

    }

    public void menampilkan() {
        System.out.println("");
        System.out.println("");
        System.out.print("Hai " + getNama());
        System.out.println(" data kamu sudah terdaftar");
        System.out.println("Nama  : " + getNama());
        System.out.println("Nim   : " + getNim());
        System.out.println("password : " + getPasword());
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.input();
        mhs.menampilkan();
    }
}