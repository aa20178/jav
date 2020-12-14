package tp1;
import java.util.Date;
import tp1.*;

public class UneDate
{
	
		public Date entree, date18; 
		public int tab[] ;
		
		public UneDate()
		{
				date18 = new Date();			 
				entree = new Date(); 
				tab = new int[3] ; 
				String saisie = new String(""); 
		}
		
	
	public Date saisieTabNaive()
	 {
		 for (int i = 0 ; i< 3 ; i++)
		{
            do
			{
				Terminal.ecrireStringln("entrer (j,m,a):");   
				tab[i] = Terminal.lireInt(); 
			}
			while ( tab[i] < 0) ;
			 
		}
		
		entree.setDay(tab[0]);
		entree.setMonth(tab[1]);
		entree.setYear(tab[2]);
		 
	 }
	
	
	public static void main(String[] args)
	{
		UneDate u = new UneDate(); 
		
		Terminal.ecrireStringln(""+u.entree.toString());
		Terminal.ecrireStringln(""+u.date18.toString());
		Terminal.ecrireStringln(""+u.entree.before(u.date18));

		for (int i = 0 ; i< 3 ; i++)
		{
			Terminal.ecrireIntln( u.tab[i]);   		
		}
		
	}
}
