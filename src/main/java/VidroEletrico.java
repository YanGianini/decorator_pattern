public class VidroEletrico extends VeiculoDecorator{

    public VidroEletrico(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public float getValorAdcional() {
        return 6000;
    }

    public String getNomeAdicional() {
        return "Vidro eletrico";
    }
}
