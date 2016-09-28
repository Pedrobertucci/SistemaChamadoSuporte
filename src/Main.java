import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by b_ped on 27/09/2016.
 */
public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Tecnico> tecnicos = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Chamado> chamados = new ArrayList<>();
        String nomeValida;
        String senhaValida;
        int tipo=0;
        int i=0;
        int cont=0;

        if (gerentes.size() ==0){
            System.out.println();
            System.out.println("*** Bem vindo ao Sistema você é o Primeiro Usuario Gerente!! ***");
            System.out.println();
            System.out.println("A partir de agora vamos coletar seus dados, ok? ");
            System.out.println();
            Gerente g = new Gerente();
            g.cadastraGerente();
            gerentes.add(g);
            System.out.println("*** Usuario cadastrado com sucesso ***");
        }


        System.out.println("\n\n*** Sistema de chamados para suporte ***");
        do{
            System.out.printf("\nInforme seu Usuario: 1-Gerente| 2-Tecnico | 3-Cliente: ");
            do{
                if(cont >=1){
                    System.out.println(" *** Tipo de usuario incorreto! ***");
                    System.out.printf("Informe seu Usuario: 1-Gerente| 2-Tecnico | 3-Cliente: ");
                }
                tipo = ler.nextInt();

                cont++;
            }while (tipo != 1 && tipo !=2 && tipo !=3);
            cont=0;
            switch (tipo){
                case 1:{
                    System.out.printf("Usuario: ");
                    nomeValida = ler.next();
                    System.out.printf("Senha: ");
                    senhaValida = ler.next();
                    Gerente g = new Gerente();
                    if(g.validaUsuario(nomeValida,senhaValida, gerentes)){
                        g.dashbord(gerentes,tecnicos, clientes);

                    }else{
                        System.out.println("Usuario ou Senha incorretos! ");
                    }
                    break;
                }
                case 2:{
                    System.out.printf("Usuario: ");
                    nomeValida = ler.next();
                    System.out.printf("Senha: ");
                    senhaValida = ler.next();
                    Tecnico t = new Tecnico();
                    t.validaUsuario(nomeValida, senhaValida, tecnicos);
                    break;
                }
                case 3:{
                    System.out.printf("Usuario: ");
                    nomeValida = ler.next();
                    System.out.printf("Senha: ");
                    senhaValida = ler.next();
                    Cliente c = new Cliente();
                    c.validaUsuario(nomeValida,senhaValida,clientes);
                    break;
                }
            }





        }while (i != 1);








    }
}
