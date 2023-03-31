package heranca.exercicio01;

public class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();


        //Upcasting:        (implícitos)
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        

        //Downcasting:
        //Gerente gerente_ = new Funcionario();   (errado, deve ser feito de forma explícita)
        Vendedor vendedor_ = (Vendedor) new Funcionario();
        //Deve ser evitado na OO
        
    }

}
