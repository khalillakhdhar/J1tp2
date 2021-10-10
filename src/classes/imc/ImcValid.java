package classes.imc;

public class ImcValid {
public boolean validePoid(double poids)
{
return poids>30 &&poids < 150;	
}
public boolean valideTaille(double taille)
{
	return taille>1 &&taille <2.5;
}
}
