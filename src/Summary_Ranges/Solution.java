package Summary_Ranges;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> summaryRanges(int[] nums) {
    int left = 0;
    int right = 0;
    List<String> result = new ArrayList<>();
    while (right < nums.length) {
      if ((right + 1 < nums.length) && (nums[right + 1] == nums[right] + 1)) {
        right++;
      } else {
        if (left == right) {
          result.add(String.valueOf(nums[left]));
        } else {
          result.add(nums[left] + "->" + nums[right]);
        }
        right++;
        left = right;
      }
    }
    return result;
  }
}

//class Solution {
//  public List<String> summaryRanges(int[] nums) {
//    if (nums.length == 0) {
//      return new ArrayList<>();
//    }
//    List<String> result = new ArrayList<>();
//    int start = nums[0];
//    for (int i = 1; i < nums.length; i++) {
//      if (nums[i] != nums[i - 1] + 1) {
//        if (start == nums[i - 1]) {
//          result.add(String.valueOf(start));
//        } else {
//          result.add(start + "->" + nums[i - 1]);
//        }
//        start = nums[i];
//      }
//    }
//    if (start == nums[nums.length - 1]) {
//      result.add(String.valueOf(start));
//    } else {
//      result.add(start + "->" + nums[nums.length - 1]);
//    }
//    return result;
//  }
//}