public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao =  "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
         System.out.println(concatenacao);

// Aula operadores unarios

        int numero = 5;
        numero = - numero; //essa linha se lê: o numero será igual a ele mesmo de forma negativa
        System.out.println(numero);
        // System.out.println(- numero);
        numero = numero * -1; //essa é como se fosse o mais +.. é a forma de deixar o numero positivo
        System.out.println(numero);  

//Formas incremento vale tambem para decremento
        int num = 5;
       // num++;
        //System.out.println(num);

        System.out.println(++ num); //já printa o numero incrementado
        System.out.println(num ++); // ainda não printa o numero incrementado, só se fazer outro System.outprint num, ai sim vai pritar o numero incrementado

//negando valores booleanos
        boolean variavel = false;
        
        System.out.println(!variavel);  // o simbolo de negar "!" serve para caso eu queira que minha variavel booleana seja o inverso em algum momento eu utilizo o simbolo, mas lembrando que a variavel original não muda.. então se houver outro print sem o simbolo "!", a variavel ainda continua a original.. para que ela mude definitivamente é preciso atribuila a ela mesma com a negação.. Exemplo abaixo

        variavel = !variavel;
        System.out.println(variavel);

//Exemplo de condicional usando IF/ELSE 

        int a, b;

        a = 5;
        b = 6;
        String resultado = "";
        if(a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
        System.out.println(resultado);

//Exemplo condicional usando operador TERNARIO (forma abreviada do IF/ELSE)
        int c,d;
        c = 4;
        d = 4;
        String result = c==d ?"verdadeiro" : "falso";  //lembrado que a primeira operação sempre será uma operação booleana nesse exemplo é o c==d, se isso retornaria um true ou false, e lembrando que o valor a ser retornado é string que é o mesmo da expressão condicional, se fosse int por exemplo os resultados de ? e : seriam numeros
        System.out.println(result);

//OPERADORES RELACIONAIS
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        } else{
            System.out.println("a nossa condição é falsa");
        }


        System.out.println("numeroUm é igual ao numeroDois? " +simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente ao numeroDois? " +simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que o numeroDois? " +simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor que o numeroDois? " +simNao);


        String nomeUm = "Ryan";
        String nomeDois = new String("Ryan");
        System.out.println(nomeUm.equals(nomeDois));  //o metodo equals ele compara conteudo dos objetos se são iguais, sem o equals iria dar false por conta do new String

        //Ou seja, para numero podemos usar operadores relacionais e para objetos usamos equals 

    }
}