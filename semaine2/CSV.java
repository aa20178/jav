package tp1;
import java.util.Date;
import java.util.Scanner;
public class CSV
{
	
		public String entree; 
		public Date date ; 
		public Scanner sc ; 
		public String nom; 
		public String prenom; 
		
		public CSV()
		{
				entree = new String("\"toto\";\"tata\";2 3 8"); 
				date = new Date();	
				sc = new Scanner(System.in) ;
				nom = "";
				prenom="";
				
		}
		
	
	public void saisieTabNaive()
	{
		System.out.print("Entrez la ligne CSV:");   
		//while(sc.hasNextLine())
		entree= sc.nextLine();
	 }
	
	public void traiteString()
	{
		String[] values = new String [3] ; 
		String[] sdate = new String [3]  ;

	 	try
		{
			values = entree.split(";");
		}
		catch(Exception e)
		{		
			System.out.println("Erreur de format");
			//System.exit(-1);
			//saisieTabNaive();
		}

		
		try
		{
			sdate = values[2].split("/");
		}
		catch(Exception e)
		{		
			System.out.println("Erreur de format");
			//System.exit(-1);
			//saisieTabNaive();
		}
		
				try
		{
		nom = values[0].replace("\"","");
		prenom=values[1].replace("\"","");		
		
		}
				catch(Exception e)
		{		
			System.out.println("Erreur de format");
		}	
		
		try
		{
		prenom=values[1].replace("\"","");		
		
		}
				catch(Exception e)
		{		
			System.out.println("Erreur de format");
		}
		

				try
		{
		//Calendar c = new GregorianCalendar();
		//c.set(Calendar.HOUR_OF_DAY,0);
		
		date.setMinutes(0);
		date.setHours(0);
		date.setSeconds(0);
		date.setDate(Integer.parseInt(sdate[0]));
        date.setMonth(Integer.parseInt(sdate[1])-1);
        date.setYear(Integer.parseInt(sdate[2])-1900);		
		}
				catch(Exception e)
		{		
			System.out.println("Erreur de format");
		}

        		 
	 }
	
	
	
	
	public static void main(String[] args)
	{
		CSV u = new CSV(); 
		u.saisieTabNaive();
		u.traiteString();
		System.out.println(u.nom);
		System.out.println(u.prenom);
		System.out.println(""+u.date.toString());

		
	}
}
