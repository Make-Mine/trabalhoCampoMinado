package principal;

class CelulaBomba extends Celula {
    @Override
    public void exibir() {
        if (estaRevelada()) {
            System.out.print("B ");
        } else {
            System.out.print("* ");
        }
    }
}