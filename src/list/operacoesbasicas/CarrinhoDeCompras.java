package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompras {
    private List<Item> carItemList;

    public CarrinhoDeCompras() {
        this.carItemList = new ArrayList<>();
    }

     public void adicionarItem(String nome, double preco, int quantidade){
        carItemList.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        if (!carItemList.isEmpty()) {
            for (Item item : carItemList) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itemsParaRemover.add(item);
                }
            }
            carItemList.removeAll(itemsParaRemover);
        }else {
            System.out.println("A lista está vazia!");
        }
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        if (!carItemList.isEmpty()) {
            for (Item item : carItemList) {
                double total = item.getPreco() * item.getQuantidade();
                valorTotal += total;
            }
            return valorTotal;
        }

        else { throw new RuntimeException("A lista está vazia!"); }

    }
    public void exibirItens(){
        System.out.println(carItemList);
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Notebook", 4750.85, 4);
        carrinhoDeCompras.adicionarItem("Pc Game", 5450.85, 1);
        carrinhoDeCompras.adicionarItem("Tv", 3800.85, 2);
        carrinhoDeCompras.adicionarItem("Xbox", 4750.85, 3);

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total da compra: R$ " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Notebook");

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total da compra: R$ " + carrinhoDeCompras.calcularValorTotal());
    }
}
