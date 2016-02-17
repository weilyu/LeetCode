package solutions;

/**
 * Created by lvwei on 2/17/2016.
 * 319. Bulb Switcher
 * Difficulty: Medium
 * There are n bulbs that are initially off. You first turn on all the bulbs. Then, you turn off every second bulb.
 * On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the nth round,
 * you only toggle the last bulb. Find how many bulbs are on after n rounds.
 */
public class BulbSwitcher {
    public int bulbSwitch(int n) {
        int[] bulbs = new int[n + 1];

        //light all bulbs on the first round
        for (int i = 1; i < n + 1; i++) {
            bulbs[i] = 1;
        }

        //second to nth round
        for (int i = 2; i <= n; i++) {
            for (int k = i; k <= n; k += i) {
                bulbs[k]++;
            }
        }

        //check light bulbs
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (bulbs[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
