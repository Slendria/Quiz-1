package model;
public class Kerucut {
    public int rad, garpel;
    public double phi = 3.14;
    public double hitungLuas() 
    {
        double luas = phi*rad+(rad+garpel);
        return luas;
    }
    public void tampilkanLuas(){
        System.out.println("Luas Kerucut = " + hitungLuas()+ " cm");
    }
    public void DeretanGenapGanjilKerucut()
    {
        double n = hitungLuas();;
	    System.out.print("Deretan Bilangan Genap dari 1 sampai "+n+" adalah :\n ");
	    for (int i = 1; i <= n; i++) {
	    //if number%2 == 0 it means its an even number
	    if (i % 2 == 0) {
		System.out.print(i + " ");
	                    }
        }
    }
}