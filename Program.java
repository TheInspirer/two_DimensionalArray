import java.util.Scanner;

// Седьмое задание
public class Program {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of columns: ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of lines: ");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int j, k, r, d; // Переменные 

        int flag = 0;

        int minLengthInArray = m < n ? m : n;

        // Выполняем проверку введенного двумерного массива, если M < N, то воспользуемся M
        // Это необходимо, для определния количества итераций


        for(int i = 0; i < minLengthInArray - i; i++){
            // Элемент J заполняет массив, строку от границы слева, до границы справа   ------>
            for (j = i; j < array[i].length - i; j++) {
                array[i][j] = flag;
                flag++;
            }
            // Элемент K заполняет столбец сверху вниз, от вверхней правой границы, до нижней правой границы
            for (k = i + 1; k < array.length - i; k++){
                array[k][j - 1] = flag;
                flag++;
            }
            // Элемент R заполняет строку снизу, от правой границы, до левой    <-------
            for (r = j - 1; r >= i && i + 1 != minLengthInArray - i; r--){
                array[k - 1][r] = flag;
                flag++;
            }
            // Элемент D заполняет столбец снизу вверх, от нижней левой границы, до вверхей левой границы
            for (d = k - 1; d > i && i + 1 != minLengthInArray - i; d--) {
                array[d][r + 1] = flag;
                flag++;
            }
        }

        // Распечатываем получившийся массив
        for (int i = 0; i < array.length ; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
	}
}