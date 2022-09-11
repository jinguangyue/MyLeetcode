package com.jinguangyue.leetcode;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "jinguangyue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int[] nums = new int[]{7,1,5,3,6,4};
        int k = maxProfit(nums);
        Log.e(TAG, "" + k);
    }


    /**
     * 删除排序数组中的重复项
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;

        int first = 1, last = 1;
        while (first < n) {
            if (nums[first] != nums[last - 1]) {
                nums[last] = nums[first];
                last++;
            }
            first++;
        }

        return last;
    }


    /**
     * 买卖股票的最佳时机 II
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int profitGet = 0;

        for (int i=1; i<prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profitGet += prices[i] - prices[i-1];
            }
        }

        return profitGet;
    }
}