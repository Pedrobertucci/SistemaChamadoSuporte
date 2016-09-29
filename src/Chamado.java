import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by b_ped on 28/09/2016.
 */
public class Chamado {
    private String tituloChamado;
    private String ocorrencia;
    private int prioridade;
    private int status = 0;
    private Cliente cliente;

    Scanner ler = new Scanner(System.in);

    public String getTituloChamado() {
        return tituloChamado;
    }

    public void setTituloChamado(String tituloChamado) {
        this.tituloChamado = tituloChamado;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void cadastraChamado(String usuario, String senha, ArrayList<Cliente> c, ArrayList<Tecnico>t, ArrayList<Chamado> chamado){
        int tipo=0;
        for(int i=0; i < c.size(); i++){
            if(usuario.equals(c.get(i).getUsuario())){
                if(senha.equals(c.get(i).getSenha())){
                    System.out.printf("Titulo Chamado: ");
                    setTituloChamado(ler.next());
                    System.out.printf("Prioridade: 1-Urgente| 2-alta| 3-moderada| 4-baixa: ");
                    tipo = ler.nextInt();
                    switch (tipo){
                        case 1:{
                            setPrioridade(tipo);
                            break;
                        }
                        case 2:{
                            setPrioridade(tipo);
                            break;
                        }
                        case 3:{
                            setPrioridade(tipo);
                            break;
                        }
                        case 4:{
                            setPrioridade(tipo);
                            break;
                        }
                    }
                    System.out.printf("Descricao: ");
                    setOcorrencia(ler.next());
                    setStatus(0);


                }
            }


        }
    }
    public void visualizaChamados(ArrayList<Chamado> chamados){
        for (int i=0; i < chamados.size(); i++){
            System.out.println(chamados.get(i));
            // System.out.printf("["+i+"] | Nome Chamado: "+chamados.get(i).getTituloChamado()+" | Nome Cliente "+cliente.getNome());
        }

    }
}
