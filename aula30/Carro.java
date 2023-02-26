package com.keven.aula30;

public class Carro {
	
	//atributos
		String marca;
		String modelo;
		int numPassageiros;
		double capCombustivel;
		double consumoCombustivel;
		
		
		
		public Carro(String marca, String modelo, int numPassageiros) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.numPassageiros = numPassageiros;
			System.out.println("Construtor com 3 parametros");

		}

		public Carro(String marca, String modelo) {
			this(marca, modelo, 10);
			System.out.println("Construtor com 2 parametros");
		}

		public Carro(String marca, String modelo, int numPassageiros, double capCombustivel,
				double consumoCombustivel) {
			this.marca = marca;
			this.modelo = modelo;
			this.numPassageiros = numPassageiros;
			this.capCombustivel = capCombustivel;
			this.consumoCombustivel = consumoCombustivel;
		}

		public Carro() {
		
		}

		void exibirAutonomia() {
			System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km.");
		}
		
		double obterAutonomia() {		
			System.out.println("Método obterAutonomia foi chamado");
			return capCombustivel * consumoCombustivel;
		}
		
		double calcularCombustivel(double km) {
			
			double qtdCombustivel = km/consumoCombustivel;
			
			return qtdCombustivel;
		}

}
