//2.Declare array and store any 5 countries and print them in console.

package HomeWork;

public class Que02 {

    public static void main(String[] args) {
        Que02 obj = new Que02();
        obj.arrayPrint();
    }

    public void arrayPrint() {
        String[] countries = {"Australia", "India", "China", "Germany", "Russia"};

        for (String country : countries) {
            System.out.println(country);
        }
    }
}
