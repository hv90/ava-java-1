import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Método auxiliar para ler inteiro com validação
    private static int lerInteiro(Scanner sc, String mensagem) {
        int valor;
        while (true) {
            try {
                System.out.print(mensagem);
                valor = sc.nextInt();
                sc.nextLine(); // consumir quebra de linha
                break;
            } catch (InputMismatchException e) {
                System.out.println("❌ Valor inválido! Digite um número inteiro.");
                sc.nextLine(); // descarta entrada inválida
            }
        }
        return valor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Computador c1 = new Computador();
        Computador c2 = new Computador();

        System.out.println("=== Cadastro Computador 1 (construtor default) ===");
        System.out.print("Marca: ");
        c1.setMarca(sc.nextLine());
        System.out.print("Modelo: ");
        c1.setModelo(sc.nextLine());
        System.out.print("Processador: ");
        c1.setProcessador(sc.nextLine());
        c1.setMemoriaRAM(lerInteiro(sc, "Memória RAM (GB): "));
        c1.setArmazenamento(lerInteiro(sc, "Armazenamento (GB): "));

        System.out.println("=== Cadastro Computador 2 (construtor default) ===");
        System.out.print("Marca: ");
        c2.setMarca(sc.nextLine());
        System.out.print("Modelo: ");
        c2.setModelo(sc.nextLine());
        System.out.print("Processador: ");
        c2.setProcessador(sc.nextLine());
        c2.setMemoriaRAM(lerInteiro(sc, "Memória RAM (GB): "));
        c2.setArmazenamento(lerInteiro(sc, "Armazenamento (GB): "));

        System.out.println("=== Cadastro Computador 3 (construtor com parâmetros) ===");
        System.out.print("Marca: ");
        String marca3 = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo3 = sc.nextLine();
        System.out.print("Processador: ");
        String proc3 = sc.nextLine();
        int ram3 = lerInteiro(sc, "Memória RAM (GB): ");
        int arm3 = lerInteiro(sc, "Armazenamento (GB): ");
        Computador c3 = new Computador(marca3, modelo3, proc3, ram3, arm3);

        System.out.println("=== Cadastro Computador 4 (construtor com parâmetros) ===");
        System.out.print("Marca: ");
        String marca4 = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo4 = sc.nextLine();
        System.out.print("Processador: ");
        String proc4 = sc.nextLine();
        int ram4 = lerInteiro(sc, "Memória RAM (GB): ");
        int arm4 = lerInteiro(sc, "Armazenamento (GB): ");
        Computador c4 = new Computador(marca4, modelo4, proc4, ram4, arm4);

        System.out.println("\n=== Computadores cadastrados ===");
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
        c4.imprimir();

        sc.close();
    }
}
