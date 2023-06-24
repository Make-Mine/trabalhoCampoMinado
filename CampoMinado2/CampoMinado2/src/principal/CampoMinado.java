package principal;

import java.util.Scanner;

public class CampoMinado {
	
	public void jogar(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do tabuleiro: ");
        int tamanho = scanner.nextInt();
        tamanho = tamanho+1;
        
        System.out.print("Digite a quantidade de bombas: ");
        int quantidadeBombas = scanner.nextInt();
        
        Tabuleiro tabuleiro = new Tabuleiro(tamanho, quantidadeBombas);
        
        boolean gameOver = false;
        
        while (!gameOver) {
            tabuleiro.exibirTabuleiro(false);
            
            System.out.print("Digite a linha: ");
            int linha = scanner.nextInt();
            
                      
            System.out.print("Digite a coluna: ");
            int coluna = scanner.nextInt();
           
          
            gameOver = tabuleiro.verificarCelula(linha, coluna);
        }
        
        System.out.println("BOOM! Fim de jogo!");
        tabuleiro.exibirTabuleiro(true);
        
        scanner.close();
	}
}
