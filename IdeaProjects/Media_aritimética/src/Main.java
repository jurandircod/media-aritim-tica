import java.util.Scanner;
import Entidade.Calculo_Media;

public class Main {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        Calculo_Media obj = new Calculo_Media();
        System.out.println("Digite um número (ou -1 para parar):");

        double resultado = lerNumeros(ler, obj);
        System.out.println("A média dos números digitados é: " + resultado);
    }

    public static Double lerNumeros(Scanner ler, Calculo_Media obj){
        do {
            obj.num = ler.nextDouble();
            if (obj.num != -1) {
                obj.armazem += obj.num;
                obj.soma++;
                System.out.println("Digite outro número (ou -1 para parar):");
            }
        } while (obj.num != -1);

        double resultado = obj.armazem/obj.soma;
        return resultado;
    }
}