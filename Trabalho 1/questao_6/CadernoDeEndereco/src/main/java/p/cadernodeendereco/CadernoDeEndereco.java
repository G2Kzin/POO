
package p.cadernodeendereco;

public class CadernoDeEndereco {
     private String nome;
    private String telefone;
    private String email;
    private String data;
    private String endereco;

    public CadernoDeEndereco(String nome, String telefone, String email, String data, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.data = data;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
