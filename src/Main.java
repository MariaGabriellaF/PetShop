import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventarioDoPetShop inventario = new InventarioDoPetShop();
        Servico servico = null;
        boolean sairDoPrograma = false;
        int escolhaDoUsuario;


        while(sairDoPrograma==false){
            System.out.println("PetShop Animal Feliz");
            System.out.println("Serviços:\nDigite:\n1-Tosa.\n2-Banho.\n3-Hotelzinho.\n4-Sair.");
            escolhaDoUsuario = sc.nextInt();
            sc.nextLine();
            if(escolhaDoUsuario==4){
                System.out.println("Programa encerrado.");
                break;
            }
            if (!((escolhaDoUsuario >= 1) && (escolhaDoUsuario <= 3))) {
                System.out.println("Erro! Digite um número válido.");
                escolhaDoUsuario= sc.nextInt();
            }
            Animal animal = novoAnimal();

            switch (escolhaDoUsuario){
                case 1: {
                    servico = new Tosa (animal);
                    System.out.println("Valor da tosa é de R$: "+servico.calcula());
                    inventario.adcionarServico(servico);
                    break;
                }
                case 2: {
                    servico = new Banho(animal);
                    System.out.println("Valor do banho é de R$: "+servico.calcula());
                    inventario.adcionarServico(servico);
                    break;
                }
                case 3: {
                    servico = new Hotelzinho(animal);
                    System.out.println("Valor do Hotelzinho é de R$: "+servico.calcula());
                    inventario.adcionarServico(servico);
                    break;
                }
                default:
                    break;


            }

    }
        System.out.println(inventario.relatorio());
}

    public static Animal novoAnimal() {
        Scanner sc = new Scanner(System.in);
            String nome, tamanho, tamanhoDoPelo;
            System.out.print("Nome do animal: ");
            nome = sc.nextLine();

            do{
                System.out.println("Qual o tamanho do animal?\np- para curto.\nm- para médio.\ng- para longo.");
                tamanho = sc.nextLine().toLowerCase();
            }while(!tamanho.equals("p") && !tamanho.equals("m") && !tamanho.equals("g"));

            do{
                System.out.println("Qual o tamanho do pelo do animal?\np- para curto.\nm- para médio.\ng- para longo.");
                tamanhoDoPelo = sc.nextLine().toLowerCase();
            }while(!tamanhoDoPelo.equals("p") && !tamanhoDoPelo.equals("m") && !tamanhoDoPelo.equals("g"));

            return new Animal(nome, tamanho, tamanhoDoPelo);



    }
}
