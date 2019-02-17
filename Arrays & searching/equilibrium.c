//https://practice.geeksforgeeks.org/problems/equilibrium-point/0/?track=sp-arrays-and-searching

#include <stdio.h>

int main() {
    int t, n,a[100],i,j,k,l=0;
    scanf("%d", &t);
    while(t--){
        scanf("%d", &n);
        for(i=0;i<n;i++){
            scanf("%d", &a[i]);
        }
        for(i=0;i<n;i++){
            int sum1 =0;
            int sum2 =0;
           // l=0;
            for(j=i;j<n;j++){
                sum1= sum1 + a[j];
            }
            for(k=0;k<=i;k++){
                sum2 =sum2 + a[k];
            }
        if(sum1==sum2){
            printf("%d\n", i+1);
            l= l+1;

            }
        }
        if(l==0){
            printf("-1\n");
        }
    }
	//code
	return 0;
}

