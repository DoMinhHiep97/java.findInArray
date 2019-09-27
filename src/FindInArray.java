import java.util.Scanner;

public class FindInArray {
    private FindInArray(String[] arr, String keyWord) {
        boolean isExist = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(keyWord)) {
                System.out.println("Poition of the students in the list " + keyWord + " is:" + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        String keyWord = scanner.nextLine();
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        new FindInArray(students,keyWord);
    }

}
