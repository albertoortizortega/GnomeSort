public class Main {
    public static void main(String[] args) {
        int[] arr = userArray();
        gnomeSort(arr);
        printArray(arr);
    }
    public static void gnomeSort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (index == 0) {
                index++;
            }
            if (arr[index] >= arr[index - 1]) {
                index++;
            } else {
                int aux = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = aux;
                index--;
            }
        }
    }
    public static int[] userArray() {
        int[] arr;
        System.out.println("Enter an array with spaces: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine();
        String[] stringArr = input.split(" ");
        arr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            try {
                arr[i] = Integer.parseInt(stringArr[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter only integers.");
                        System.exit(0);
            }
        }
        if (arr.length < 3) {
            System.out.println("Array must have at least 3 elements.");
            printArray(arr);
            System.exit(0);
        }
        return arr;
    }
    public static void printArray(int[] arr) {
        System.out.print("Array: [");
        for (int num : arr) {
            if(num == arr[arr.length - 1]) {
                System.out.print(num);
            } else {
                System.out.print(num + ", ");
            }
        }
        System.out.println("]");
    }
}
