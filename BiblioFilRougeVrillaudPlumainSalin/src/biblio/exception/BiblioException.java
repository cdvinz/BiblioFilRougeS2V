package biblio.exception;


public class BiblioException extends Exception {
   

	
	 /**
	 * Defaut serial ID propose par Eclipse.
	 */
	private static final long serialVersionUID = 1L;



	public BiblioException() 
	   {
	    super("Problème generique sur l'application bibliotheque");
	   }
	
	
	
   public BiblioException(String message) 
   {
    super(message);
   }

   public static void main (String [] args) { 
	   
	   System.out.println(new BiblioException ( "Erreur : carte bloquee"));
	   System.out.println(new BiblioException ());
	   System.out.println(new BiblioException ( "Nombre maximum d'emprunt atteints"));
	   
	   
   }
   

}
