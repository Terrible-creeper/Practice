#include <stdio.h>
#include <stdlib.h>

typedef struct node {
	int data;
	struct node *next;
} NODE;

void push_node(NODE **start,int value) {
	NODE *new_node = (NODE*)malloc(sizeof(NODE));
	new_node->data = value;
	new_node->next = NULL;
	
	if(*start == NULL) {
		*start = new_node;
		return;
	} else {
        new_node->next = *start;
		*start = new_node;
		return;
	}
}

void pop_node(NODE **start) {
	NODE *current = *start;
	*start = current->next;
	printf("POP out => %d\n",current->data);
	free(current);
	return;
}

int isEmpty(NODE *node) {
    return node == NULL ?  1 : 0;
}

void print_list(NODE *node) {
	while(node != NULL) {
		printf("%d ",node->data); 
		node = node->next;
	}
	printf("\n");
}

void free_list(NODE *node) {
	NODE *current, *temp;
	current = node;
	while(current != NULL) {
		temp = current;
		current = current->next;
		free(temp);
	}
}

int main() {
    int selection,data,first = 1;

    NODE *head = NULL;
    while(1) {
        printf("\nNow Data: \n");
        if(isEmpty(head)) printf("NO DATA...\n"); else print_list(head);
        if(first == 1) first = 0;
        printf("\n(1) PUSH Data\n(2) POP Data\n(0) Exit\n=> ");
        scanf("%d",&selection);
        switch (selection) {
            case 0:
                printf("EXIT....");
                free_list(head);
                return 0;
            case 1:
                printf("Enter a data to PUSH => ");
                scanf("%d",&data);
                push_node(&head,data);
                break;
            case 2:
                if(head != NULL) pop_node(&head); else printf("Error...\n");
                break;
            default:
                printf("Error...\n");
                break;
        }
    }
}
