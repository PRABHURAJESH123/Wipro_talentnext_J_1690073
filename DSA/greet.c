#include<stdio.h>

int main(void){
     int binSearch;
     int A[]={2,3,4,5,6,7,8};
     int target=5;
     int n=sizeof(A)/sizeof(A[0]);
     int index=(A,n,target);
     if(index!=-1)
     {
      printf("found at %d",index);
     }
      else{
         printf("not found");
         return 0;
      }
}
     
    
   