package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Ingresso;
import model.entities.IngressoVip;


public class Program {
	

	public static void main(String[] args) {
		Ingresso i = new Ingresso(10.00);
		IngressoVip iv = new IngressoVip(i.getValor(), 3.5);
		
		comparador(i,iv);

	}

	public static void comparador(Ingresso i, IngressoVip iv) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		List <Ingresso> listI = new ArrayList();
		List <IngressoVip> listIV = new ArrayList();
		
		System.out.println("  =~~=  BILHETERIA =~~=  " );
		System.out.println("Os ingressos normais custam R$ 10,00, os vip tem um adicional de R$6,50.");
		System.out.println("Digite quantos você quer: ");
		Integer n = sc.nextInt();

		for (int j = 0; j < n; j++) {
				listI.add(new Ingresso (10.00));
				listIV.add(new IngressoVip (i.getValor(), 6.5));
		}
		
		
		System.out.println("            == Comparativo dos valores ==            ");
		for (int l = 0; l < n; l ++) {
			System.out.println("|| " + listI.get(l).toString() + " |x| " + listIV.get(l).toString() + " ||");
		}
		double iTotal = i.getValor()* n;
		double ivTotal = iv.totalValue() *n;
		
		StringBuilder sb1 = new StringBuilder ("Valor total ingressos normais: R$").append(iTotal);
		StringBuilder sb2 = new StringBuilder ("Valor total ingressos vip: R$").append(ivTotal);
		System.out.println(sb1);
		System.out.println(sb2);
		sb1.toString();
		sb2.toString();
		
		sc.close();
	}
 
	

	
}
