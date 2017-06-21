package fr.imie.scrum_calculator.main;

public class Operation {

	public int addition(int a, int b){
		return a+b;
	}
	
	public int soustraction(int a, int b){
		return a-b;
	}
	
	public int multiplication(int a, int b){
		return a*b;
	}
	
	public float division(int a, int b){
		return a/b;
	}
	
	public double racineCarree(int a)
	{
		return Math.sqrt(a);
	}
	
	public double puissance(int a, int b)
	{
		return Math.pow(a, b);
	}
}
