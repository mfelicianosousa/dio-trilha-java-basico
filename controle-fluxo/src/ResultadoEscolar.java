public class ResultadoEscolar {
    
    public static void main(String[] args) {

        int nota = 4;

        /*  condicional encadeada
        if (nota >= 7) {
          System.out.println("Aprovado");
        } else if (nota >=5 && nota < 7) {
          System.out.println("Recuperação");
        } else {
          System.out.println("Reprovado");
        }
        */

        // condição ternária - cenário 1
        // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        // condição ternária - cenário 2
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.err.println(resultado);
    }
}
