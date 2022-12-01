import java.util.Scanner;

public class Aeroporto {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("SEJA BEM VINDO AO AEROPORTO JATINHO FELIZ");

        do{
            System.out.println("==========================");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Cadastrar Avião: ");
            System.out.println("2 - Listar Avião: ");
            System.out.println("3 - Remover Avião: ");
            System.out.println("4 - Cadastrar Helicoptero: ");
            System.out.println("5 - Listar Helicoptero: ");
            System.out.println("6 - Remover Helicoptero: ");
            System.out.println("7 - Cadastrar Jato: ");
            System.out.println("8 - Listar Jato: ");
            System.out.println("9 - Remover Jato: ");
            System.out.println("10 - Cadastrar Companhia: ");
            System.out.println("11 - Listar Companhia: ");
            System.out.println("12 - Remover Companhia: ");
            System.out.println("13 - Cadastrar Voo: ");
            System.out.println("14 - Listar Voo: ");
            System.out.println("15 - Remover Voo: ");
            System.out.println("16 - Cadastrar Hangar: ");
            System.out.println("17 - Listar Hangar: ");
            System.out.println("18 - Remover Hangar: ");
            System.out.println("19 - Cadastrar Pista: ");
            System.out.println("20 - Listar Pista: ");
            System.out.println("21 - Remover Pista: ");
            System.out.println("==========================");

            try{
                opcao = scanner.nextInt();
            }catch (Exception e){
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    cadastrarAviao(scanner);
                    break;
                case 2: 
                    listarAviao();
                    break;
                case 3:
                    excluirAviao(scanner);
                    break;
                case 4:
                    cadastrarHelicoptero(scanner);
                    break;
                case 5: 
                    listarHelicoptero();
                    break;
                case 6: 
                    excluirHelicoptero(scanner);
                    break;
                case 7: 
                    cadastrarJato(scanner);
                    break;
                case 8:
                    listarJato();
                    break;
                case 9: 
                    excluirJato(scanner);
                    break;
                case 10:
                    cadastrarCompanhia(scanner);
                    break;
                case 11:
                    listarCompanhia();
                    break;
                case 12: 
                    excluirCompanhia(scanner);
                    break;
                case 13: 
                    cadastrarVoo(scanner);
                    break;
                case 14: 
                    listarVoo();
                    break;
                case 15:
                    excluirVoo(scanner);
                    break;
                case 16: 
                    cadastrarHangar(scanner);
                    break;
                case 17: 
                    listarHangar();
                    break;
                case 18:
                    excluirHangar(scanner);                          
                    break;
                case 19: 
                    cadastrarPista(scanner);
                    break;
                case 20:
                    listarPista();
                    break;
                case 21:
                    excluirPista(scanner);
                    break;                              
            }
        }while(opcao!= 0);
        scanner.close();
    }
        public static void cadastrarAviao(Scanner scanner){
            try{
                System.out.println("Cadastrar Avião");
                System.out.println("Digite o ID do avião: ");
                int id = scanner.nextInt();
                System.out.println("Digite o modelo do avião: ");
                String modelo = scanner.next();
                System.out.println("Digite a marca do avião: ");
                String marca = scanner.next();
                System.out.println("Digite a capacidade do avião: ");
                String capacidade = scanner.next();
                System.out.println("Digite o prefixo do avião: ");
                String prefixo = scanner.next();
                
                new Aviao(id, modelo, marca, capacidade, prefixo, null);
            }catch(Exception e){
                System.out.println("Erro ao cadastrar o Avião");
            }
        }
        public static void listarAviao(){
            for(Aviao aviao : Aviao.avioes){
                System.out.println(aviao);
            }
        }

        public static void excluirAviao(Scanner scanner){
            try{
                System.out.println("Digite o ID do carro: ");
                int id = scanner.nextInt();
                Aviao.excluir(id);
                System.out.println("Avião excluído com êxito!!!");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        public static void cadastrarHelicoptero(Scanner scanner){
            try{
                System.out.println("Cadastrar Helicoptero");
                System.out.println("Digite o ID do helicoptero: ");
                int id = scanner.nextInt();
                System.out.println("Digite o modelo do helicoptero: ");
                String modelo = scanner.next();
                System.out.println("Digite a marca do helicoptero: ");
                String marca = scanner.next();
                System.out.println("Digite a capacidade do helicoptero: ");
                int capacidade = scanner.nextInt();
                System.out.println("Digite a cor do helicoptero: ");
                String cor = scanner.next();

                new Helicoptero(id, marca, modelo, capacidade, cor);
            }catch(Exception e){
                System.out.println("Erro ao cadastrar helicoptero");
            }
        }    
        public static void listarHelicoptero(){
            for(Helicoptero helicoptero : Helicoptero.helicopteros){
                System.out.println(helicoptero);
            }
        }       
        public static void excluirHelicoptero(Scanner scanner){
            try{
                System.out.println("Digite o ID do Helicoptero: ");
                int id = scanner.nextInt();
                Helicoptero.excluir(id);
                System.out.println("Avião excluído com êxito!!!");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }    
        }
}