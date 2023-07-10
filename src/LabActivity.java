import java.util.Scanner;

public class LabActivity {
    java.util.Scanner get = new Scanner(System.in);

    private int x;
    private int[] nums;

    public LabActivity() {
        x = 5;
    }

    public int getX() {
        return x;
    }

    public void setX(int a) {
        x = a;
    }

    // public void bubble() {
    // }

    public void insertion() {
        for (int border = 1; border < nums.length; border++) {
            int curr = nums[border];
            int i = border - 1;
            while (i >= 0 && curr < nums[i]) {
                nums[i + 1] = nums[i];
                i--;
            }
            nums[i + 1] = curr;
        }
    }

    // public void quick() {
    // }

    public void selection() {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] < nums[min])
                    min = j;

            swap(nums[min], nums[i]);
        }
    }

    public void swap(int a, int b) {
        int ph = a;
        a = b;
        b = ph;
    }

    private void getArrayNums() {
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Set int in index[%d] - ", i);
            nums[i] = get.nextInt();
        }
    }

    private void printNums() {
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d  ", nums[i]);
        }
        System.out.println();
    }

    private void showSortingMenu() {
        System.out.println("Sort the array using...");
        System.out.println("1. Bubble Sort - (unfinished)");
        System.out.println("2. Selection Sort");
        System.out.println("3. Quick Sort - (unfinished)");
        System.out.println("4. Insertion Sort");
        System.out.print("## Enter the your choice: ");
    }

    private void chooseSorting() {
        int choice = get.nextInt();
        switch (choice) {
            case 1:
                // bubble();
                //  - (unfinished)
                break;
            case 2:
                selection();
                break;
            case 3:
                // quick();
                //  - (unfinished)
                break;
            case 4:
                insertion();
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }

    public void sortAndMenu() {
        System.out.print("Enter the size of the array (int): ");

        byte size = get.nextByte();
        nums = new int[size];

        getArrayNums();

        System.out.print("Your array: ");
        printNums();

        showSortingMenu();

        chooseSorting();

        System.out.print("Sorted Array: ");
        printNums();
    }

    public static void main(String[] args) throws Exception {
        LabActivity labAssignment = new LabActivity();

        labAssignment.sortAndMenu();

        labAssignment.get.close();
    }
}
