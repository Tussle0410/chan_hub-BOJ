//A+B,https://tussle.tistory.com/54
//수학, 구현, 사칙연산

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int result = a+b;
        bw.write(String.valueOf(result));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}