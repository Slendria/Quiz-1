import java.util.Scanner;

import model.Balok;
import model.Kerucut;
import model.Kubus;
import model.Tabung;
import model.Prisma;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        String pesan = "Selamat Datang di Dunia Lingkaran Tahun ";
        int tahun = 2022;
        System.out.println(pesan + tahun);
        System.out.print("============================================\n");
        Scanner keyboard = new Scanner (System.in);

        String yn="";
        do {
            System.out.print ("Program Menghitung Bangun Ruang\n");
            System.out.print ("1. Menghitung Tabung\n2. Menghitung Kubus\n3. Menghitung Balok\n4. Menghitung Kerucut\n5. Menghitung Prisma\n6. Keluar ");
            System.out.print ("\nMasukkan Pilihanmu (1,2,3,4,5,6) : ");
            int pilihan=0;
            pilihan = keyboard.nextInt();

            if (pilihan==1){
                menuTabung(keyboard);
            }
            else if (pilihan==2){
                menuKubus(keyboard);
            }
            else if (pilihan==3){
                menuBalok(keyboard);
            }
            else if (pilihan==4){
                menuKerucut(keyboard);
            }
            else if (pilihan==5){
                menuPrisma(keyboard);
            }
            else if (pilihan==6)break; 
                System.out.print("\nApakah Anda ingin kembali ke menu utama? (y/n)");
             yn = keyboard.next();
             //clear screen
             bersihkanLayar();
        }
        while (yn.equals("y"));
        System.out.println("Terimakasih");
    }

    public static void bersihkanLayar()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
    /*
    public static void menuLingkaran (Scanner keyboard)
    {
        Lingkaran lingkaran1 = new Lingkaran();
        System.out.print ("Masukkan Jari Jari = ");
        lingkaran1.r = keyboard.nextInt();
        lingkaran1.luasLingkaran();
    }
    */
    public static void menuKubus (Scanner keyboard)
    {
        Kubus kubus1 = new Kubus();
        System.out.print ("Masukkan Sisi Kubus  = ");
        kubus1.s = keyboard.nextInt();
        kubus1.hitungLuas();
        kubus1.tampilkanLuas();
        kubus1.tampilkanVolume();
        kubus1.DeretanGenapGanjilKubus();
    }
    public static void menuBalok (Scanner keyboard)
    {
        Balok balok1 = new Balok();
        System.out.println("Masukkan Panjang Kubus = ");
        balok1.p = keyboard.nextInt();
        System.out.println("Masukkan Lebar Kubus = ");
        balok1.l = keyboard.nextInt();
        System.out.println("Masukkan Tinggi Kubus = ");
        balok1.t = keyboard.nextInt();
        balok1.hitungVolume();
        balok1.tampilkanVolume();
        balok1.DeretanGenapGanjilBalok();
    }

    public static void menuKerucut (Scanner keybaord)
    {
        Kerucut kerucut1 = new Kerucut();
        System.out.println("Masukkan Panjang Radius = ");
        kerucut1.rad = keybaord.nextInt();
        System.out.println("Masukkan Panjang Garis Pelukis = ");
        kerucut1.garpel = keybaord.nextInt();
        kerucut1.hitungLuas();
        kerucut1.tampilkanLuas();
        kerucut1.DeretanGenapGanjilKerucut();
    }

    public static void menuTabung (Scanner keyboard)
    {
        Tabung tabung1 = new Tabung();
        System.out.print("Masukkan Panjang Jari Jari Tabung = ");
        tabung1.r = keyboard.nextDouble();
        System.out.print("Masukkan Tinggi Tabung = ");
        tabung1.T = keyboard.nextDouble();
        tabung1.hitungLuasSelimut();
        tabung1.tampilkanLS();
        tabung1.hitungLuasPermukaan();
        tabung1.tampilkanLP();
        tabung1.DeretanGenapGanjilTabung();
    }
    public static void menuPrisma(Scanner keybaord)
    { 
        Prisma prisma1 = new Prisma();
        System.out.print("Masukkan Alas Segitiga Prisma : ");
        prisma1.a = keybaord.nextInt();
        System.out.print("Masukkan Tinggi Segitiga : ");
        prisma1.t = keybaord.nextInt();
        System.out.print("Masukkan Tinggi Prisma : ");
        prisma1.h = keybaord.nextInt();
        prisma1.hitungVolume();
        prisma1.tampilkanVolume();
        prisma1.DeretanGenapGanjilPrisma();
    }
}