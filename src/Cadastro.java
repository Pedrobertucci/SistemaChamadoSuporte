import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by b_ped on 27/09/2016.
 * Nome, Telefone, e-mail, login e senha
 */
public class Cadastro {
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

    public void cadastraUsuario(){
        int nivel =0, cont=0;

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
        System.out.printf("Nivel: 1-Master| 2-Tecnico | 3-Cliente|  ");
        do{
            if(cont >= 1){
                System.out.println("Nivel Incorreto");
                System.out.printf("Nivel: 1-Master| 2-Tecnico | 3-Cliente|  ");
            }
            nivel = ler.nextInt();
            cont++;
        }while (nivel != 1 && nivel !=2 && nivel !=3);
        setNivel(nivel);

    }



    @Override
    public String toString() {
        return "Cadastro{" +
                "usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", nivel=" + nivel +
                ", telefone=" + telefone +
                '}';
    }
}
