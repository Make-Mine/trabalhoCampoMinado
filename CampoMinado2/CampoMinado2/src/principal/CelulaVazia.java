package principal;

class CelulaVazia extends Celula {
    @Override
    public void exibir() {
        if (estaRevelada()) {
            System.out.print("  ");
        } else {
            System.out.print("* ");
        }
    }
}
