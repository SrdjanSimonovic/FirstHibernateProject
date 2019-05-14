package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bussinesService.CrudMetode;

public class GlavnaKlasa {

	public static void main(String[] args) {

		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unesite naziv marke.");
		String nazivMarke = scanner.nextLine();
		
		System.out.println("Unesite zemlju.");
		String zemlja = scanner.nextLine();
		
		System.out.println("Unesite grad.");
		String grad = scanner.nextLine();
		
		System.out.println("Unesite ulicu.");
		String ulica = scanner.nextLine();
		
		scanner.close();
		
		CrudMetode metode = new CrudMetode();
		metode.ubaciMarku(nazivMarke, zemlja, grad, ulica);
		
		
		CrudMetode metode = new CrudMetode();
		
        metode.ubaciMarku("Moskvic", "Rusija", "Moskva", "KGB");		
		
		List<Adresa> listaAdresa = new ArrayList<Adresa>();
		
		Adresa adresa1 = new Adresa();
		adresa1.setZemlja("Srbija");
		adresa1.setGrad("Beograd");
		adresa1.setUlica("Knez Mihajlova");
		
		listaAdresa.add(adresa1);
		
		Adresa adresa2 = new Adresa();
		adresa2.setZemlja("Srbija");
		adresa2.setGrad("Nis");
		adresa2.setUlica("Beogradska");
		
		listaAdresa.add(adresa2);
		metode.ubaciUsera("Pera", "Peric", listaAdresa);*/
		
		
	    SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		User user = new User();
		Marka marka = new Marka();
		Marka marka2 = new Marka();
		Adresa adresa = new Adresa();
		List <Adresa> listaAdresa = new ArrayList<Adresa>();
		List <Marka> marke = new ArrayList<Marka>();
		
		adresa.setZemlja("Srbija");
		adresa.setGrad("Beograd");
		adresa.setUlica("Moja ulica");
		
		marka.setNazivMarke("Ferarri");
		marka.setAdresa(adresa);
		marka.setUser(user);
		
		marka2.setNazivMarke("Lambo");
		marka2.setAdresa(adresa);
		marka2.setUser(user);
		
		user.setIme("Pera");
		user.setPrezime("Peric");
		   listaAdresa.add(adresa);
		   user.setListaAdresa(listaAdresa);
		   marke.add(marka);
		   marke.add(marka2);
		   user.setMarke(marke);
		
		Session sesija = sf.openSession();
	     sesija.beginTransaction();
	     try {
	    	 sesija.save(user);
	    	 sesija.save(marka);
	    	 sesija.save(marka2);
	    	 sesija.getTransaction().commit();
		} catch (Exception e) {
			sesija.getTransaction().rollback();
		}finally {
			sesija.close();
		}
		
		
		
	}

}
