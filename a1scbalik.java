import java.util.Scanner; 
import java.util.Stack;

public class a1scbalik {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        
        
        System.out.print("Masukkan kata yang ingin dibalik: ");
        String word = scanner.nextLine(); 
        
       
        scanner.close(); 
        
        System.out.println("Kata asli: " + word);
        
      
        Stack<Character> stack = new Stack<>();
        
  
        System.out.println("\n=== PROSES PUSH ===");
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            stack.push(character);
            System.out.println("Push: '" + character + "' -> Stack: " + stack);
        }
        
      
        System.out.println("\n=== PROSES POP ===");
        StringBuilder reversedWord = new StringBuilder();
        
        while (!stack.isEmpty()) {
            char character = stack.pop();
            reversedWord.append(character);
            System.out.println("Pop: '" + character + "' → Reversed: " + reversedWord);
        }
        
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Kata asli: " + word);
        System.out.println("Kata terbalik: " + reversedWord.toString());
        System.out.println("Jumlah character yang dibalik : " + word.length());

    }
}
