import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by b_ped on 28/09/2016.
 */
public class Tecnico {
    private String usuario;
    private String senha;
    private String nome;
    private String email;
    private int nivel;
    private double telefone;
    private int nChamado=0;
    Scanner ler = new Scanner(System.in);

    public int getnChamado() {return nChamado;}

    public void setnChamado(int nChamado) {this.nChamado = nChamado; }

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

    public void cadastraTecnico(){
        int nivelTec=2;
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
        setNivel(nivelTec);

    }
    public void validaUsuario(String usuario, String senha, ArrayList<Tecnico> t){
        for(int i=0; i < t.size(); i++ ){
            if(usuario.equals(t.get(i).getUsuario())){
                if(senha.equals(t.get(i).getSenha())){
                   dashbord(usuario,senha, t);
                }else{
                    System.out.println("Usuario Incorreto! ");
                }
            }else{
                System.out.println("Error");
            }
        }

    }
    public void dashbord(String usuario, String senha, ArrayList<Tecnico> t){

        for(int i=0; i < t.size(); i++){
            if(usuario.equals(t.get(i).getUsuario())){
                if(senha.equals(t.get(i).getSenha())){
                    System.out.println("Bem vindo a DASHBORD DO TECNICO "+t.get(i).getNome());
                    System.out.println("1-Meus chamados ");


                }
            }
        }


    }
}
