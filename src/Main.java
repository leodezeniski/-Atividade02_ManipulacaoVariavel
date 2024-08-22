public class Main {
    public static void main(String[] args) {
        // Declaração de variáveis
        String nome = "Ana Silva";
        int idade = 30;
        double salarioBrutoMensal = 5000.00;  // valor em reais
        int mesesTrabalhados = 12;
        int quantidadeProdutos = 10;
        double valorTotalCompras = 1500.00;  // valor em reais

        // Operações Simples
        double salarioAnualBruto = salarioBrutoMensal * mesesTrabalhados;
        double desconto = 2000.00;  // valor fixo de desconto em reais
        double salarioAnualLiquido = salarioAnualBruto - desconto;

        // Calculando a média do valor gasto por produto
        double mediaValorPorProduto = valorTotalCompras / quantidadeProdutos;

        // Concatenação da string com informações
        String mensagem = "O salário anual líquido de " + nome + " é R$ " + salarioAnualLiquido;

        // Exibição de Resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Bruto Mensal: R$ " + salarioBrutoMensal);
        System.out.println("Meses Trabalhados: " + mesesTrabalhados);
        System.out.println("Quantidade de Produtos Comprados: " + quantidadeProdutos);
        System.out.println("Valor Total das Compras: R$ " + valorTotalCompras);
        System.out.println("Salário Anual Bruto: R$ " + salarioAnualBruto);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Salário Anual Líquido: R$ " + salarioAnualLiquido);
        System.out.println("Média do Valor Gasto por Produto: R$ " + mediaValorPorProduto);
        System.out.println(mensagem);
    }
}
