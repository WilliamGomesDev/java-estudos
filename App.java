public class App {
    public static void main(String[] args) {
        //1. Declarando nomes
        String nome = "João";
        
        //2. Declarando notas
        int nota = 5;

        //3. Declarando frequência
        int frequencia = 80;

        //4. imprimindo resultado
        if (nota >=6 && frequencia >=75) {
            System.out.println(nome + " foi " + "Aprovado");
        } else {
            System.out.println(nome + " foi " + "Reprovado");
        }

    }
}