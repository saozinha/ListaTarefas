package to;

/**
 * Created by sao on 27/08/2016.
 */
public class Tarefa {

    public Tarefa(int codigo, String descricao, String status, String duracao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.status = status;
        this.duracao = duracao;
    }

    private int codigo;
    private String descricao;
    private String status;
    private String duracao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
