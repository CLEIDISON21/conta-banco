public class ContaBancaria {
    private int numeroConta;
    private String numeroAgencia;
    private double saldo;
    private Usuario usuario;

    public ContaBancaria(int numeroConta, String numeroAgencia, double saldo, Usuario usuario) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public void exibirMensagem() {
        System.out.println("\nOlá " + usuario.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
