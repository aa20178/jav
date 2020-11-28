
public class DossierCandidatureGER
{
  // Ici des attributs
	private String nom;
	private String numero;
	private String statut ; 
	
	private int noteE; 
	private int noteO; 

	public String getNom()
	{
		return nom;
	}
	public String getNumero()
	{
		return numero;
	}	
	public String getStatut()
	{
		return statut;
	}
	
  // constructeur
  
  
  public void enregistrerEmargementEpreuveEcrite() throws Exception
  {
	  	  if (this.statut == "ENREGISTRE" )
		this.statut = "EMARGE";
			  else 
	  {
		  throw new Exception("STATUT INCORRECT");
	  }

  }
  
  public void enregistrerNoteEpreuveEcrite(int note) throws Exception
  {
	  if (this.statut == "EMARGE" )
	  {
		  noteE = note ;
		  this.statut = "NOTE_ECRIT_TRANSMISE";
	  }
	  	  else if (this.statut == "ENREGISTRE" )
	  {
		  throw new Exception("EMARGEMENT NON FAIT");
	  }
	  
	  else 
	  {
		  throw new Exception("ECRIT DEJA TRANSMIS");
	  }

  }
  
  public void publierResultatEcrit()
  {
	  Terminal.ecrireStringln("Note ecrite: " + noteE + "\nStatut: " + statut+"\n");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
    public void admissible() throws Exception
  {
	  if (this.statut == "NOTE_ECRIT_TRANSMISE" )
	  {
		  	  if (this.noteE < 10 )
		  	  {
						  this.statut = "NON_ADMISSIBLE";
					
  
			  }
			  else 		  this.statut = "ADMISSIBLE";


	  }
	  	  	  else if (this.statut == "ENREGISTRE" ||this.statut == "EMARGE")
	  {
		  throw new Exception("NON EMARGE/ENREGISTRE");
	  }
	  else 		  throw new Exception("ADMISSIBILITE DEJA ENREGISTRE");

 }
  
  
  
  
  
  
  
  public void enregistrerNoteEpreuveOrale(int note) throws Exception
  {
	  if (this.statut == "ADMISSIBLE" )
	  {
		  noteO = note ;
		  this.statut = "NOTE_ORAL_TRANSMISE";
	  }

	  else if (this.statut == "ABSENT_ORAL" )
	  {
  		  throw new Exception("ABSENT NE PEUT PAS AVOIR D'ORAL");
	  }

  	  else if (this.statut == "ENREGISTRE" || this.statut == "EMARGE" ||this.statut == "NOTE_ECRIT_TRANSMISE" || this.statut == "NON_ADMISSIBLE"|| statut =="NOTE_ORAL_TRANSMISE")
  	  {
		  		  throw new Exception("STATUT INCORRECT");

	  }


  	  else 
	  {
		  throw new Exception("DEJA ADMIS/JETE");
	  }

	  
			  
  }
  public void enregistrerAbsenceALOral() throws Exception
  {
	  	  if (this.statut == "ADMISSIBLE" )
	  	  {
			  this.statut = "ABSENT_ORAL";
		  }
		    	  else 
	  {
		  throw new Exception("STATUT INCORRECT");
	  }
	  
  }
  
    
    public void admis() throws Exception
  {
	  if (this.statut == "NOTE_ORAL_TRANSMISE" )
	  {
		  	  if (this.noteO > 10 )
		  	  {
						  this.statut = "ADMIS";
					
  
			  }
			  else 		  this.statut = "NON ADMIS";


	  }
	  	  	  else throw new Exception("STATUT INCORRECT");

 }
  
  
  
  
  
  
  
  public void publierResultatFinal() throws Exception
  {
  	  Terminal.ecrireStringln("Note Ecrite: " + noteE + "\nNote Orale: " + noteO + "\nStatut: " + statut+"\n");
  }
  public String toString()
  {
	  String toto =  "Nom :" + nom + "\nNumero: " + numero+ "\nStatut : " + statut +"\n";
	  return toto; 
  }
  
  public static void main (String[] args)
  {
	  DossierCandidatureGER dossier = new DossierCandidatureGER("Etudiant","444");
	  try
	  {
	  Terminal.ecrireStringln(dossier.toString());

	  dossier.enregistrerEmargementEpreuveEcrite();
  	  Terminal.ecrireStringln(dossier.toString());

	  dossier.enregistrerNoteEpreuveEcrite(16);
	  dossier.publierResultatEcrit();

	  dossier.admissible();
   	  Terminal.ecrireStringln(dossier.toString());
   	  
	  dossier.enregistrerNoteEpreuveOrale(11);
   	  Terminal.ecrireStringln(dossier.toString());

	  dossier.admis();
   	  Terminal.ecrireStringln(dossier.toString());
   	  dossier.publierResultatFinal();

	  
	  
 }
 catch (Exception e)
 {
      e.printStackTrace(); 
	  return ;
	  
  }
}
  
  
  
  
  
}
