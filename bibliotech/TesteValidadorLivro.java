
public class TesteValidadorLivro {

    public static void main(String[] args) {

        // Teste: título vazio
        testar("", "Machado de Assis", 1899);

        // Teste: autor vazio
        testar("Dom Casmurro", "", 1899);

        // Teste: ano inválido
        testar("Dom Casmurro",
                "Machado de Assis", -10);

        // Teste: livro válido
        testar("Dom Casmurro",
                "Machado de Assis", 1899);

        // Desafio: título com 1 caractere
        testar("A", "Autor Teste", 2020);

        // Desafio: título com 2 caracteres
        testar("AB", "Autor Teste", 2020);

        // Desafio: título com 4 caracteres
        testar("Java", "Autor Teste", 2020);
    }

    private static void testar(
            String titulo,
            String autor,
            int ano) {

        try {

            ValidadorLivro.validar(
                    titulo, autor, ano
            );

            System.out.println(
                    "Livro válido: " + titulo
            );

        } catch (LivroInvalidoException e) {

            System.out.println(
                    "Livro inválido: " +
                            e.getMessage()
            );
        }
    }
}
