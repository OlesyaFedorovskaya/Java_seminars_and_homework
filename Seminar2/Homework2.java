package Seminar2;
/* 
Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
Дано два числа, например 3 и 56, необходимо составить следующие строки: 
3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
*Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
*/
public class Homework2 {
    public static void main(String[] args) {
        
// Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

String str1 = "Пам - парам - папам ";
String str2 = "Пам - парам";
String str3 = "марап - маП";

System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));

StringBuilder builder = new StringBuilder();
builder.append(str3);
System.out.println(str2.equals(builder.reverse().toString()));

// Дано два числа, например 3 и 56, необходимо составить следующие строки: 
// 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
int a = 3;
int b = 56;
StringBuilder builder2 = new StringBuilder();
System.out.println(builder2.append(3).append(" ").append("+").append(" ").append(56).append(" ")
                            .append("=").append(" ").append(59).append(" ").append(3).append(" ")
                            .append("-").append(" ").append(56).append(" ").append("=").append(" ")
                            .append(-53).append(" ").append(3).append(" ").append("*").append(" ")
                            .append(56).append(" ").append("=").append(" ").append(168));

// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

String str = "3 + 56 = 59";
StringBuilder builder3 = new StringBuilder(str);
System.out.println(builder3.deleteCharAt(7));
System.out.println(builder3.insert(7, "равно"));
System.out.println(builder3.replace(7,12,"="));
System.out.println(builder3.replace(7, 7, "равно").deleteCharAt(12));

    }
    
}
