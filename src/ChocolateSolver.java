public class ChocolateSolver {
    public static void main(String[] args) {
        int budget = 100;    
        int price = 10;       
        int fantiki = 3; 
        
        int chocolatesBought = budget / price;
        int totalChocolates = chocolatesBought; 
        int wrappers = chocolatesBought;        

        System.out.println("Начальные покупки: куплено " + chocolatesBought + " шт.");

      
        while (wrappers >= fantiki) {
            int newChocolates = wrappers / fantiki;
            totalChocolates += newChocolates;
            wrappers = (wrappers % fantiki) + newChocolates;
        }
        System.out.println("Итого можно получить шоколадок: " + totalChocolates);
    }
}