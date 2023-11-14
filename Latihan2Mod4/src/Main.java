

import java.util.Scanner;

public class Main {
   public static String teks;

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner input = new Scanner(System.in);

        System.out.println("==== Menu Teks Analyzer ====");
        System.out.println("1. Masukkan teks ");
        System.out.println("2. Hitung Jumlah karakter ");
        System.out.println("3. Hitung Jumlah Kata");
        System.out.println("4. Cari kata dalam Teks");
        System.out.println("5. Keluar ");

        System.out.print("Pilihan Anda : ");
        int pilih = input.nextInt();

        input.nextLine();

        switch (pilih) {
            case 1:
                insertText(input);
                break;
            case 2:
                countChar();
                break;
            case 3:
                countWord();
                break;
            case 4:
                findWord(input);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("input tidak ada");
        }

    }

    public static void insertText(Scanner input){

        System.out.print("Masukkan Teks : ");
        teks = input.nextLine();

        if(!teks.isEmpty()) {
            System.out.println("Teks telah dimasukkan!!");
        }
        menu();
    }

    public static void countChar(){
        System.out.println("Jumlah karatker : "+teks.length());
        menu();
    }

    public static void countWord(){
        if(teks.isEmpty()){
            System.out.println("Teks kosong!! kembali ke menu");
            return;
        }

        String[] kumpulanKata = teks.split("\\s+");

        System.out.println("Jumlah kata dalam teks :"+kumpulanKata.length);
        menu();
    }

    public static void findWord(Scanner input) {
        if (teks.isEmpty()) {
            System.out.println("Teks kosong. Silakan masukkan teks terlebih dahulu.\n");
            return;
        }

        System.out.print("Masukkan kata yang ingin dicari: ");
        String kataCari = input.nextLine();

        int count = 0;
        String[] kataArray = teks.split("\\s+"); // split berguna untuk membuat sebuah Array Of String dari sebuah String awal yang dipisahkan oleh tanda pemisah tertentu atau panjang tertentu
        for (String kata : kataArray) {
            if (kata.equalsIgnoreCase(kataCari)) {
                count++;
            }
        }

        System.out.println("Kata '" + kataCari + "' ditemukan sebanyak " + count + " kali dalam teks.\n");

        menu();

    }
}