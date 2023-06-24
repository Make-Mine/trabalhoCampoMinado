package principal;

abstract class Celula {
    private boolean revelada;
    
    public Celula() {
        this.revelada = false;
    }
    
    public boolean estaRevelada() {
        return revelada;
    }
    
    public void revelar() {
        this.revelada = true;
    }
    
    public abstract void exibir();
}

