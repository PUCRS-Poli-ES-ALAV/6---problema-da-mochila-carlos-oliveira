import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class knapsack{

    public static class Item implements Comparable<Item>{
        public int valor;
        public int peso;
        public double coeficiente;

        public Item(int valor, int peso){
            this.valor = valor;
            this.peso = peso;
            this.coeficiente = this.peso / this.valor;
        }

        @Override
        public int compareTo(Item outro) {
            if(this.coeficiente == outro.coeficiente) {
                return 0;
            }
            else if (this.coeficiente < outro.coeficiente) {
                return 1;
            }

            return -1;
        }

        @Override
        public String toString() {
            return "Valor=" + valor + ", Peso=" + peso + ", Coeficiente=" + coeficiente;
        }
        
    }

    public static void main(String[] args) {
        ArrayList<Item> itens = new ArrayList<>();

        Item um = new Item(10,2);
        Item dois = new Item(5,5);
        Item tres = new Item(7,3);
        Item quatro = new Item(1, 4);

        itens.add(um);
        itens.add(dois);
        itens.add(tres);
        itens.add(quatro);
        
        System.out.println("Primeira Lista: ");
        for (Item itemaux : itens) {
            System.out.printf("Valor: %d | Peso: %d | Coeficiente: %.2f\n", itemaux.valor, itemaux.peso, itemaux.coeficiente);
        }

        int i = exec(itens);
    }

    public static int exec(ArrayList<Item> itens){
        List<Item> aux = itens.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Segunda Lista: ");
        for (Item auxItem : aux) {
            System.out.println(auxItem);
        }

        return 0;
    }
}