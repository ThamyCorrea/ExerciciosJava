package metodoEClasseAbstrato;

public class PessoaFisica  extends Pessoa{

    private Double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double calculoImposto() {
        if(getRendaAnual() < 20000.00 && gastoSaude > 0.0){
            return (getRendaAnual() * 15 / 100) - (gastoSaude * 50 / 100);
        }else if(getRendaAnual() >= 20000.00 && gastoSaude > 0.0){
            return (getRendaAnual() * 25 / 100) - (gastoSaude * 50 / 100);
        }else if (getRendaAnual() < 20000.00 && gastoSaude == 0.0){
            return (getRendaAnual() * 15 / 100);
        }else{
            return (getRendaAnual() * 25 / 100);
        }
    }
}
