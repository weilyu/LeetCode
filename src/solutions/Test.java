package solutions;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        //N が与えられたとき、N! のすべての桁の代わり
        double product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        String result = String.valueOf(product);
        System.out.println(result);








        System.out.println("XXXXXX");
    }
}