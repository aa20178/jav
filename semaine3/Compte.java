package semaine3;
import java.util.Date;
import java.util.Scanner;
import Terminal.*;
public class Compte
{
	private int solde = 0;
	
	public Compte()
	{
		solde = 0 ;		
	}
	public void deposer(int montant)
	{
		solde = solde + montant;
	}
	public void retirer(int montant)
	{
		solde = solde -montant;
	}
	public void virerVers(int montant, Compte destination)
	{
		this.retirer(montant);
		destination.deposer(montant);
	}
	
	public String toString()
	{
	return "solde: "+ solde;
	}
	
	public static void main(String[] args)
	{
		Terminal.ecrireStringln("Toto");

		
	}
}
