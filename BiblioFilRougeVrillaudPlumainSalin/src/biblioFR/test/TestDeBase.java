package biblioFR.test;

import biblio.dao.ExemplairesDao;
import biblio.dao.UtilisateursDao;

public class TestDeBase {

	public static void main(String[] args) {
		ExemplairesDao ed1=new ExemplairesDao ();
		System.out.println(ed1.findByKey(1));
		System.out.println(ed1.findByKey(2));
		UtilisateursDao ud1=new UtilisateursDao ();
		System.out.println(ud1.findByKey(1));
	}
}
