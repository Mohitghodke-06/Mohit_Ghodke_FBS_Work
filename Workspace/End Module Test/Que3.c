//Enter number of products from user. For user.For those many products accept name,id and price from
//user and calculate price based on discount.If price is more than 500 discount is 20% otherwise discount is 5%
//display all details of products and also calculate total price after deducting 18%gst.
#include <stdio.h>
typedef struct {
    int id;
    char name[50];
    float price;
    float discountedPrice;
} Product;

int main() {
    int n;
    float total = 0, finalTotal;

    printf("Enter number of products: ");
    scanf("%d", &n);

    Product p[n];

    for (int i = 0; i < n; i++) {
        printf("\nEnter details of product %d:\n", i + 1);
        printf("ID: ");
        scanf("%d", &p[i].id);
        printf("Name: ");
        scanf("%s", p[i].name);
        printf("Price: ");
        scanf("%f", &p[i].price);

        if (p[i].price > 500)
            p[i].discountedPrice = p[i].price * 0.80; 
        else
            p[i].discountedPrice = p[i].price * 0.95;

        total+= p[i].discountedPrice;
    }


    finalTotal=total*(1-0.18);

    printf("\n--- Product Details ---\n");
    for (int i = 0; i < n; i++) {
        printf("ID: %d, Name: %s, Original Price: %.2f, After Discount: %.2f\n",
               p[i].id, p[i].name, p[i].price, p[i].discountedPrice);
    }

    printf("\nTotal (after discounts): %.2f", total);
    printf("\nFinal Total (after deducting 18% GST): %.2f\n", finalTotal);

    return 0;
}
