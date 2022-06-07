package model;
public class Balok 
{
    public int p = 0, l = 0, t = 0;
    public int hitungVolume()
    {
        return p*l*t;
    }
    public void tampilkanVolume()
    {
        System.out.println("Volume = "+hitungVolume()+ "cm^3");
    }
    public void DeretanGenapGanjilBalok()
    {
        int n = hitungVolume();;
	    System.out.print("Deretan Bilangan Genap dari 1 sampai "+n+" adalah :\n ");
	    for (int i = 1; i <= n; i++) {
	    //if number%2 == 0 it means its an even number
	    if (i % 2 == 0) {
		System.out.print(i + " ");
	                    }
        }
    }
}