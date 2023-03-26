public abstract class VeiculoDecorator implements Veiculo {
    private Veiculo veiculo;
    public String adicionais;

    public VeiculoDecorator(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public Veiculo getVeiculo(){
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public abstract float getValorAdcional();

    @Override
    public float getValor() {
        return this.veiculo.getValor() + this.getValorAdcional();
    }

    public abstract String getNomeAdicional();

    public String getAdicionais() {
        return this.veiculo.getAdicionais() + "/" + this.getNomeAdicional();
    }

    public void setAdicionais(String adicionais) {
        this.adicionais = adicionais;
    }
}
