package modelo;

import java.util.List;

public class Validacao 
{
    public String mensagem;
    public void validarProduto(List<String> listaDadosProduto)
    {
        this.mensagem = "";
        for (String s : listaDadosProduto)
        {
            if(s.isEmpty())
            {
                this.mensagem = "nenhum campo pode estar vazio";
                break;
            }
        }
        
    }
    
}
