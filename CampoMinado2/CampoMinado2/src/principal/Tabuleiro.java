package principal;

import java.util.Random;

class Tabuleiro {
    private Celula[][] celulas;
    private int tamanho;
    private int quantidadeBombas;
    
    public Tabuleiro(int tamanho, int quantidadeBombas) {
        this.tamanho = tamanho;
        this.quantidadeBombas = quantidadeBombas;
        this.celulas = new Celula[tamanho][tamanho];
        iniciaTabuleiro();
        espalharBombas();
    }
    
    private void iniciaTabuleiro() {
        for (int i = 1; i < tamanho; i++) {
            for (int j = 1; j < tamanho; j++) {
                celulas[i][j] = new CelulaVazia();
            }
        }
    }
    
    private void espalharBombas() {
        Random random = new Random();
        int bombasColocadas = 0;
        
        while (bombasColocadas < quantidadeBombas) {
            int linha = random.nextInt(tamanho);
            int coluna = random.nextInt(tamanho);
            
            if (!(celulas[linha][coluna] instanceof CelulaBomba)) {
                celulas[linha][coluna] = new CelulaBomba();
                bombasColocadas++;
            }
        }
    }
    
    public void exibirTabuleiro(boolean revelarTudo) {
        for (int i = 1; i < tamanho; i++) {
            for (int j = 1; j < tamanho; j++) {
                if (revelarTudo) {
                    celulas[i][j].revelar();
                }
                celulas[i][j].exibir();
            }
            System.out.println();
        }
    }
    
 
    
    public boolean verificarCelula(int linha, int coluna) {
        if (linha < 1 || linha >= tamanho || coluna < 1 || coluna >= tamanho) {
            return false;
        }
        
        if (celulas[linha][coluna] instanceof CelulaBomba) {
            return true;
        } else {
            celulas[linha][coluna].revelar();
            return false;
        }
    }
}
