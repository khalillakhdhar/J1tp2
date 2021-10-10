package classes;

public class Device {
private String marque;
private String systeme,cpu,carte;
private double prix;
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getSysteme() {
	return systeme;
}
public void setSysteme(String systeme) {
	this.systeme = systeme;
}
public String getCpu() {
	return cpu;
}
public void setCpu(String cpu) {
	this.cpu = cpu;
}
public String getCarte() {
	return carte;
}
public void setCarte(String carte) {
	this.carte = carte;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public Device(String marque, String systeme, String cpu, String carte, double prix) {
	super();
	this.marque = marque;
	this.systeme = systeme;
	this.cpu = cpu;
	this.carte = carte;
	this.prix = prix;
}
public Device() {
	super();
}
@Override
public String toString() {
	return "Device [marque=" + marque + ", systeme=" + systeme + ", cpu=" + cpu + ", carte=" + carte + ", prix=" + prix
			+ "]";
}



}
