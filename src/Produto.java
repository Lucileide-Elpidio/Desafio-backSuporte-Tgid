 //Neste código, removi o construtor vazio não utilizado e organizei
 // os métodos e variáveis com anotações de acesso (public, private) 
 //para tornar o código mais clean.//
public class Produto {          
	private Integer id;
    private String nome;
    private Integer quantidade;
    private Double preco;
    private Empresa empresa;

    public Produto(Integer id, String nome, Integer quantidade, Double preco, Empresa empresa) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.empresa = empresa;
    }

    // Getters e Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}

