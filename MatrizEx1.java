public class MatrizEx1 {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 6, 7, 8},
            {2, 4, 2, 9},
            {77 , 10 , 23, 120},
            {11, 5, 3, 110}
        };
        
        System.out.println("Matriz 4x4: ");
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}