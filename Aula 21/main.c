#include <stdio.h>
#include <time.h>

int values[] = {1, 2, 3, 4, 5, 4, 4,3,2};
int target, i;

void search() {
    for (i = 0; i <= 100; i++) {
        if (values[i] == target) {
            printf("------------------------\n");
            printf("Resultado encontrado\n");
            printf("------------------------\n");
            return;
        } else {
            printf("------------------------\n");
            printf("Resultado não encontrado\n");
            printf("------------------------\n");
        }
    }
}

int main(void) {
    target = 9;

    clock_t startTime, endTime;
    double elapsedTime;

    startTime = clock();
    printf("\n");
    search();
    printf("\n");
    endTime = clock();

    elapsedTime = (double)(endTime - startTime) / CLOCKS_PER_SEC;
    printf("Tempo de execução: %lf segundos\n", elapsedTime);

    return 0;
}
