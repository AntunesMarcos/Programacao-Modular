public class Q2 {
    public static void main(String[] args) {
        long[] vetorA = {1,2,3,4,5,6,7,8,9,10};
        long[] ParImpar = new long[2];
        long numero = 0;

        for (int i = 0; i < 10; i++) {
            numero = vetorA[i];
            if (numero % 2 == 0) {
                ParImpar[0]++;
            }
            else{
                ParImpar[1]++;
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(ParImpar[i]);
        }
    }
}
