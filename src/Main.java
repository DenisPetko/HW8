import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int [] array = new int[] {1,2,3};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));

        double [] array2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(array2));

        int [] array3 = new int[] {1, 4, 5, 7};
        System.out.println(Arrays.toString(array3));
        System.out.println();

        System.out.println("Задача 2");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        } System.out.print(array[array.length-1]);
        System.out.println();

        for (int i = 0; i < array2.length - 1; i++) {
            System.out.print(array2[i] + ", ");
        }System.out.print(array2[array2.length - 1]);
        System.out.println();

        for (int i = 0; i < array3.length - 1; i++) {
            System.out.print(array3[i] + ", ");
        }System.out.print(array3[array3.length - 1]);
        System.out.println();

        System.out.println("Задача 3");

        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + ", ");
        } System.out.print(array[0]);
        System.out.println();

        for (int i = array2.length -1; i > 0 ; i--) {
            System.out.print(array2[i] + ", ");
        } System.out.print(array2[0]);
        System.out.println();

        for (int i = array3.length -1; i > 0; i--) {
            System.out.print(array3[i] + ", ");
        }System.out.print(array3[0]);
        System.out.println();

        System.out.println("Задача 4");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] + 1;
            }
            System.out.print(array[i] + " ");
        }

    }
}