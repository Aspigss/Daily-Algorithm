package com.Aspig.luogu4;
import java.io.*;
//语文成绩
public class lg_4 {
    public static void main(String[] args) throws IOException {
       //纯数字快读 StreamTokenizer  //其他用BufferedReader更快
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        
        //  读 n 和 p
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        int p = (int) st.nval;
 
        int[] score = new int[n + 1]; // 存原始成绩
        int[] D = new int[n + 2];     // 差分数组
        
        //  读初始成绩
        for (int i = 1; i <= n; i++) {
            st.nextToken();
            score[i] = (int) st.nval;
        }
        
        for (int i = 1; i <= n; i++) {
            D[i] = score[i] - score[i - 1];
        }
        
        for (int i = 0; i < p; i++) {
            st.nextToken();
            int x = (int) st.nval;
            st.nextToken();
            int y = (int) st.nval;
            st.nextToken();
            int z = (int) st.nval;
            D[x] += z;
            D[y + 1] -= z;
        }
        
        int min = 110;
        for (int i = 1; i <= n; i++) {
            D[i] = D[i - 1] + D[i]; 
            min = Math.min(min, D[i]);
        }
        
        System.out.println(min);
    }
}