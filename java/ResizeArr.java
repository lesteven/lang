import java.util.Arrays;


public class ResizeArr {
    private int pos = 0;
    private int size = 2;
    private int[] arr;

    public ResizeArr() {
        arr = new int[size]; 
    }
    public void add(int num) {
        arr[pos++] = num;
        if (pos == size) {
            size *= 2;
            arr = Arrays.copyOf(arr, size);
        }
    }
    public String toString() {
        return Arrays.toString(arr);
    } 
    public static void main(String[] args) {
        ResizeArr arr = new ResizeArr();
        arr.add(10);
        arr.add(120);
        arr.add(20);
        arr.add(310);
        System.out.println(arr);
    }
}
