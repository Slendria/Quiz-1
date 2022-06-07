package model;
public class Kubus {
        public int s = 0;
        public int  hitungLuas(){
            //Long luas = 6 * Math.pow(s, 2);
            //System.out.println("Maka Luas Kubus = "+luas+"cm");
            return 6 * (s*s);
        }
        public int hitungVolume (){// sisi kali sisi kali sisi kali sisi
            return s*s*s;
        }
        public void tampilkanLuas(){
            System.out.println("Sisi = "+s+" cm");
            System.out.println("Luas = "+ hitungLuas());
        }
        public void tampilkanVolume(){
            System.out.println("Sisi = "+s+" cm");
            System.out.println("Volume = "+ hitungVolume());
        }
        public void DeretanGenapGanjilKubus()
        {
        double n = hitungVolume();;
	    System.out.print("Deretan Bilangan Genap dari 1 sampai "+n+" adalah :\n ");
	    for (int i = 1; i <= n; i++) {
	    //if number%2 == 0 it means its an even number
	    if (i % 2 == 0) {
		System.out.print(i + " ");
	                    }
        }
        }
 }