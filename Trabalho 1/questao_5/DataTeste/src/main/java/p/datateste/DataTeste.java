package p.datateste;

public class DataTeste {

    public static void main(String[] args) {
        System.out.println("\nPrimeira Data: \n");
        Data data = new Data(05, 10, 2005);
        data.exibeData();

        System.out.println("\nData Moificada: \n");
        data.setDia(12);
        data.setMes(8);
        data.setAno(2024);

        data.exibeData();
    }

}
