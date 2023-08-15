public class Hotelzinho extends Servico{
    private double quantidadeHorasNoHotelzinho;
    public Hotelzinho (Animal animal){
        super (animal);
        this.setNomeServico("Hotelzinho");
    }

    public double getQuantidadeHorasNoHotelzinho() {
        return quantidadeHorasNoHotelzinho;
    }

    public void setQuantidadeHorasNoHotelzinho(double quantidadeHorasNoHotelzinho) {
        this.quantidadeHorasNoHotelzinho = quantidadeHorasNoHotelzinho;
    }

    @Override
    public double calcula() {
        double valor = 0;
        switch (getAnimal().getTamanho()){
            case "p" ->{
                valor=12;
            }
            case "m" ->{
                valor=18;
            }
            case "g" ->{
                valor=25;
            }
        }
        return valor+getQuantidadeHorasNoHotelzinho();
    }
}
