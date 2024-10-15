package Ordenação;

import java.util.Comparator;
import java.util.Objects;

public class Produtos  implements Comparable<Produtos>{

    private String nome;

    private long codigo;

    private double preco;

    private int quantidade;



    public Produtos(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produtos p) {
        return nome.compareToIgnoreCase(p.getNome());
    }


    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return getCodigo() == produtos.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
    class ComparatorPorPreco implements Comparator<Produtos> {
        @Override
        public int compare(Produtos p1, Produtos p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }


}



