import Terminal.* ;
public class DossierCandidatureGER
{
  // Ici des attributs
	private String nom;
	private String numero;
	private String statut ; 
	
	private int noteE; 
	private int noteO; 
	private boolean emarge; 
	
	public boolean getEmarge()
	{
		return emarge;
	}

	public String getNom()
	{
		return nom;
	}
	public String getNumero()
	{
		return numero;
	}
	
  // constructeur
  public DossierCandidatureGER(String nom, String numero)
  {
	  this.nom = nom; 
	  this.numero = numero; 
	  this.emarge = false; 
	  this.statut = "ENREGISTRE";
  }
  
  
  public void enregistrerEmargementEpreuveEcrite()
  {
	  emarge = true ; 
	  this.statut = "EMARGE";

  }
  
  public void enregistrerNoteEpreuveEcrite(int note)
  {
	  if (emarge = true )
	  {
		  noteE = note ;
		  this.statut = "NOTE_ECRIT_TRANSMISE";
	  }
	  else 
	  {
		  
	  }

  }
  
  public void publierResultatEcrit()
  {
	  Terminal.ecrireStringln("Note: " + noteE + "\nStatut: " + statut);
  }
  public void enregistrerNoteEpreuveOrale(int note)
  {
	  noteO = note ;
	  	  this.statut = "NOTE_ORAL_TRANSMISE";
	  
  }
  public void enregistrerAbsenceALOral()
  {
	  noteO = 0 ;
	  this.statut = "NOTE_ORAL_TRANSMISE";
	  
  }
  public void publierResultatFinal()
  {
  	  Terminal.ecrireStringln("Note Ecrite: " + noteE + "\nNote Oral: " + noteO + "\nStatut: " + statut);
  }
  public String toString()
  {
	  String toto =  "Nom :" + nom + "\nNumero: " + numero+ "\nStatut : " + statut ;
	   + Note Ecrite: " + noteE + "\nNote Oral: " + noteO + "\nStatut: " + statut;  
  }
  
}
