import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by b_ped on 28/09/2016.
 */
public class Cliente {
    private String usuario;
    private String senha;
    private String nome;
    private String email;
    private int nivel;
    private double telefone;
    Scanner ler = new Scanner(System.in);


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }
    public void cadastraCliente(){
        int nivelCliente=3;
        System.out.println("*** Bem vindo! a central do cadastro de usuario do Sistema ***");
        System.out.printf("Usuario: ");
        setUsuario(ler.next());
        System.out.printf("Senha: ");
        setSenha(ler.next());
        System.out.printf("Nome: ");
        setNome(ler.next());
        System.out.printf("Email: ");
        setEmail(ler.next());
        System.out.printf("Telefone: ");
        setTelefone(ler.nextDouble());
        setNivel(nivelCliente);
    }


    public boolean validaUsuario(String usuario, String senha, ArrayList<Cliente>c, ArrayList<Tecnico>t, ArrayList<Chamado> chamado){
        String valida;
        int va=0;
        for(int i=0; i < c.size(); i++ ){
            if(usuario.equals(c.get(i).getUsuario())){
                if(senha.equals(c.get(i).getSenha())){
                    do{
                        dashbord(usuario,senha, c,t,chamado);
                        System.out.println("Deseja Sair? S-sim | N nao");
                        valida = ler.next();
                        if (valida.toLowerCase().equals("n")){
                            va++;
                        }
                    }while (va != 0);

                    return true;
                }else{
                    return false;
                }
            }{
                return false;
            }
        }
        return false;
    }
    public void dashbord(String usuario, String senha,ArrayList<Cliente> c,ArrayList<Tecnico>t, ArrayList<Chamado> chamado){
        int  tipo=0;
        for(int i=0; i < c.size(); i++){
            if(usuario.equals(c.get(i).getUsuario())){
                if(senha.equals(c.get(i).getSenha())){
                    System.out.println("Bem vindo a DASHBORD DO Cliente "+c.get(i).getNome());
                    System.out.println("1-Adicionar chamado | 2-Lista seus Chamados | ");
                    tipo = ler.nextInt();
                    switch (tipo){
                        case 1:{
                            Chamado chamado1 = new Chamado();
                            chamado1.cadastraChamado(usuario,senha,c,t,chamado);
                            chamado.add(chamado1);
                            System.out.println("*** USUARIO CADASTRADO COM SUCESSO ***");
                            break;
                        }
                        case 2:{
                            Chamado chamado2 = new Chamado();
                            chamado2.visualizaChamados(chamado);
                            break;
                        }
                    }

                }
            }
        }


    }
}
