import carro.Civic;
import carro.ICarro;
import carro.Lancer;

import java.util.ArrayList;
import java.util.List;


public class ExemplosJavaGenerics {

    public static void main(String[] args) {
        List<ICarro> carro = new ArrayList<>();
        carro.add(new Lancer());
        carro.add(new Civic());
        imprimirCarros(carro);
    }

    public static void imprimirCarros(List<? extends ICarro> lista) {
        for (ICarro carro : lista) {
            System.out.println(carro);
        }
    }
}
