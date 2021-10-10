package classes;

public class Laptop extends Device {
private double autonomie;

public double getAutonomie() {
	return autonomie;
}

public void setAutonomie(double autonomie) {
	this.autonomie = autonomie;
}

@Override
public String toString() {
	return "Laptop [autonomie=" + autonomie + ", Device=" + super.toString() + "]";
}

public Laptop(String marque, String systeme, String cpu, String carte, double prix, double autonomie) {
	super(marque, systeme, cpu, carte, prix);
	this.autonomie = autonomie;
}

}
