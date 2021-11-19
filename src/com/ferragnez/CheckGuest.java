package com.ferragnez;
import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		String [] listaInvitati = {"Dua Lipa","Paris Hilton","Manuel Agnelli","J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio","Luis","Pardis Zarei","Martina Maccherone","Rachel Zeilic"};
		Scanner scanner1 = new Scanner(System.in);
		
		for (int i= 0; i < listaInvitati.length;i++) {
			if (i == listaInvitati.length -1) {
				System.out.println(listaInvitati[i] + ".\n");
				break;
			}
			System.out.print(listaInvitati[i] + ",");
		}
		
		System.out.println("Inserite il vostro nome per l'identificazione: ");
		String guestName = scanner1.nextLine(); 
		System.out.println("Nome inserito: " + guestName);
		
		
		boolean nomeCorretto = false;

		
//		metodo 1
//		for (int i=0 ;i< listaInvitati.length ;i++) {
//			if (listaInvitati[i].equals(guestName)) {
//				nomeCorretto = true;
//				break;
//			}
//		}
		
		
		
		
//		metodo2
		int i = 0;
		while (i < listaInvitati.length) {
			
			if (listaInvitati[i].equals(guestName)) {
				nomeCorretto = true;
				
				break;
			}
			i++;
		}
		
		
		if (nomeCorretto) {
			System.out.println("Puoi entrare");
		}else {
			System.out.println("Non puoi entrare");
		}
		scanner1.close();
		

	}

}
