
        import java.util.Scanner;

        public class WordCounter {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a text: ");
                String inputText = scanner.nextLine();
        
                String[] words = inputText.split("\\s+");
        
                int wordCount = 0;
        
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty()) { 
                        wordCount++;
                    }
                }
                System.out.println("Total word count: " + wordCount);
                scanner.close();
            }
        }


