package poo;

public class ContaBancaria extends Cliente {
    
    private Cliente[] cliente;
    int cont;

    public ContaBancaria(int numeroConta, String nome, float saldo, byte tipo, int qtdClientes) {
        super(numeroConta, nome, saldo, tipo);
        
        qtdClientes=10;
             
        this.cliente = new Cliente[qtdClientes];
        this.cont = 0;
        qtdClientes++;
    }
     
    public void AdicionaCliente(Byte tipo) {
        
        cliente[tipo] = new Cliente();
	tipo++;
        
    }
    public void Deposito(int numeroConta, float valor){
        saldo+=valor;  
    }
    
   public boolean Saque(int numeroConta, float valor){
        if(saldo-valor>=0){
            saldo-=valor;
            return true;
        }
        return false;  
    }
    
    public void extratoBancario(int numeroConta){
        
        for (cont = 0; cont < cliente.length; cont++) {
	     if (cliente[cont] == null){
		break;
	     }
             else{
	         System.out.println(cliente[cont]);
	     }
         }
    }
}
