package io.tonny.config;

/**
 * Created by luohoufu on 2017/8/5.
 */
public class CommonTest {
    public static void main(String[] args) {
        int a = -6;
        for (int i =0 ; i<32;i++){
            int t = (a & 0x80000000>>>i) >>> (31 -i);
            System.out.print(t);
        }
    }
}
