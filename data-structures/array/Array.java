package array;

import java.util.Iterator;

interface ArrayInterface<T> extends Iterable<T> {
    public T get(int index);
    public void set(int index, T element);
    public int size();
    public void selection_sort();
    public void bubble_sort();
    public void insertion_sort();
    public void quick_sort();
    public void merge_sort();
    public int linear_search(T element);
    public int binary_search(T element);
}

public class Array<T extends Comparable<T>> implements ArrayInterface<T> {
    private T[] non_sorted_array;

    public Array(T[] array) {
        this.non_sorted_array = array;
    }

    public Array(int size) {
        this.non_sorted_array = (T[]) new Comparable[size];
    }

    public void selection_sort() {
        for (int i = 0; i < this.non_sorted_array.length - 1; i++) {
            int min_ind = i;
            for (int j = i + 1; j < this.non_sorted_array.length; j++) {
                if (this.non_sorted_array[j].compareTo(this.non_sorted_array[min_ind]) < 0) {
                    min_ind = j;
                }
            }
            T temp = this.non_sorted_array[i];
            this.non_sorted_array[i] = this.non_sorted_array[min_ind];
            this.non_sorted_array[min_ind] = temp;
        }
    }

    public void bubble_sort() {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < this.non_sorted_array.length - 1; i++) {
                if (this.non_sorted_array[i].compareTo(this.non_sorted_array[i + 1]) > 0) {
                    T temp = this.non_sorted_array[i];
                    this.non_sorted_array[i] = this.non_sorted_array[i + 1];
                    this.non_sorted_array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public void insertion_sort() {
        for (int i = 1; i < this.non_sorted_array.length; i++) {
            T current = this.non_sorted_array[i];
            int j = i - 1;
            while (j >= 0 && current.compareTo(this.non_sorted_array[j]) < 0) {
                this.non_sorted_array[j + 1] = this.non_sorted_array[j];
                j--;
            }
            this.non_sorted_array[j + 1] = current;
        }
    }

    // #region Quick Sort
    private int partition(int low, int high) {
        T pivot_element;
        int i, j;
        pivot_element = this.non_sorted_array[low];
        i = low;
        j = high;
        while (i < j) {
            do {
                i++;
            } while (i < high && this.non_sorted_array[i].compareTo(pivot_element) <= 0);
            while (j > low && this.non_sorted_array[j].compareTo(pivot_element) > 0) {
                j--;
            }
            if (i < j) {
                T temp = this.non_sorted_array[i];
                this.non_sorted_array[i] = this.non_sorted_array[j];
                this.non_sorted_array[j] = temp;
            }
        }
        this.non_sorted_array[low] = this.non_sorted_array[j];
        this.non_sorted_array[j] = pivot_element;
        return j;
    }

    private void quick_sort(int low, int high) {
        if (low < high) {
            int pivot_ind = this.partition(low, high);
            this.quick_sort(low, pivot_ind - 1);
            this.quick_sort(pivot_ind + 1, high);
        }
    }

    public void quick_sort() {
        this.quick_sort(0, this.non_sorted_array.length - 1);
    }
    // #endregion

    // #region Merge Sort
    private void merge(int low, int mid, int high) {
        T merged[] = (T[]) new Comparable[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (this.non_sorted_array[i].compareTo(this.non_sorted_array[j]) < 0) {
                merged[k] = this.non_sorted_array[i];
                i++;
            } else {
                merged[k] = this.non_sorted_array[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            merged[k] = this.non_sorted_array[i];
            i++;
            k++;
        }
        while (j <= high) {
            merged[k] = this.non_sorted_array[j];
            j++;
            k++;
        }
        for (int l = 0; l < merged.length; l++) {
            this.non_sorted_array[low + l] = merged[l];
        }
    }

    private void merge_sort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            this.merge_sort(low, mid);
            this.merge_sort(mid + 1, high);
            this.merge(low, mid, high);
        }
    }

    public void merge_sort() {
        this.merge_sort(0, this.non_sorted_array.length - 1);
    }
    // #endregion

    public int linear_search(T element) {
        for (int i = 0; i < this.non_sorted_array.length; i++) {
            if (this.non_sorted_array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    // #region Binary Search
    private int binary_search(int low, int high, T element) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (this.non_sorted_array[mid].equals(element)) {
            return mid;
        } else if (this.non_sorted_array[mid].compareTo(element) > 0) {
            return this.binary_search(low, mid - 1, element);
        } else {
            return this.binary_search(mid + 1, high, element);
        }
    }

    public int binary_search(T element) {
        this.quick_sort();
        return this.binary_search(0, this.non_sorted_array.length, element);
    }
    // #endregion

    public void set(int index, T value) {
        this.non_sorted_array[index] = value;
    }

    public T get(int index) {
        return this.non_sorted_array[index];
    }

    public T[] get() {
        return this.non_sorted_array;
    }

    @Override
    public int size() {
        return this.non_sorted_array.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < non_sorted_array.length;
            }

            @Override
            public T next() {
                return non_sorted_array[index++];
            }
            
        };
    }

}