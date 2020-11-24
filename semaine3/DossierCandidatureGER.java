import Terminal.* ;
public class DossierCandidatureGER
{
  // Ici des attributs
	private String nom;
	private String numero;
	private String statut ; 
	private int note; 
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
	  this.note = 0 ;
	  this.statut = "ENREGISTRE";
  }
  
  
  public void enregistrerEmargementEpreuveEcrite()
  {
	  emarge = true ; 
	  this.statut = "EMARGE";

  }
  
  public void enregistrerNoteEpreuveEcrite(int note)
  {
	  note = note ;
	  this.statut = "NOTE_ECRIT_TRANSMISE";

  }
  
  public void publierResultatEcrit()
  {
	  //Terminal.
  }
  public void enregistrerNoteEpreuveOrale(int note){
  }
  public void enregistrerAbsenceALOral(){
  }
  public void publierResultatFinal(){
  }
  public String toString(){return "";  }
  
}
