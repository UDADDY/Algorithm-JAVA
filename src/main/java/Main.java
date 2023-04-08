import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();

        int index = 0;
        int move;
        System.out.print(1 + " ");
        while(true){
            boolean isDone = true;
            for(int i=0;i<N;i++){
                if(arr[i]!=0)
                    isDone = false;
            }
            if(isDone)
                return;

            move = arr[index];
            arr[index] = 0;

            if(move>0){
                for(index=index+1; move!=0; index++){
                    if(index == N){
                        index = 0;
                    }
                    if(arr[index] != 0){
                        move--;
                    }
                }
                System.out.print(index+" ");
            } else{
                for(index=index-1; move!=0; index--){
                    if(index==-1){
                        index = N-1;
                    }
                    if(arr[index] != 0){
                        move++;
                    }
                }
                System.out.print(index+" ");
            }

        }
    }
}