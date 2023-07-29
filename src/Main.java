// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Stack value = new Stack();

        System.out.println(value.isempty());

        value.push(10);
        value.push(20);
        value.push(30);
        value.push(40);

        System.out.println(value.isempty());
        System.out.println(value.isfull());
        System.out.println();

        value.show();
        value.pop();
        value.pop();
        System.out.println();
        value.show();





            }
        }
