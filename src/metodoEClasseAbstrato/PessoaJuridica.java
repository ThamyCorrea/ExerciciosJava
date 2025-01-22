package metodoEClasseAbstrato;

public class PessoaJuridica extends Pessoa{

    private Integer numFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public Double calculoImposto() {
        if(numFuncionarios > 10){
            return getRendaAnual() * 14 / 100;
        }else{
            return getRendaAnual() * 16 / 100;
        }
    }
}
