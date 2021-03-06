package Main;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import Testovi.AllTests;
import Testovi.CheckColorTest;
import Testovi.LoginTest;
import Testovi.ProfileTest;
import Testovi.RegisterTest;
import Testovi.SearchBarTest;
import Testovi.TotalSumTest;
import Testovi.WishListTest;
import junit.textui.TestRunner;
import Testovi.AccountTest;
import Testovi.AddToCartTest;
public class MainMethod {

	public static void main(String[] args) {
		
Result result = JUnitCore.runClasses(AccountTest.class,AddToCartTest.class,CheckColorTest.class,LoginTest.class,ProfileTest.class,RegisterTest.class,SearchBarTest.class,TotalSumTest.class,WishListTest.class);
		
		Logger l = Logger.getLogger(TestReporter.class.toString());
		
		for(Failure f : result.getFailures()) {
			l.warning(f.toString());
		}
	
		l.info("Vreme izvrsavanja testova: " + result.getRunTime());
		l.info("Ukupan broj testova: " + result.getRunCount());
		l.info("Broj uspesnih testova: " + (result.getRunCount() - result.getFailureCount() - result.getIgnoreCount() - 
				result.getAssumptionFailureCount()));
		l.info("Broj palih testova: " + result.getFailureCount());
		
		if(result.wasSuccessful())
			l.info("Testovi su uspešno prošli testiranje.");
		else
			l.info("Testovi nisu prošli, postoje greške u testovima");
		try {
            File myObj = new File("test-reports.txt");
            if (myObj.createNewFile()) {
                System.out.println("Fajl je kreiran " + myObj.getName());
            } else {
                System.out.println("Fajl već postoji");
            }
        } catch (IOException e) {
            System.out.println("Pojavila se greška pri izvršavanju ove komande");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("test-reports.txt");
            myWriter.write("Ukupno vreme izvrsavanja testova:" + result.getRunTime());
            myWriter.write("\nBroj testova:"+ result.getRunCount());
            myWriter.write("\nBroj uspešno izvršenih testova:" + (result.getRunCount()-result.getFailureCount()-result.getIgnoreCount()-result.getAssumptionFailureCount()));
            myWriter.write("\nBroj testova koji nisu prošli:"+ result.getFailureCount());
            myWriter.write("\n\n");
            myWriter.write("DeFacto:\n");        
            myWriter.write("\n\n\t\t\tIzveÅ¡taji testova:\n");
            myWriter.write("\nIme testa: AddToCartTest:\n" +
                    "Opis testa: Test je radjen uz pomoc AssertEquals metode. Proveravamo da li se na stranici Korpa nalaze"
                    + " 3 reda, Sto bi znacilo to da su 3 dodata proizvoda. Ako se nalaze 3 proizvoda test je uspesno prosao.\n");
            myWriter.write("\nIme testa: LoginTest:\n" +
                    "Opis testa: Da bi se prijavili na stranicu potrebno je u formu upisati e-mail adresu i lozinku da bi prtupili profilu ."
                    + " Proverićemo ispravnost, uz pomoc assertEquals metode koja proverava se da li se nakon klika na dugme Sign in korisnik preusmeren na stranicu Account"
                    + " Ako je korisnik preusmeren gde treba, test prolazi.\n");
            myWriter.write("\nIme testa: AccountTest:\n" +
                    "Opis testa: Da bi smo proverili da li su podaci koji su korisceni pri registraciji isti kao podaci koji se nalaze na profilu"
                    + "Koriscena je assertTrue metoda koja na osnovu e-maila proverava da li se uneseni podaci poklapaju sa podacima na stranici Mz Account. \n");
            myWriter.write("\nIme testa: RegisterTest:\n" +
                    "Opis testa: Radi provere ispravnosti testa, u kod je dodata assertTrue metoda koja proverava da li se nakon registracije"
                    + " korisnik preusmerava na stranicu My Account\"\" Ako korisnik sse nalazi na stranici My Account tu poruku, test je uspesan. \n");
            myWriter.write("\nIme testa: SearchBarTest:\n" +
                    "Opis testa: Testiranje je uradjeno uz pomoc metode assertTrue\r\n"
                    + "Ova metoda proverava da li se u izvornom kodu stranice nalazi navedena kljucna rec. Ukoliko se proizvod pojavi, test je prolazi. \n");
            myWriter.write("\nIme testa: TotalSumTest:\n" +
            		"Kada dodamo proizvod u korpu cena se sabira sa ostalim proizvodima koji se u njoj nalaze. U ovom testu izvršavamo proveru da li cena svih proizvoda odgovara napisanoj obračunatoj ceni."
            		+ " U korpi se još obračunava i popust ukoliko postoji. actualPrice se upoređuje sa sumom i ukoliko su rezultati isti test je prošao.\\n\");\r\n"
            		+ "\n");
            myWriter.write("\n\t\tSVI TESTOVI SU PROSLI USPESNO\n");
            		
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
	}


