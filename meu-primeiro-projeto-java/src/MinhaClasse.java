public class MinhaClasse {
  public static void main(String[] args) {
    String primeiroNome = "Wagner";
    String segundoNome = "Andrade";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

    int anoNascimento = 1979;
    int anoAtual = 2023;

    System.out.print ("Olá, meu nome é " + primeiroNome);
    System.out.print (". Tenho " + (anoAtual - anoNascimento) + " Anos");

    final String BR = "Brasil"; // tipo constante
  }

  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
  }
}
