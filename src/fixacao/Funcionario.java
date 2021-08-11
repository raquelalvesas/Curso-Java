package fixacao;

public class Funcionario {

    public static void main(String[] args) {

        // Fazer um programa para ler os dados de um funcionario (nome, salário bruto e imposto).
        // Em seguida, mostrar os dados do funcionário (nome, salário líquido). Em seguida, aumentar o
        // salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem)
        // e mostrar novamente os dados do funcionário.
    }

    public String name;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido() {
        return salarioBruto - taxa;
    }

    public void aumentoSalarial(double percentage) {
        salarioBruto += salarioBruto * percentage / 100;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", salarioLiquido());
    }
}




