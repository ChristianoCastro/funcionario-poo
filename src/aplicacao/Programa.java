package aplicacao;

import entidade.Funcionario;
import java.util.Locale;
import java.util.Scanner;


public class Programa {

    public static void main(String[] args) {
    	
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        
        double porcent;
        
        System.out.println("Informe o nome do funcionario");
        f1.nome=sc.nextLine();
        
        System.out.println("Informe o salario bruto");
        f1.salario=sc.nextDouble();
        
        System.out.println("Informe o valor do impostos");
        f1.imposto=sc.nextDouble();
        
        System.out.printf("Funcionario : %s, $%f" ,f1.nome,f1.salarioLiquido());
        
        System.out.println("\nInforme a porcentagem a ser incrementada: ");
        porcent=sc.nextDouble();
              
        System.out.println("Dados atualizados: "+f1.nome);
        f1.salarioPorcentagem(porcent);
        sc.close();
        
    }
    
}