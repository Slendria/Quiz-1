package model;

public class Prisma 
{
    public Prisma(){
        this.r=10;
    }
    public Prisma(int r){
        this.r=r;
    }
    public int a = 0, t = 0, h = 0;
    public double hitungVolume()
    {
        double volume = (1.0/2*a*t)*h;
        return volume;
    }
    public void tampilkanVolume()
    {
        System.out.println("Volume = "+ hitungVolume()+ " cm^3");
    }
    public void DeretanGenapGanjilPrisma()
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