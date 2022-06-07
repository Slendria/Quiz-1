package model;
public class Tabung {
    public double r;
    public double T;
        public final double PI = 22.0/7;
    public Tabung(){
        this.r=10;
    }
    public Tabung(int r){
        this.r=r;
    }
    public double hitungLuasSelimut()
    {
        double LS = 2 * PI * r * T;
        return LS;        
    }
    public double hitungLuasPermukaan()
    {
        double LP = hitungLuasSelimut() + (2 * PI * Math.pow(r , 2));
        return LP;
    }
    public void tampilkanLS()
    {
        System.out.println("Luas Selimut Tabung = " + hitungLuasSelimut());
    }
    public void tampilkanLP()
    {
        System.out.println("Luas Permukaan Tabung = " + hitungLuasPermukaan());
    }
    public void DeretanGenapGanjilTabung()
        {
        double n = hitungLuasSelimut();;
	    System.out.print("Deretan Bilangan Genap dari 1 sampai "+n+" adalah :\n ");
	    for (int i = 1; i <= n; i++) {
	    //if number%2 == 0 it means its an even number
	    if (i % 2 == 0) {
		System.out.print(i + " ");
	                    }
        }
        }
}