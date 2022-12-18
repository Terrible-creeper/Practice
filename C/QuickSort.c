#include <stdio.h>

void quickSort(int arr[], int left, int right) {
  int i = left, j = right;
  int tmp;
  int pivot = arr[(left + right) / 2];

  while (i <= j) {
    while (arr[i] < pivot) i++;
    while (arr[j] > pivot) j--;
    if (i <= j) {
      tmp = arr[i];
      arr[i] = arr[j];
      arr[j] = tmp;
      i++;
      j--;
    }
  }

  if (left < j)
    quickSort(arr, left, j);
  if (i < right)
    quickSort(arr, i, right);
}

int main() {
  int n;
  printf("請輸入資料筆數(n<=10): ");
  scanf("%d", &n);
  if(n > 10) return printf("資料筆數大於10，已退出");
  int arr[n];

  for (int i = 0; i < n; i++) {
    printf("請輸入第 %d 筆資料: ", i + 1);
    scanf("%d", &arr[i]);
  }

  printf("\n初始資料為: ");
  for (int i = 0; i < n; i++) printf("%d ", arr[i]);
  printf("\n");
  quickSort(arr, 0, n - 1);

  printf("\n排序後的結果為: ");
  for (int i = 0; i < n; i++) printf("%d ", arr[i]);
}
