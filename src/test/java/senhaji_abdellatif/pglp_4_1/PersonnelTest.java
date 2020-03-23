package senhaji_abdellatif.pglp_4_1;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

/**
 * tests unitaires sur la classe Personnel.
 * @author user
 *
 */
public class PersonnelTest {

	@Test
	/**
	 * teste le constructeur.
	 */
	public void test() {
		ArrayList<String> numero = new ArrayList<String>();
    	numero.add("04.38.32.25.35");
    	numero.add("02.23.42.83.46");
        Personnel p = new Personnel.Builder("an", "Ir", LocalDate.of(1953, 06, 02), numero).build();
        p.print();
	}

}
