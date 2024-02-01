package Doit_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2023 {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        //자릿수 별로 첫번째자리는 2 3 5 7
        //두번째부터는 1 3 5 7 9
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
        }
        static void DFS(int number, int jarisu){
        if(jarisu == N){
            if(isPrime(number)){
                System.out.println(number);
            }
            return;
        }

        for(int i=1;i<10;i++){
            if(i%2==0){
                continue;
            }
            if(isPrime(number * 10 + i)){
                DFS(number *10 +i, jarisu+1);
            }
        }
        }
        static boolean isPrime(int num){
        for(int i =2; i<=num/2;i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;

        }





}