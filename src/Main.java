import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String regex = "^(https?:\\/\\/)?((?!-)[A-Za-z0-9-]{2,63}(?<!-)\\.)+[A-Za-z]{2,}(?::\\d{1,5})?(\\/[^\\s?#]*)?(\\?[^\\s#]*)?(#\\S*)?$";

        while (true){
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("q")) break;
            System.out.println(input.matches(regex) ? "Valid URL" : "Invalid URL");
        }
    }
}