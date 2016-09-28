import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by b_ped on 27/09/2016.
 */
public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ArrayList<Cadastro> cadastro = new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Tecnico> tecnicos = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Chamado> chamados = new ArrayList<>();
        String nomeValida;
        String senhaValida;
        int i=0;

        if (cadastro.size() ==0){
            System.out.println();
            System.out.println("*** Bem vindo ao Sistema você é o Primeiro Usuario!! ***");
            System.out.println();
            System.out.println("A partir de agora vamos coletar seus dados, ok? ");
            System.out.println();
            Cadastro c = new Cadastro();
            c.cadastraUsuario();

        }


            System.out.println("\n\n*** Sistema de chamados para suporte ***");
        do{
            System.out.printf("Usuario: ");
            nomeValida = ler.next();
            System.out.printf("Senha: ");
            senhaValida = ler.next();
            Cadastro v = new Cadastro();
            if(v.validaUsuario(nomeValida,senhaValida, cadastro)){
               Cadastro c1 = new Cadastro();
                if(c1.getNivel()==1){
                    Gerente g = new Gerente();

                }else if(c1.getNivel()==2){
                    Cliente cliente = new Cliente();

                }else if(c1.getNivel()==3){
                    Tecnico t = new Tecnico();

                }


            }else{
                System.out.println("Usuario ou Senha incorretos! ");
            }

        }while (i != 1);








    }
}
