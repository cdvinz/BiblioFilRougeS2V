package biblioFR.exception;


public class BiblioException extends Exception {
   

	
	 /**
	 * Defaut serial ID propose par Eclipse.
	 */
	private static final long serialVersionUID = 1L;



	public BiblioException() 
	   {
	    super("Problème générique sur l'application bibliothèque");
	   }
	
	
	
   public BiblioException(String message) 
   {
    super(message);
   }
}
