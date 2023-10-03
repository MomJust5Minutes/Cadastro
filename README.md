# Cadastro

Este projeto consiste em implementar um programa a partir de um diagrama.
• Classe Produto
– as variáveis de instâncias: id, valor, descrição e a variável de classe: quantidade
(quantidade de produtos criados);

– o construtor que recebe a descrição e o valor, um método de classe3 que retorna o
número de produtos criados até o momento (getQuantidade) e um método toString()
que retorna os dados do produto. No construtor, o id do produto deverá ser definido
pelo valor da variável de classe - quantidade. Isto é: o id do produto deve ser único
e precisa ser definido por meio da variável de classe. Ou seja, o primeiro produto
instanciado terá o id 1, o segundo 2 e assim sucessivamente.
• Classe Perecivel
– a variável de instância validade representada por um vetor com dia, mês e ano da
validade do produto;
– o construtor que recebe descrição e o valor, além da data de validade do produto, o
método estaVencido() que retorna se o produto está vencido ou não, o método apli-
caDesconto(double) que recebe a porcentagem de desconto e aplica este desconto
ao preço e um método toString(), que retorna uma String com as informações deste
produto.
• Classe TestaProduto (Classe principal)


– Apresente um menu para o usuário com as seguintes opções: 1- Criar produto; 2-
Criar produto perecível e 3- Sair.
* Para a Opção 1, faça:
1- Solicite que o usuário entre com os dados de cadastro do produto/  
2- Crie o objeto/
3- Imprima os dados do objeto na tela//
* Para a Opção 2, faça:/
1- Solicite que o usuário entre com os dados de cadastro do produto perecível/
2- Crie o objeto/
3- Imprima os dados do objeto na tela/
4- Verifique se o produto está vencido/
5-Aplique o desconto de 15% ao produto/ 
6- Imprima os dados do objeto na tela/
* Para a Opção 3, encerre o programa.
