import java.util.Scanner;

public class TestaProduto {
    static Scanner input = new Scanner(System.in);
    static public boolean continua = true;
    public static void main(String[] args) {
        int opcao;
        while (continua){
            System.out.println("Digite a opção desejada: \n\t [1] Criar Produto \n\t [2] Criar Produto Perecível \n\t [3] Sair");
            opcao = input.nextInt();

            switch(opcao) {
                case 1:
                    opcao1();
                    break;
                case 2:
                    opcao2();
                    break;
                default: System.exit(0);
            }
        }
    }

    public static void opcao1(){
        // 1-
        System.out.println("Digite a descrição do produto: ");
        input.nextLine(); // = fflush(stdin)
        String descricao = input.nextLine();

        System.out.println("Digite o valor do produto: ");
        double valor = input.nextDouble();

        // 2-
        Produto produto = new Produto(descricao, valor);

        // 3-
        System.out.println(produto.toString());

        continua = true;
    }

    public static void opcao2(){
        // 1-
        System.out.println("Digite a descrição do produto: ");
        input.nextLine(); // = fflush(stdin)
        String descricao = input.nextLine();

        System.out.println("Digite o valor do produto: ");
        double valor = input.nextDouble();

        System.out.println("Digite a validade do produto: ");
        int[] validade = new int[3];
        for(int i = 0; i < 3; i++){
            validade[i] = input.nextInt();
            System.out.print("/");
        }

        // 2-
        Perecivel perecivel = new Perecivel(descricao, valor, validade);
        // 3-
        System.out.println(perecivel.toString());

        // 4-
        if(perecivel.estaVencido()){
        System.out.println("O produto está vencido");
        } else {
        System.out.println("O produto não está vencido");
        }
        
        // 5- 
        System.out.println("Digite a porcentagem (n%) de desconto: ");
        double porcentagem = input.nextDouble();
        perecivel.aplicaDesconto(porcentagem);

        // 6-
        System.out.println(perecivel.toString());

        continua = true;
        }
        
}

