import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String surname = "TURING";
        int position = positionInOrder(surname);
        System.out.println(position); //Выведим позицию фамилии в сгенерированном списке
        }

        public static int positionInOrder(String surname) { //Генерируем список всех слов в лексикографическом порядке из букв фамилии
            char[] chars = surname.toCharArray();
            Arrays.sort(chars); // Сортируем буквы фамилии
            String sortedSurname = new String(chars);

            int position = 1;
            for (int i = 0; i < surname.length(); i++) {
                char c = surname.charAt(i);
                int count = 0;
                for (int j = i + 1; j < surname.length(); j++) {
                    if (surname.charAt(j) < c) {
                        count++;
                    }
                }
                position += count * factorial(surname.length() - i - 1);
            }
            return position;
        }

        public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}