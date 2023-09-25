package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public List<Integer> getNumeroList() {
        return numeroList;
    }
    public void adicionarNumero(int numero){
        numeroList.add(numero);
    }
    public int calcularSoma(){
        int soma =0;
        if (!numeroList.isEmpty()){
            for (Integer i : numeroList ) {
                soma += i;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if (!numeroList.isEmpty()){
            for (Integer numero : numeroList ) {
                if (maiorNumero < numero){
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 0;
        if (!numeroList.isEmpty()){
            for (Integer numero : numeroList) {
                if (menorNumero > numero){
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){

        return numeroList;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(200);
        somaNumeros.adicionarNumero(-50);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(-60);
        System.out.println("Maior numero da lista: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("A soma de todos os numeros da lista: " + somaNumeros.calcularSoma());
        System.out.println("Menor numero da lista: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Lista com todos os numeros: " + somaNumeros.exibirNumeros());
    }
}
