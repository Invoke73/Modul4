import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        Scanner input = new Scanner(System.in);

        System.out.println("================");
        System.out.println("Calculator");
        System.out.println("================");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma");
        System.out.println("4. Faktorial");
        System.out.println("5. Keluar");

        System.out.print("Pilih Operasi (1/2/3/4/5)");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                akarKuadrat();
                break;
            case 2:
                pangkat();
                break;
            case 3:
                Log();
                break;
            case 4:
                faktorial();
                break;
            case 5:
                System.out.println("Terimakasih telah menggunakan kalkulator ini");
                System.exit(0);
                break;
            default:
                System.out.println("input yang benar");
        }
    }

    public static void akarKuadrat(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        double angka = input.nextDouble();

        System.out.println("Hasil akar kuadrat dari "+angka+" adalah "+Math.sqrt(angka));
        mainMenu();
    }

    public static void pangkat() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        double angka = input.nextDouble();

        System.out.print("Masukkan Pangkat : ");
        double pangkat = input.nextDouble();

        System.out.println(angka+" Pangkat "+pangkat+" adalah "+Math.pow(angka,pangkat));
        mainMenu();
    }

    public static void Log() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        double angka = input.nextDouble();

        System.out.println("Logaritma natural dari "+angka+" adalah "+Math.log(angka));
        mainMenu();
    }

    public static void faktorial(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        double angka = input.nextDouble();

        double result = 1;

        for(int i=0;i < angka;i++){
            result *= angka;
        }

        mainMenu();
    }


}