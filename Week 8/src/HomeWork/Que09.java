//9. Write java program using for loop and print your group name 10 times.

package HomeWork;

public class Que09 {

    public static void main(String[] args) {
        Que09 obj = new Que09();
        obj.loop();
    }

    public void loop() {
        String groupName = "Code2";

        for (int i = 1; i < 11; i++) {
            System.out.println(i+ ". " +groupName);
        }
    }
}
