import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by b_ped on 28/09/2016.
 */
public class Gerente {
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

    public void cadastraGerente(){
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
    public void dashbord(ArrayList<Gerente> gerentes, ArrayList<Tecnico> tecnicos, ArrayList<Cliente> clientes){
        int tipo=0;
        System.out.println("Bem vindo ao Painel do Gerente: ");
        System.out.printf("Informe o que deseja: 1-Listar | ");
        tipo = ler.nextInt();
        switch (tipo){
            case 1:{
                int tipo2=0,i=0;
                System.out.printf("1-Gerente| 2-Tecnicos | 3-Clientes");
                tipo2 = ler.nextInt();
                switch (tipo2){
                    case 1:{
                        for (Gerente g: gerentes ){
                            i++;
                            System.out.println("["+i+"] Nome: "+g.getNome());
                        }
                        break;
                    }
                    case 2:{
                        for(Tecnico t: tecnicos){
                            i++;
                            System.out.println("["+i+"] Nome: "+t.getNome());
                        }
                        break;
                    }
                    case 3:{
                        for (Cliente c: clientes){
                            i++;
                            System.out.println("["+i+"] Nome: "+c.getNome());
                        }
                    }

                }
                break;
            }
        }
    }
    public boolean validaUsuario(String usuario, String senha, ArrayList<Gerente> g){
        for(int i=0; i < g.size(); i++ ){
            if(usuario.equals(g.get(i).getUsuario())){
                if(senha.equals(g.get(i).getSenha())){
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

    @Override
    public String toString() {
        return "Gerente{" +
                "usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", nivel=" + nivel +
                ", telefone=" + telefone +
                '}';
    }
}
