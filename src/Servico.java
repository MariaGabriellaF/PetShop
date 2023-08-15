import java.util.Date;

public abstract class Servico {
    private Animal animal;
    private Date data;
    private int codigo;
    private String nomeServico;

    public abstract double calcula();
    public Servico (Animal animal){
        setAnimal (animal);
        data = new Date();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nome) {
        this.nomeServico = nome;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "data=" + data +
                '}';
    }
}
