public class ExPratica {
    public static void main(String [] args){
        System.out.println("Exercicio 1");
        int num = 5;
        int ndois = 10;
        int result = (ndois + num) /2;
        System.out.println("A média é: "+ result);
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Exercicio 2");
        double numeroDouble = 45.90;
        int numeroInt = (int) numeroDouble;
        System.out.println("Esse é o número com o double:" + numeroDouble);
        System.out.println("Esse é o número com o int:" + numeroInt);
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Exercicio 3");
        char letra = 'A';
        String frase = "OL";
        System.out.println(frase + letra +" Eu sou o Goku");
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Exercicio 4");
        double precoProduto = 5.50;
        int quantidade = 20;
        double totalCompra = quantidade * precoProduto;
        String mensagem = String.format("Você pegou %d produtos que custam %.2f reais o total da sua compra é de:%.2f",quantidade, precoProduto, totalCompra );
        System.out.println(mensagem);
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Exercicio 5");
        System.out.println("Exercicio 6");
    }
}
