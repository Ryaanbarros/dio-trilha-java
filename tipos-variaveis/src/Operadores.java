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
    }
}
