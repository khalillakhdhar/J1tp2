package classes;

public class Mobile extends Device {
private int screensize;

public int getScreensize() {
	return screensize;
}

public void setScreensize(int screensize) {
	this.screensize = screensize;
}

@Override
public String toString() {
	return "Mobile [screensize=" + screensize + ", toString()=" + super.toString() + "]";
}

public Mobile(String marque, String systeme, String cpu, String carte, double prix, int screensize) {
	super(marque, systeme, cpu, carte, prix);
	this.screensize = screensize;
}



}
