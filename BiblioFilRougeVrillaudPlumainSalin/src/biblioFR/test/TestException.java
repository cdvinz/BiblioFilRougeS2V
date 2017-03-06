package biblioFR.test;

import biblio.exception.BiblioException;

public class TestException {
	   public static void main (String [] args) { 
		   
		   System.out.println(new BiblioException ( "Erreur : carte bloquée"));
		   System.out.println(new BiblioException ());
		   System.out.println(new BiblioException ( "Nombre maximum d'emprûnts atteints"));
	   }   
}
