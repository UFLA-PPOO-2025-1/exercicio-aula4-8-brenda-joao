import java.awt.Color;

public class VisaoDeTexto implements VisaoSimulador {

    private EstatisticasCampo estatisticasCampo = new EstatisticasCampo();
         

    @Override
    public void definirCor(Class<?> classeAnimal, Color cor) {
        // nao faz sentido
    }

    @Override
    public boolean ehViavel(Campo campo) {
        return estatisticasCampo.ehViavel(campo);
    }

    @Override
    public void mostrarStatus(int passo, Campo campo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarStatus'");
        System.out.println("Passo "+ passo + "Raposas: " + "Coelho: " );
    }

    @Override
    public void reiniciar() {
        estatisticasCampo.reiniciar();
    }

    @Override
    public void reabilitarOpcoes() {
        // nao faz sentido
    }
}
