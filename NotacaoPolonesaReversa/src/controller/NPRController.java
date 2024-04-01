package controller;

import lib.model.*;

public class NPRController
{
	
	public NPRController()
	{
		super();
	}

	public void insereValor(Pilha p, int valor)
	{
		p.push(valor);
		mostrarPilha(p);
	}

	public int npr(Pilha p, String op)
	{
		try {
			if (op.equals("+")) {
				int n1 = p.pop();
				int n2 = p.pop();
				int soma = n1 + n2;
				p.push(soma);
				mostrarPilha(p);
				return soma;
			}
			if (op.equals("*")) {
				int n1 = p.pop();
				int n2 = p.pop();
				int prod = n1 * n2;
				p.push(prod);
				mostrarPilha(p);
				return prod;
			}
			if (op.equals("-")) {
				int n1 = p.pop();
				int n2 = p.pop();
				int dif = n2 - n1;
				p.push(dif);
				mostrarPilha(p);
				return dif;
			}
			if (op.equals("/")) {
				int n1 = p.pop();
				int n2 = p.pop();
				int quoc = n2 / n1;
				p.push(quoc);
				mostrarPilha(p);
				return quoc;
			}
			System.out.println("Opção Inválida!");
			return 0;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
			return 0;
		}
	}

	public void mostrarPilha(Pilha p)
	{
		Pilha a = new Pilha();
		Pilha b = new Pilha();

		while (!p.isEmpty()) {
			try {
				int n = p.pop();
				a.push(n);
				b.push(n);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		while (!a.isEmpty()) {
			try {
				p.push(a.pop());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		System.out.print("[ ");
		while (!b.isEmpty()) {
			try {
				System.out.print(b.pop() + ", ");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		System.out.println("]");
	}
}