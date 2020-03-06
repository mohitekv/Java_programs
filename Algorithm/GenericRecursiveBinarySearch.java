import java.util.Arrays;

public class GenericRecursiveBinarySearch {

    public static <T extends Comparable<T>> int index(T[] items, T item) {
        return index(items, item, 0, items.length - 1);
    }

    public static <T extends Comparable<T>> int index(T[] items, T key, int low, int high) {
        if (key == null)
            return -1;

        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (key.compareTo(items[mid]) > 0)
            return index(items, key, mid + 1, high);
        else if (key.compareTo(items[mid]) < 0)
            return index(items, key, low, mid - 1);
        else
            return mid;
    }

    public static void main(String[] args) {

        Integer[] items = { 22, 55, 66, 11, 32, 56, 67, 89, 95, 10 };

        Arrays.sort(items);
        System.out.print("Sorted Integer Array = ");
        for (Integer item : items) {
            System.out.print(item + " ");
        }

        int foundIndex = index(items, Integer.valueOf(22));
        System.out.println("\nInteger Array Contains item 22 at index = " + foundIndex);

        foundIndex = index(items, Integer.valueOf(11));
        System.out.println("Integer Array Contains item 11 at index = " + foundIndex);

        foundIndex = index(items, Integer.valueOf(67));
        System.out.println("Integer Array Contains item 67 at index = " + foundIndex);

        foundIndex = index(items, Integer.valueOf(10));
        System.out.println("Integer Array Contains item 10 at index = " + foundIndex);

        foundIndex = index(items, Integer.valueOf(101));
        System.out.println("Integer Array Contains item 101 at index = " + foundIndex);

        foundIndex = index(items, null);
        System.out.println("Integer Array Contains item null at index = " + foundIndex);

        String[] strItems = { "alk", "abc", "adk", "zyt", "fre", "nhy" };
        Arrays.sort(strItems);

        System.out.print("\nSorted String Array = ");
        for (String item : strItems) {
            System.out.print(item + " ");
        }

        foundIndex = index(strItems, "alk");
        System.out.println("\nString Array Contains item alk at index = " + foundIndex);

        foundIndex = index(strItems, "nhy");
        System.out.println("String Array Contains item nhy at index = " + foundIndex);

        foundIndex = index(strItems, "zyt");
        System.out.println("String Array Contains item zyt at index = " + foundIndex);

        foundIndex = index(strItems, "zyts");
        System.out.println("String Array Contains item zyts at index = " + foundIndex);

        foundIndex = index(strItems, "null");
        System.out.println("String Array Contains item null at index = " + foundIndex);

        Double[] dItems = { 11.3, 13.3, 6.0, 9.6, 45.7, 23.2 };
        Arrays.sort(dItems);

        System.out.print("\nSorted Double Array = ");
        for (Double item : dItems) {
            System.out.print(item + " ");
        }

        foundIndex = index(dItems, 13.3);
        System.out.println("\nDouble Array Contains item 13.3 at index = " + foundIndex);

        foundIndex = index(dItems, 14.3);
        System.out.println("Double Array Contains item 14.3 at index = " + foundIndex);

        foundIndex = index(dItems, 23.0);
        System.out.println("Double Array Contains item 23.0 at index = " + foundIndex);

    }
}