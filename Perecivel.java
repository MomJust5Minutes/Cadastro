import java.util.Calendar;

public class Perecivel extends Produto {
    private int[] Validade = new int[3];

    public Perecivel(String descricao, double valor, int[] Validade) {
        super(descricao, valor);
        this.Validade = Validade;

    }

    public boolean estaVencido() {
        Calendar hoje = Calendar.getInstance();
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int mes = hoje.get(Calendar.MONTH) + 1;
        int ano = hoje.get(Calendar.YEAR);

        int diasValidos = dia + mes*30 + ano*365; // Calcula os dias totais do dia atual
        int diasValidade = Validade[0] + Validade[1]*30 + Validade[2]*365; // Calcula os dias totais do dia de validade

        if (diasValidade < diasValidos) { // Se o total da validade for menor que o dia atual, o produto está vencido
            return true;
        }
        return false;
    }

    public void aplicaDesconto(double porcentagem) {
        super.setValor(super.getValor() * (100 - porcentagem)/100);
    }

    @Override
    public String toString() {
        return super.getDescricao() + " - Valor: " + super.getValor() + " - Validade: " + Validade[0] + "/"
                + Validade[1] + "/" + Validade[2];
    }
}
