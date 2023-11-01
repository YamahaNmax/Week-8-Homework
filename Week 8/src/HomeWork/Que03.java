//3. Declare multidimensional array and store 5 countries and their capital and print them in console.

package HomeWork;

public class Que03 {

    public static void main(String[] args) {
        String[][] countryAndCapital = {
                {"Australia", "Canberra"},
                {"India", "Delhi"},
                {"China", "Beijing"},
                {"Germany", "Berlin"},
                {"Russia", "Moscow"}
        };

        for (int i = 0; i < countryAndCapital.length; i++) {
            System.out.println("Country: " + countryAndCapital[i][0] + ", Capital: " + countryAndCapital[i][1]);
        }
    }
}