package classes.main;

import classes.Device;
import classes.Laptop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device d=new Device("hp","windows","i5 10G","Nvidea GF",2600);
		
		System.out.println(d.toString());
		Laptop l=new Laptop("asus", "windows","cpu i7", "AMD radeon", 3200, 4);
		System.out.println(l.toString());
	}

}
