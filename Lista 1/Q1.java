public class Q1 {
    public static void main(String[] args) {

        long[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        long[] vetorB = new long[15];
        long valor = 1;

        for(int i = 0; i < 15; i++){
            valor = 1;

            for (int j = 1; j <= vetorA[i]; j++){
                valor *= j;
            }
            vetorB[i] = valor;
        }
        for(int i = 0; i<15; i++) {
            System.out.println( vetorA[i]);
        }

        for(int i = 0; i<15; i++) {
            System.out.println(vetorB[i]);
        }
    }
}
