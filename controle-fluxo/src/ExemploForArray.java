public class ExemploForArray {
    public static void main(String[] args) {
        
        String alunos[] = {"FELIPE","JONAS","JULIA", "MARCOS"};

        for (int x=0; x < alunos.length; x++) {
            System.out.println("\nO Aluno no indice x=" + x +" é "+alunos[x]);
        }
    }
}
