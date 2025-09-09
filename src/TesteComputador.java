import java.util.Scanner;

public class TesteComputador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Computador[] computadores = new Computador[4];

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe os dados do Computador " + (i + 1) + ":");

            computadores[i] = new Computador();

            System.out.print("Modelo: ");
            computadores[i].setModelo(sc.nextLine());

            System.out.print("Marca: ");
            computadores[i].setMarca(sc.nextLine());

            System.out.print("Memória RAM (GB): ");
            computadores[i].setMemoriaRAM(sc.nextInt());

            System.out.print("Armazenamento SSD (GB): ");
            computadores[i].setArmazenamentoSSD(sc.nextInt());
            sc.nextLine();

            System.out.print("Processador: ");
            computadores[i].setProcessador(sc.nextLine());

            System.out.println();
        }

        for (int i = 2; i < 4; i++) {
            System.out.println("Informe os dados do Computador " + (i + 1) + ":");

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Memória RAM (GB): ");
            int memoriaRAM = sc.nextInt();

            System.out.print("Armazenamento SSD (GB): ");
            int armazenamentoSSD = sc.nextInt();
            sc.nextLine();

            System.out.print("Processador: ");
            String processador = sc.nextLine();

            computadores[i] = new Computador(modelo, marca, memoriaRAM, armazenamentoSSD, processador);

            System.out.println("---------------------------");
        }

        sc.close();


        System.out.println("===== Computadores Criados =====");
        for (int i = 0; i < 4; i++) {
            System.out.println("Computador " + (i + 1) + ":");
            computadores[i].imprimir();
            System.out.println();
        }
    }
}

