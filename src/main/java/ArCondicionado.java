public class ArCondicionado extends VeiculoDecorator {

    public ArCondicionado(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public float getValorAdcional() {
        return 5000;
    }

    public String getNomeAdicional() {
        return "Ar condicionado";
    }
}
