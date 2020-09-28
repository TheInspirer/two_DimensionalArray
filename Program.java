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
        int j, k, r, d;

        int flag = 0;

        int s = n;

        // Выполняем проверку введенного двумерного массива, если M <= N, то воспользуемся M
        if(m <= n){
            s = m;
        }

        for(int i = 0; i < s - i; i++){
            j = i;
            // Элемент J заполняет массив, строку от границы слева, до границы справа   ------>
            while(j < array[i].length - i) {
                array[i][j] = flag;
                flag++;
                j++;
            }
            j--;

            k = i + 1;
            // Элемент K заполняет столбец сверху вниз, от вверхней правой границы, до нижней правой границы
            while(k < array.length - i){
                array[k][j] = flag;
                flag++;
                k++;
            }
            k--;

            r = j - 1;
            // Элемент R заполняет строку снизу, от правой границы, до левой    <-------
            while(r >= i && i + 1 != s - i){
                array[k][r] = flag;
                flag++;
                r--;
            }
            r++;

            d = k - 1;
            // Элемент D заполняет столбец снизу вверх, от нижней левой границы, до вверхей левой границы
            while(d > i && i + 1 != s - i) {
                array[d][r] = flag;
                flag++;
                d--;
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