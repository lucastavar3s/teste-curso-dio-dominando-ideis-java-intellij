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

        System.out.println(gato);
    }
}
