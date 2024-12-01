package TarefaMod13;

public class Programa {

    public static void main(String args[]) {
        TipoPessoa PessoaFisica = new PessoaFisica();
        PessoaFisica.setPF("056");
        PessoaFisica.setNome("Lucas Pinheiro");
        System.out.println(PessoaFisica.getNome() + " é uma conta " + PessoaFisica.getPF() + " Fisica");

        System.out.println("*******CONTAS*******");

        TipoPessoa PessoaJuridica = new PessoaJuridica();
        PessoaJuridica.setPJ("056/0001-77");
        PessoaJuridica.setNome("Lucas Pinheiro");
        System.out.println(PessoaJuridica.getNome() + " é uma conta " + PessoaJuridica.getPJ() + " Juridica");


    }
}
