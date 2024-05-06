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
    }
}
