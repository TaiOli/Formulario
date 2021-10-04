package poo;

public class Cliente {
    
    int numeroConta;
    String nome;
    float saldo;
    byte tipo;
    
    public Cliente(){
        
    }
    
    public Cliente(int numeroConta, String nome, float saldo, byte tipo) {
        
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }
    
}
