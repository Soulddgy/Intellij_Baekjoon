package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i=M;i<=N;i++){
            boolean flag = true;
            if(i==1){
                continue;
            }else{
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        flag = false;
                        break;
                    }
                }
                if(flag) System.out.println(i);
            }

        }


    }
}
