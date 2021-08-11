package fixacao;

public class Retangulo {

    public static void main(String[] args) {

        // Fazer um programa para ler os valores da largura e altura de um retângulo.
        // Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
    }

    public double largura;
    public double altura;

    public double area() {
        return  largura * altura;
    }

    public double perimetro() {
        return  2 * (largura + altura);
    }

    public double diagonal() {
        return  Math.sqrt(largura * largura + altura * altura);
    }
}
