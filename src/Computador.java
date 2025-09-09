
public class Computador {

      private String modelo;
      private String marca;
      private int MemoriaRAM;
      private int ArmazenamentoSSD;
      private String processador;

    public Computador() {
    }


    public Computador( String modelo, String marca, int MemoriaRam, int ArmazenamentoSSD, String processador) {
        this.modelo = modelo;
        this.marca = marca;
        this.MemoriaRAM = MemoriaRAM;
        this.ArmazenamentoSSD = ArmazenamentoSSD;
        this.processador = processador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriaRAM() {
        return MemoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        MemoriaRAM = memoriaRAM;
    }

    public int getArmazenamentoSSD() {
        return ArmazenamentoSSD;
    }

    public void setArmazenamentoSSD(int armazenamentoSSD) {
        ArmazenamentoSSD = armazenamentoSSD;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void imprimir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Memória RAM: " + MemoriaRAM + " GB");
        System.out.println("Armazenamento SSD: " + ArmazenamentoSSD + " GB");
        System.out.println("Processador: " + processador);
    }

    }


