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
		metode.ubaciMarku(nazivMarke, zemlja, grad, ulica);*/
		
		
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
		metode.ubaciUsera("Pera", "Peric", listaAdresa);
		
		
		
		
		
	}

}
