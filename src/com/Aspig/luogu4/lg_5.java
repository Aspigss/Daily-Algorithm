//[CSP-J 2022 山东] 植树节
package com.Aspig.luogu4;
import java.io.*;

public class lg_5 {
  public static void main(String[] args) throws IOException {
    // 纯数字快读 StreamTokenizer  //其他用BufferedReader更快
    StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    //  读 n 和 p
    st.nextToken();
    int n = (int) st.nval; // 志愿者人数
    int[] v = new int[1000001];
    int[] D = new int[1000002]; // 差分数组

    for (int i = 0; i < n; i++) {
      st.nextToken();
      int x = (int) st.nval;
      st.nextToken();
      int y = (int) st.nval;
      D[x] += 1;
      D[y + 1] -= 1;
    }

    int max = 0;
    int now = 0;
    for (int i = 0; i <= 1000000; i++) {

      now += D[i];
      max = Math.max(max, now);
    }

    System.out.println(max);
  }
}
