package useDate;
import java.util.Date;
public class Main{

public static void main(String[] args){
Date revolution = new Date(-111,6,14);
Date decouverte_amerique = new Date(1492-1900,9,12);
System.out.print("revolution.before(decouverte_amerique): ");
System.out.println(revolution.before(decouverte_amerique));
System.out.print("decouverte_amerique.before(revolution): ");
System.out.println(decouverte_amerique.before(revolution));
System.out.print("revolution.before(revolution): ");
System.out.println(revolution.before(revolution));
}
}
