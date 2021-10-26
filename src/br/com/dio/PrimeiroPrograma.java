package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
       /* int a = 5;
        int b = 3;
        System.out.println("Hello word " + (a+b));*/

        Gato gato = new Gato();
        gato.setNome("Maya");
        gato.setCor("preto");
        gato.setIdade(2);

        Livro livro1 = new Livro("Revolução dos bichos", 300);
        System.out.println(livro1);

        System.out.println(gato);
    }
}

class Livro {
    String nome;
    Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
}