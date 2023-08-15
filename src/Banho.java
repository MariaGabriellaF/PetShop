public class Banho extends Servico{
    public Banho (Animal animal){
        super (animal);
        this.setNomeServico("Banho");
    }

    @Override
    public double calcula() {
        double valor = 0;
        switch (getAnimal().getTamanho()){
            case "p" ->{
                valor = 20;
            }
            case "m" ->{
                valor = 30;
            }
            case "g" ->{
                valor = 40;
            }
        }
        switch (getAnimal().getTamanhoDoPelo()){
            case "curto" ->{
                valor+=0;
            }
            case "medio" ->{
                valor+=10;
            }
            case "longo" ->{
                valor+=20;
            }
        }
        return valor;
    }
}
