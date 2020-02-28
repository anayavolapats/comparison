import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            File cor = new File("C:\\Users\\User\\Desktop\\Яна\\Samsung\\src\\correct");
            Scanner corscan = new Scanner(cor);
            String c;
            File mis = new File("C:\\Users\\User\\Desktop\\Яна\\Samsung\\src\\mistake");
            Scanner misscan = new Scanner(mis);
            String m;
            while (misscan.hasNext() && corscan.hasNext()) {
                c = corscan.next();
                m = misscan.next();
                for (int i = 0; i < c.length(); i++) {
                    if (m.charAt(i) != c.charAt(i)) {
                        System.out.println("Найдено несовпадение!");
                        System.out.println("Символ в файле correct: " + c.charAt(i));
                        System.out.println("Символ в файле mistake: " + m.charAt(i));
                        System.out.println("__________________________________________");
                    }
                }
            }
            corscan.close();
            misscan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}