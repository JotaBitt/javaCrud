package crudProduto;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
	
	public static void main(String[] args) {		
		
		//Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		/*int id;
		String nome;
		float valor;
		
		System.out.println("Coloque o id do produto: ");
		id = sc.nextInt();
		
		System.out.println("Coloque o nome do produto: ");
		nome = sc.next();
		
		System.out.println("Coloque o valor do produto: ");
		valor = sc.nextFloat();
		
		sc.close();*/
		
		int id = 0, busca, op;
		String nome = null;
		float valor =0;
		Scanner sc = new Scanner(System.in);
		Produto prod1 = new Produto(1 , "Cera", 5);
		produtos.add(prod1);
		
		do {
			System.out.println("Menu");
			System.out.println("1 - Incluir produto");
			System.out.println("2 - listar todos");
			System.out.println("3 - buscar produto");
			System.out.println("4 - Alterar produto");
			System.out.println("5 - Excluir produto");
			System.out.println("6 - encerrar programa\n");
			System.out.println("Selecione uma opção: ");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Coloque o id do produto: ");
				id = sc.nextInt();
				
				System.out.println("Coloque o nome do produto: ");
				nome = sc.next();
				
				System.out.println("Coloque o valor do produto: ");
				valor = sc.nextFloat();
				
				Produto prod = new Produto(id, nome, valor);
				produtos.add(prod);
				
				System.out.println("\nProduto incluido com sucesso!!\n");
				break;
				
			case 2:
				System.out.println("Lista produtos:");
				for (Produto prods: produtos) {
					System.out.println("\nId: " + prods.getId() + "\nNome: " + prods.getNome() + "\nValor: " + prods.getValor());
				}
				break;
				
			case 3:
				System.out.println("Coloque o id do produto: ");
				busca = sc.nextInt();
				
				for (Produto produt: produtos) {
					if (produt.getId() == busca) {
						System.out.println("Id: " + produt.getId() + "\nNome: " + produt.getNome() + "\nValor: " + produt.getValor());
					}
				}
				System.out.println("Produto não encontrado");
				break;
				
			case 4:
				int opcao;
				System.out.println("Coloque o id do produto que deseja alterar: ");
				busca = sc.nextInt();
					for (Produto produt: produtos) {
						if (produt.getId() == busca) {
							System.out.println("Id: " + produt.getId() + "\nNome: " + produt.getNome() + "\nValor: " + produt.getValor());
							id = produt.getId();
							valor = produt.getValor();
							nome = produt.getNome();
							
							do {
								System.out.println("1 - Id");
								System.out.println("2 - nome");
								System.out.println("3 - valor");
								System.out.println("-1 - Alterar produto");
								opcao = sc.nextInt();
								
								switch (opcao) {
									case 1:
										System.out.println("Coloque o novo id do produto: ");
										id = sc.nextInt();
										break;
									
									case 2:
										System.out.println("Coloque o novo nome do produto: ");
										nome = sc.next();
										break;
										
									case 3:
										System.out.println("Coloque o novo valor do produto: ");
										valor = sc.nextFloat();
								}
								
							}while (opcao != -1);
							produtos.remove(produt);
							produtos.add(new Produto(id, nome, valor));
							System.out.println("Produto Alterado!");
						}
						System.out.println("Produto não existe.");
					}
					
				break;
				
			case 5:
				System.out.println("Coloque o id do produto: ");
				id = sc.nextInt();
				
				for (Produto produ: produtos) {
					if (produ.getId() == id) {
						produtos.remove(produ);
						System.out.println("Produto excluído.");
					}
				}
				System.out.println("Produto não Encontrado.");
				
				break;
				
			case 6:
				System.out.println("Programa Finalizado.");
			}
		} while (op != 6);
		
		sc.close();	
	}
}
