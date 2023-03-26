public class VeiculoPopular implements Veiculo {

    public float valor;
     public VeiculoPopular() {

     }

     public VeiculoPopular(float valor){
         this.valor = valor;
     }

     public float getValor() {
         return valor;
     }

     public String getAdicionais() {
         return "Veiculo Popular";
     }
}
