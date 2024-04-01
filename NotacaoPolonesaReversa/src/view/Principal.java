package view;

import controller.NPRController;
import java.util.Scanner;
import lib.model.Pilha;

public class Principal
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		NPRController npr = new NPRController();
		Pilha p = new Pilha();
		String txt;

		while (true) {
			System.out.println("Digite um valor ou uma operação: ");
			txt = s.nextLine();
			if (txt == "")
				break;
			try {
				npr.insereValor(p, Integer.parseInt(txt));
			} catch (Exception e) {
				npr.npr(p, txt);
			}
		}
		s.close();
		System.out.println("Aplicação encerrada!");
	}
}