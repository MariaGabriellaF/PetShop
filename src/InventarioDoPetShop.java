import java.util.ArrayList;
import java.util.List;

public class InventarioDoPetShop {
    private List<Servico> listaServico = new ArrayList<>();
    public void adcionarServico (Servico servico){
        servico.setCodigo(listaServico.size());
        listaServico.add(servico);
    }
    public double calculaUmServico(int posicao){
        return listaServico.get(posicao).calcula();
    }
    public double calculaTodosOsServicos(){
        double soma = 0.0;
        for (int i = 0; i < listaServico.size(); i++) {
            soma+=calculaUmServico(i);
        }
        return soma;
    }
    public String organizarServico(Servico servico){
        int codigo = servico.getCodigo();
        String nome = servico.getAnimal().getNome();
        String nomeServico = servico.getNomeServico();
        String data = servico.toString();
        double valor = servico.calcula();
        return String.format("%d\t\t%s\t\t\t%s\t\t\t\tR$ %.2f", codigo,nome,nomeServico,valor);
    }
    public String relatorio(){
        System.out.println("Relatório geral dos serviços:");
        System.out.println("Código\tNome\t\tNome do Serviço\t\t\tValor");
        StringBuilder sb = new StringBuilder();
        for (Servico ser : listaServico){
            sb.append(organizarServico(ser)).append("\n");

        }
        return sb.toString();
    }
}

