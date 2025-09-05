import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TesteComputador {

    @Test
    void testConstrutoresEGetters() {
        // Array de dados de teste seguindo a ordem do construtor:
        // {marca, modelo, processador, memoriaRAM, armazenamento}
        Object[][] dados = {
            {"Dell", "Inspiron 15", "Intel i5", 8, 512},
            {"Apple", "MacBook Air", "M1", 16, 256},
            {"Lenovo", "ThinkPad T14", "AMD Ryzen 7", 16, 512},
            {"Acer", "Aspire 5", "Intel i7", 8, 1024}
        };

        Computador[] computadores = new Computador[4];

        // ---------------------------------------
        // Cenário 1: Metade com construtor default
        // ---------------------------------------
        System.out.println("=== Cenário 1: Criando metade das instâncias com construtor default ===");
        for (int i = 0; i < 2; i++) {
            computadores[i] = new Computador();
            System.out.println("Instância " + (i+1) + " criada via construtor default.");

            System.out.println("Valores esperados: Marca='', Modelo='', Processador='', MemoriaRAM=0, Armazenamento=0");
            System.out.println("Valores retornados: Marca='" + computadores[i].getMarca() +
                               "', Modelo='" + computadores[i].getModelo() +
                               "', Processador='" + computadores[i].getProcessador() +
                               "', MemoriaRAM=" + computadores[i].getMemoriaRAM() +
                               ", Armazenamento=" + computadores[i].getArmazenamento());

            assertEquals("", computadores[i].getMarca());
            assertEquals("", computadores[i].getModelo());
            assertEquals("", computadores[i].getProcessador());
            assertEquals(0, computadores[i].getMemoriaRAM());
            assertEquals(0, computadores[i].getArmazenamento());

            System.out.println("✅ Valores iniciais corretos.\n");
        }

        // ---------------------------------------
        // Cenário 2: Metade com construtor parametrizado
        // ---------------------------------------
        System.out.println("=== Cenário 2: Criando a outra metade com construtor parametrizado ===");
        for (int i = 2; i < 4; i++) {
            computadores[i] = new Computador(
                (String) dados[i][0],
                (String) dados[i][1],
                (String) dados[i][2],
                (Integer) dados[i][3],
                (Integer) dados[i][4]
            );
            System.out.println("Instância " + (i+1) + " criada via construtor parametrizado.");

            System.out.println("Valores esperados: Marca=" + dados[i][0] +
                               ", Modelo=" + dados[i][1] +
                               ", Processador=" + dados[i][2] +
                               ", MemoriaRAM=" + dados[i][3] +
                               ", Armazenamento=" + dados[i][4]);
            System.out.println("Valores retornados: Marca=" + computadores[i].getMarca() +
                               ", Modelo=" + computadores[i].getModelo() +
                               ", Processador=" + computadores[i].getProcessador() +
                               ", MemoriaRAM=" + computadores[i].getMemoriaRAM() +
                               ", Armazenamento=" + computadores[i].getArmazenamento());

            assertEquals((String) dados[i][0], computadores[i].getMarca());
            assertEquals((String) dados[i][1], computadores[i].getModelo());
            assertEquals((String) dados[i][2], computadores[i].getProcessador());
            assertEquals((int) dados[i][3], computadores[i].getMemoriaRAM());
            assertEquals((int) dados[i][4], computadores[i].getArmazenamento());

            System.out.println("✅ Instância " + (i+1) + " validada com sucesso.\n");
        }

        // ---------------------------------------
        // Cenário 3: Aplicar setters na metade do cenário 1
        // ---------------------------------------
        System.out.println("=== Cenário 3: Atualizando instâncias do cenário 1 com setters ===");
        for (int i = 0; i < 2; i++) {
            computadores[i].setMarca((String) dados[i][0]);
            computadores[i].setModelo((String) dados[i][1]);
            computadores[i].setProcessador((String) dados[i][2]);
            computadores[i].setMemoriaRAM((Integer) dados[i][3]);
            computadores[i].setArmazenamento((Integer) dados[i][4]);
            System.out.println("Instância " + (i+1) + " atualizada com setters.");
        }

        System.out.println("=== Validação final de todas as instâncias ===");
        for (int i = 0; i < 4; i++) {
            System.out.println("\nVerificando instância " + (i+1) + ":");
            System.out.println("Valores esperados: Marca=" + dados[i][0] +
                               ", Modelo=" + dados[i][1] +
                               ", Processador=" + dados[i][2] +
                               ", MemoriaRAM=" + dados[i][3] +
                               ", Armazenamento=" + dados[i][4]);
            System.out.println("Valores retornados: Marca=" + computadores[i].getMarca() +
                               ", Modelo=" + computadores[i].getModelo() +
                               ", Processador=" + computadores[i].getProcessador() +
                               ", MemoriaRAM=" + computadores[i].getMemoriaRAM() +
                               ", Armazenamento=" + computadores[i].getArmazenamento());

            assertEquals((String) dados[i][0], computadores[i].getMarca());
            assertEquals((String) dados[i][1], computadores[i].getModelo());
            assertEquals((String) dados[i][2], computadores[i].getProcessador());
            assertEquals((int) dados[i][3], computadores[i].getMemoriaRAM());
            assertEquals((int) dados[i][4], computadores[i].getArmazenamento());

            System.out.println("✅ Instância " + (i+1) + " validada com sucesso após setters e construtores!\n");
        }
    }
}
