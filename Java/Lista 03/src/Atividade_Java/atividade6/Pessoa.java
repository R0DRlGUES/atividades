package Atividade_Java_OO.atividade6;
/*1) Criar a classe Pessoa com as seguintes características:
• atributos: idade e dia, mês e ano de nascimento, nome da pessoa
• métodos:
o calculaIdade(), que recebe a data atual em dias, mês e anos e calcula e
armazena no atributo idade a idade atual da pessoa
o informaIdade(), que retorna o valor da idade
o informaNome(), que retorna o nome da pessoa
o ajustaDataDeNascimento(), que recebe dia, mês e ano de nascimento
como parâmetros e preenche nos atributos correspondentes do objeto.
• Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido
em 14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643)
• Fazer uma classe principal que instancie os objetos, inicialize e mostre quais
seriam as idades de Einstein e Newton caso estivessem vivos. 
 * */

import java.util.Scanner;
public class Pessoa {
	Scanner S = new Scanner(System.in);
	//  Atributos
		private String nome = "Pedro Henrique Pinheiro Rodrigues";
		private int anoNascimento = 2001;
		private int anoAtual = 2022;
		
		
		private int diaAnivessario =13;
		private	int dia = 13;
		private String mesAtual ="nov";
		private	boolean mes = false;
	
		private String cpf;
		private Double peso;
		private Double altura;
		private String endereço;{
			String rua = "Rua ABCDEFG";
			String bairro = "Cancelli";
			String cidade = "Cascavel";
		 	String complemento = "Casa 90";
		}
	 // Método construtor
		public Pessoa() {
	 // Referenciando a classe
			this.nome = nome;
			this.anoAtual = anoAtual ;
			this.anoNascimento = anoNascimento;
		}
	 // Get
		public String getNome() {
			return nome;
		}
		public int getAnoAtual() {
			return anoAtual;
		}
		public int getAnoNascimento() {
			int idade = 0;
			if (getMes() == false) {
				idade = anoAtual - anoNascimento -1;
			}else {
				idade = anoAtual - anoNascimento;
			}
			return idade;
		}
		public int getDia() {
			return dia;
		}
		public boolean getMes() {
			if (this.diaAnivessario < this.dia) {
				System.out.println("seu aniversario ja passou");
				return true;
			}else if(this.diaAnivessario > this.dia) {
				System.out.println("seu aniversario está chegando");
				return false;
			}else {
				System.out.println("seu aniversario é hojee!!");
				return true;
			}
			
		}
		
	//  Set
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setAnoAtual(int ano) {
			this.anoAtual = anoAtual;
		}
		public void setAnoNascimento(int dataNascimento) {
			this.anoNascimento = anoNascimento;
		}
		public void setDia(int dia) {
			this.dia = dia;
		}
		
	//  Metodos
		public void informaNome() {
			System.out.println("Nome :"+this.nome);
		}
		public void informaIdade() {
			System.out.println("Idade :"+getAnoNascimento());
		}
		
}
