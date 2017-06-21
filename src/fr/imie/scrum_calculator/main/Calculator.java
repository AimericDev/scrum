package fr.imie.scrum_calculator.main;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		while(1 > 0)
		{
			int number_one = 0;
			int number_two = 0;
			float result = 0;
			boolean opOk = false;
			String operator = "";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Sélectionner deux nombres entiers pour réaliser une opération : ");
			
			System.out.println("Premier nombre : ");
			number_one = sc.nextInt();
			
			System.out.println("Deuxième nombre : ");
			number_two = sc.nextInt();

			sc.nextLine();
			while(opOk == false)
			{
				System.out.println("Entrez l'opérateur que vous souhaitez utiliser (+ - * /) -- Opérateur par défaut : + : ");
				operator = sc.nextLine();
				
				if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))
				{
					opOk = true;
				}
				else
				{
					System.out.println("Opérateur invalide !");
				}
			}

			
			Operation operation = new Operation();
			
			switch(operator)
			{
				case "+":
					System.out.println("Votre opération : " + number_one + " + " + number_two);
					result = operation.addition(number_one, number_two);
					break;
				case "-":
					System.out.println("Votre opération : " + number_one + " - " + number_two);
					result = operation.soustraction(number_one, number_two);
					break;
				case "*":
					System.out.println("Votre opération : " + number_one + " * " + number_two);
					result = operation.multiplication(number_one, number_two);
					break;
				case "/":
					System.out.println("Votre opération : " + number_one + " / " + number_two);
					result = operation.division(number_one, number_two);
					break;
				default:
					System.out.println("Votre opérateur est invalide, par défaut votre opération : " + number_one + " + " + number_two);
					result = operation.addition(number_one, number_two);
			}
			
			System.out.println("Le résultat de votre opération est : " + result + "\n");
		}
		
		

	}

}
