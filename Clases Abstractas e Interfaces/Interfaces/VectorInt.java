import java.util.Arrays;
import java.util.Random;

public class VectorInt implements IMinMax, IEstadisticas {
    
    public static int[] vector;
    private int tamaño;

    public VectorInt(int t) {
        this.tamaño = t;
        vector = new int [t];
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }


    public void ranDom(int min, int max){
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) ((Math.random() * (max - min + 1)) + min);
            System.out.println(vector[i]);
        }
    }

    @Override
    public int getMinimo() {
        int minimo = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < minimo) {
                minimo = vector[i];
            }
        }
        return minimo;
    }

    @Override
    public int getMaximo() {
        int maximo = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }
        return maximo;
    }

    public String toString(){
        return "Minimo: " + getMinimo() + "\n" +
                "Máximo " + getMaximo();
    }

    @Override
    public double getMedia() {
        double suma  = 0;
        double media = suma / tamaño;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
        return media;
    }

    @Override
    public double getMediana() {
        Arrays.sort(vector);
        int posicion = vector.length / 2;
        double mediana = vector[posicion];
        return mediana;
    }

    @Override
    public int getModa() {
        Arrays.sort(vector);
        int moda = 0;

        return moda;
    }
}
