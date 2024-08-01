#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// Function to merge two halves of an array during Merge sort
void merge(int arr[], int l, int m, int r) {
    int i, j, k;
    int n1 = m - l + 1;
    int n2 = r - m;

    // Create temporary arrays
    int L[n1], R[n2];

    // Copy data to temporary arrays L[] and R[]
    for (i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (j = 0; j < n2; j++)
        R[j] = arr[m + 1 + j];

    // Merge the temporary arrays back into arr[l..r]
    i = 0;
    j = 0;
    k = l;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    // Copy the remaining elements of L[], if there are any
    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    // Copy the remaining elements of R[], if there are any
    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
}

// Function to perform Merge sort
void mergeSort(int arr[], int l, int r) {
    if (l < r) {
        // Same as (l+r)/2, but avoids overflow for large l and r
        int m = l + (r - l) / 2;

        // Sort first and second halves
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        // Merge the sorted halves
        merge(arr, l, m, r);
    }
}

// Function to partition the array for Quick sort
int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j <= high - 1; j++) {
        if (arr[j] < pivot) {
            i++;
            // Swap the elements if they are in the wrong order
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Swap the pivot element with the element at (i + 1)
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
}

// Function to perform Quick sort
void quickSort(int arr[], int low, int high) {
    if (low < high) {
        // Partition the array and get the pivot index
        int pivotIndex = partition(arr, low, high);

        // Recursively sort the subarrays on either side of the pivot
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

int main() {
    const int size = 10000;  // Adjust the size based on your system's capacity

    // Create a random dataset
    int dataSet_merge[size];
    int dataSet_quick[size];
    for (int i = 0; i < size; i++) {
        dataSet_merge[i] = rand() % 1000;  // Generating random numbers between 0 and 999
        dataSet_quick[i] = dataSet_merge[i];  // Copy the same dataset for comparison
    }

    // Measure time taken by Merge sort
    clock_t start_merge = clock();
    mergeSort(dataSet_merge, 0, size - 1);
    clock_t end_merge = clock();
    double time_merge = ((double)(end_merge - start_merge)) / CLOCKS_PER_SEC;

    // Measure time taken by Quick sort
    clock_t start_quick = clock();
    quickSort(dataSet_quick, 0, size - 1);
    clock_t end_quick = clock();
    double time_quick = ((double)(end_quick - start_quick)) / CLOCKS_PER_SEC;

    // Print the execution times
    printf("Time taken by Merge sort: %f seconds\n", time_merge);
    printf("Time taken by Quick sort: %f seconds\n", time_quick);

    return 0;
}