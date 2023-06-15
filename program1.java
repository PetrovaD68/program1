/* 1 */

java.util.Scanner

public class Main
{
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Введите кол-во чисел: ");
int n = scanner.nextInt();
System.out.println("sumProstNum(n, scanner) = " + sumProstNum(n, scanner));
}

/**
* @apiNote 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
* @param n длинна последомательности целых чисел
* @param scanner сканер
* @return сумму простых чисел
*/
private static int sumProstNum(int n, Scanner scanner) {
int sum = 0;
for (int i = 0; i < n; i++) {
int tmp = 0;
int n1 = scanner.nextInt();
for (int j = 2; j < n1 - 1; j++) {
if(n1 % j == 0) {
tmp++;
}
}
if (tmp == 0){
sum += n1;
}
}
scanner.close();
return sum;
}
}


/* 2 */

java.util.Scanner

public class Main
{
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Введите кол-во чисел: ");
int n = scanner.nextInt();
System.out.println("numberUpp(n, scanner) = " + numberUpp(n, scanner));
}

/**
* @apiNote 2) Дана последовательность из N целых чисел. Верно ли,
* что последовательность является возрастающей.
* @param n длинна последомательности целых чисел
* @param scanner сканер
* @return результат
*/
private static boolean numberUpp(int n, Scanner scanner) {
int n1 = scanner.nextInt();
for (int i = 0; i < n - 1; i++) {
int n2 = scanner.nextInt();
if (n1 > n2) {
return false;
}
n1 = n2;
}
scanner.close();
return true;
}
}

/* 3 */

java.util.Scanner

public class Main
{
	public static void main(String[] args) {
System.out.println("Введите размер массива: ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
System.out.println("printAray(chekArray(n)) = " + printAray(chekArray(n)));
}


/* @apiNote 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму
* индексов двузначных элементов массива.
* @param n длинна будущего массива цифр
* @return массив цифр
*/
private static int[] chekArray(int n) {
Random random = new Random();
int[] array = new int[n];
int sum = 0;
for (int i = 0; i < n; i++) {
array[i] = random.nextInt(-100, 100);
if (array[i] >= 10 && array[i] < 100){
sum += i;
}
}
System.out.println(printAray(array)); // для проверки
for (int i = 0; i < n; i++) {
if (array[i] < 0){
array[i] = sum;
}
}
return array;
}


/* @param array массив чисел
* @return строку вида: [n, n1, ...]
*/
public static String printAray(int[] array){
String res = "[";
for (int i = 0; i < array.length; i++) {
if (i == array.length - 1){
res += array[i] + "]";
break;
}
res += array[i] + ",";
}
return res;
}
}



/* 4 */

public class Main
{
   public static void main(String[] args) {
char[][] board = {
{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
{'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

System.out.println("Validete:" + isValidSudoku(board));

}

/**
* @apiNote 4)(*) Отвалидировать доску судоку
* Требования
* Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
* 1. Каждая строка должна содержать цифру 1-9 без повторения
* 2. Каждая колонка должна содержать цифру 1-9 без повторения
* 3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
* Ограничения
* • board.length == 9
* • board[i].length == 9
* • board[i][j] значение число или '.'
* @param board двухмерный массив символов
* @return результат
*/
private static boolean isValidSudoku(char[][] board) {
for (int i = 0; i < 9; i++) {
for (int j = 0; j < 9; j++) {
if (board[i][j] != '.') {
int tmp = 0;
int tmp1 = 0;
for (char el : board[i]) {
if (board[i][j] == el) {
tmp++;
}
}
for (int k = 0; k < 9; k++) {
if (board[i][j] == board[k][j]) {
tmp1++;
}
}
if (tmp > 1 || tmp1 > 1) {
return false;
}
}
}

}
return true;
} 
    
}
