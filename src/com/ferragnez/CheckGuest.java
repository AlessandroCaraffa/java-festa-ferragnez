package com.ferragnez;
import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		String [] listaInvitati = {"Dua Lipa","Paris Hilton","Manuel Agnelli","J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio","Luis","Pardi Zarei","Martina Maccherone","Rachel Zeilic"};
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
		
//		boolean nomeCorretto = false;
		String  nomeInvitato =new String();
		
		for (int i=0 ;i< listaInvitati.length;i++) {
			if (listaInvitati[i] == guestName) {
				listaInvitati [i] = nomeInvitato;
//				nomeCorretto = true;
				break;
			}
		}
		
		
		if (nomeInvitato == guestName) {
			System.out.println("Puoi entrare");
		}else {
			System.out.println("Non puoi entrare");
		}
		System.out.println(nomeInvitato);
		scanner1.close();
		

	}

}
