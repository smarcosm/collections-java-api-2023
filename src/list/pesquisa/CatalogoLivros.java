package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
       List<Livro> livrosPorAutor = new ArrayList<>();
       if (!livroList.isEmpty()){
           for (Livro l : livroList ) {
               if (l.getAutor().equalsIgnoreCase(autor)){
                   livrosPorAutor.add(l);
               }
           }

       }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> pesquisarPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList ) {
                if (l.getAnoPublicacao() >= anoInicial & l.getAnoPublicacao() <= anoFinal){
                    pesquisarPorIntervaloAnos.add(l);
                }
            }
        }

        return pesquisarPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livrosPorTitulo = null;

        if (!livroList.isEmpty()){
            for (Livro l : livroList ) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        System.out.println("Livros por autor: " + catalogoLivros.pesquisarPorAutor("Ana"));
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2010);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2010);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2015);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2005);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2003);
        System.out.println("Livros por data: " + catalogoLivros.pesquisarPorIntervaloAnos(2004, 2009));

        System.out.println("Livros por Título: "+ catalogoLivros.pesquisarPorTitulo("Livro 4"));
        System.out.println("Livros por autor: " + catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println("Livros por data: " + catalogoLivros.pesquisarPorIntervaloAnos(2004, 2011));
    }
}
