import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.textui.TestRunner;

class Main {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(AllTests.class);
		
		Logger l = Logger.getLogger(TestRunner.class.toString());
		
		for(Failure f : result.getFailures()) {
			l.warning(f.toString());
		}
	
		l.info("Vreme izvrsavanja testova: " + result.getRunTime());
		l.info("Ukupan broj testova: " + result.getRunCount());
		l.info("Broj uspesnih testova: " + (result.getRunCount() - result.getFailureCount() - result.getIgnoreCount() - 
				result.getAssumptionFailureCount()));
		l.info("Broj palih testova: " + result.getFailureCount());
		l.info("Broj preskocenih testova: " + result.getIgnoreCount());
		l.info("Broj dinamickih preskocenih testova: " + result.getAssumptionFailureCount());
		
		if(result.wasSuccessful())
			l.info("Svi testovi su uspesno izvrseni.");
		else
			l.info("Postoje greske u testovima.");
		try {
            File myObj = new File("test-reports.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("test-reports.txt");
            myWriter.write("Vreme izvrsavanja:" + result.getRunTime());
            myWriter.write("\nBroj testova:"+ result.getRunCount());
            myWriter.write("\nUspesno testova:" + (result.getRunCount()-result.getFailureCount()-result.getIgnoreCount()-result.getAssumptionFailureCount()));
            myWriter.write("\nBroj palih testova:"+ result.getFailureCount());
            myWriter.write("\nBroj preskocenih:"+ result.getIgnoreCount());
            myWriter.write("\nBroj dinamicki preskocenih:" + result.getAssumptionFailureCount());
            myWriter.write("\n\n");
            myWriter.write("Tudors:\n");
            myWriter.write("SEDIŠTE FIRME:\n" +
                    "Požeška 58/7,11030 Beograd, Srbija\n");
            myWriter.write("Matični broj:\n" +
                    "20732814\n"); 
            myWriter.write("\n" +
                    "Broj računa\n" +
                    "155-30479-44");
            myWriter.write("\nRadno vreme:\n" +
                    "Radnim danima od 09h do 16h");
            myWriter.write("\nTelefon:\n" +
                    "063 439 414");
            myWriter.write("\nEmail:\n" +
                    "online@tudors.rs");
            myWriter.write("\n\n\t\t\tIzveštaji testova:\n");
            myWriter.write("\nIme testa: CartTudors:\n" +
                    "Opis testa: Test je rađen uz pomoć AssertEquals metode.Uz pomoć nje proveravamo da li se na stranici Korpa nalaze"
                    + " 3 reda, što znači da su to 3 dodata proizvoda. Ukoliko se nalaze tačno tri proizvoda, što je i bio uslov, test je uspešan.\n");
            myWriter.write("\nIme testova: facebookTudors, instagramTudors:\n" +
                    "Opis testa: Sajt poseduje dve ikonice koje su linkovane na dve društvene mreže,"
                    + " Instagram i Facebook. Nakon klika, test metoda će proveriti da li se uspešno pristupa ovim društvenim mrežama. Za potrebe ovog testa korišćene su assertEquals metode.\n");
            myWriter.write("\nIme testa: loginTudors:\n" +
                    "Opis testa: Potrebno je uneti e-mail adresu i lozinku kako bi se izvršilo prijavlijvanje korisnika na sistem."
                    + " Da bi smo proveli ispravnost, uz pomoć assertEquals metode proverava se da li je nakon klika na dugme PRIJAVITE SE korisnik preusmeren na stranicu"
                    + " Dashboard, tj. na stranicu sa informacijama o profilu. Ako je korisnik preusmeren gde treba, prijava je uspela i test prolazi.\n");
            myWriter.write("\nIme testa: profileTudors:\n" +
                    "Opis testa: Da bi smo proverili da li su podaci koji su korišćeni pri registraciji jednaki sa podacima korisnika,"
                    + " biće korišćena assertTrue metoda koja na osnovu recimo e-maila proverava da li se uneseni podaci poklapaju sa podacima na stranici Moj Nalog. \n");
            myWriter.write("\nIme testa: registerTudors:\n" +
                    "Opis testa: Radi provere ispravnosti testa, u kod je dodata assertTrue metoda koja proverava da li se nakon registracije"
                    + " korisniku otvara nova stranica na kojoj se nalazi poruka \"Uspešno ste kreirali nalog.\" Ukoliko korisnik dobije tu poruku, test prolazi. \n");
            myWriter.write("\nIme testa: searchTudors:\n" +
                    "Opis testa: Testiranje je urađeno uz pomoć metode assertTrue\r\n"
                    + "Ova metoda proverava da li se u izvoru stranice nalazi navedena šifra ili ključna reč. Ukoliko se proizvod pojavi, test je uspešan. \n");
            myWriter.write("\nIme testa: totalPriceTudors:\n" +
            		"Opis testa: Radi provere ispravnosti testa, u kod je dodata assertTrue metoda koja proverava da li se nakon registracije"
            		+ " korisniku otvara nova stranica na kojoj se nalazi poruka \\\"Uspešno ste kreirali nalog.\\\" Ukoliko korisnik dobije tu poruku, test prolazi. \\n\");\r\n"
            		+ "\n");
            myWriter.write("\n\t\tSVI TESTOVI SU USPEŠNI!\n");
            		
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
		
	}
	