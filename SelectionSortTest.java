public class SelectionSortTest {
    public static void main(String[] args) {
        SelectionSort listSort = new SelectionSort();
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

        System.out.println("array befor sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(" " + list[i]);
        }
        System.out.println();

        listSort.selectionSort(list);

        System.out.println("array after sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(" " + list[i]);
        }
    }
}
