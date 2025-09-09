package managedBeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Controle;

@ManagedBean
@RequestScoped
public class bgrIndex 
{
    private String titulo;
    private String fabricante;
    private String peso;
    private String valor;
    private String resposta;

    
    public bgrIndex() 
    {
    }

    public String cadastrarProduto()
    {
        List<String>listaDadosProduto = new ArrayList<String>();
        listaDadosProduto.add(titulo);
        listaDadosProduto.add(fabricante);
        listaDadosProduto.add(peso);
        listaDadosProduto.add(valor);
        Controle controle = new Controle();
        controle.cadastrarProduto(listaDadosProduto);
        this.resposta = controle.mensagem;
        return "/paginas/pagResposta";
        
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
    
}
