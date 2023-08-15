public class Tosa extends Servico{
    public Tosa (Animal animal){
        super(animal);
        this.setNomeServico("Tosa");
    }

    @Override
    public double calcula() {
        double valor = 0;
        switch (getAnimal().getTamanho()){
            case "p" ->{
                valor = 22;
            }
            case "m" ->{
                valor=30;
            }
            case "g" ->{
                valor=40;
            }
        }
        return valor;
    }
}
