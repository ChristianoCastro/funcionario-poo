package entidade;


public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;
    public double porcentagem;
    
    public double salarioLiquido(){
    	
        double sLiquido=(salario-imposto)+(salario*(porcentagem/100));
        return sLiquido;
    }
    
    public void salarioPorcentagem(double porcentagem){
    	
        porcentagem=(salario-imposto)+(salario*(porcentagem/100));
        this.porcentagem=porcentagem;
        System.out.println(this.porcentagem);
    }
    
}