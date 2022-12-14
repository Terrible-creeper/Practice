#include <stdio.h>
#include <stdlib.h>

typedef struct node {
	int data;
	struct node *next;
} NODE;

void add_node(NODE **start, int value) {
	NODE *new_node = (NODE*)malloc(sizeof(NODE));
	new_node->data = value;
	new_node->next = NULL;
	
	if(*start == NULL) {
		*start = new_node;
		return;
	}
	else {
		NODE *current;	
		current = *start;
		while(current->next != NULL) {
			current = current->next;
		}
		current->next = new_node;
		return;
	}
}

void insert_node(NODE **p, int newvalue, int insert_after_value) {
		NODE *cur = *p;
		int i = 0;
		while(cur != NULL) {
			if(insert_after_value == 0) {
				NODE *new_node = (NODE*)malloc(sizeof(NODE));
				new_node->data = cur->data;
				new_node->next = cur->next;
				cur->data = newvalue;
				cur->next = new_node;
				break;
			} else if(i+1 == insert_after_value) {
				NODE *new_node = (NODE*)malloc(sizeof(NODE));	
				new_node->data = newvalue;
				new_node->next = cur->next;
				cur->next = new_node;
				break;
			}
			cur = cur->next;
			i++;
		}
}


void delete_node(NODE **start, int value) {
	NODE *current = *start;
	NODE *temp;

	if(value == current->data) {
		*start = current->next;
		free(current);
		return;
	}
	
	while(current != NULL) {
		if(current->next->data == value) {
			temp = current->next;
			current->next = current->next->next;
			free(temp);
			return;
		}
		current = current->next;
	}
}

void print_list(NODE *node,int i) {
	while(node != NULL) {
		if(i == 0) printf("%d ",node->data); 
		else if(i == 1) printf("*node=%p, node->data=%d, node->next=%p\n",node,node->data,node->next);
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
    int selection,newdata,insertlocation,deletedata;
    NODE *head = NULL;
    while(1) {
        printf("目前串列內容: ");
        print_list(head,0);
        printf("\n(1) 新增節點\n(2) 插入節點\n(3) 刪除節點\n(4) 節點資訊\n(0) 結束\n... ");
        scanf("%d",&selection);
        switch (selection) {
            case 0:
                printf("已結束...");
                free_list(head);
                return 0;
            case 1:
                printf("請輸入新的資料... ");
                scanf("%d",&newdata);
                add_node(&head,newdata);
                break;
            case 2:
                printf("請輸入要插入的資料... ");
                scanf("%d",&newdata);
                printf("請輸入要插入的位置... ");
                scanf("%d",&insertlocation);
                insert_node(&head,newdata,insertlocation-1);
                break;
            case 3:
                printf("請輸入要刪除的資料... ");
                scanf("%d",&deletedata);
                delete_node(&head,deletedata);
                break;
            case 4:
                print_list(head,1);
                break;
            default:
                printf("輸入錯誤，請重新輸入...");
                break;
        }
    }
}
