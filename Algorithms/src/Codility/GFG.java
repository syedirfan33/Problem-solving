package Codility;

public class GFG { 
    static void printArray(int N, int SUM, int K) 
    { 
   
        int minSum = (N * (N + 1)) / 2; 
  
   
        int maxSum = (N * K) - (N * (N - 1)) / 2; 
  
        if (minSum > SUM || maxSum < SUM) { 
            System.out.println("Not Possible"); 
            return; 
        } 
 
        int arr[] = new int[N + 1]; 
        for (int i = 1; i <= N; i++) 
            arr[i] = i; 
  
        int sum = minSum; 
  
        for (int i = N; i >= 1; i--) { 
   
            int x = sum + (K - i); 
            if (x < SUM) { 
                sum = sum + (K - i); 
  
                arr[i] = K; 
  
                K--; 
            } 
  
            else { 
  
                arr[i] += (SUM - sum); 
                sum = SUM; 
                break; 
            } 
        } 
  
        for (int i = 1; i <= N; i++) 
            System.out.print(arr[i] + " "); 
    } 
    public static void main(String[] args) 
    { 
        int N = 2, SUM = 9, K = 10; 
        printArray(N, SUM, K); 
    } 
} 
