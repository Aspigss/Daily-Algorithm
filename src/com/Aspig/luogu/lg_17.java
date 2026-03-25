package com.Aspig.luogu;
import java.util.Scanner;

public class lg_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];          // 存储所有分数
        
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            
            // 从第三个评委开始计算
            if (i >= 2) {
                int maxVal = scores[0];
                int minVal = scores[0];
                int sum = 0;
                
                // 遍历前 i+1 个分数，找出最大、最小，并计算总和
                for (int j = 0; j <= i; j++) {
                    sum += scores[j];
                    if (scores[j] > maxVal) maxVal = scores[j];
                    if (scores[j] < minVal) minVal = scores[j];
                }
                
                // 去掉一个最高分和一个最低分后的平均分
                double avg = (double)(sum - maxVal - minVal) / (i - 1);
                System.out.printf("%.2f\n", avg);
            }
        }
        sc.close();
    }
}