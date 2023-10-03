public class Produto {
    static int contador = 0;
    private String descricao;
    private int id;
    private double valor;
    static public int quantidade;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
        id = quantidade;
        quantidade++;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Produto [descricao=" + getDescricao() + ", id=" + getId() + ", valor=" + getValor() + ", quantidade="
                + getQuantidade() + "]";
    }
}
