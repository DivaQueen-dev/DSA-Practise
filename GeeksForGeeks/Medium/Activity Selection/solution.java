import java.util.*;

class Solution {

    class Activity {
        int start, finish;

        Activity(int s, int f) {
            start = s;
            finish = f;
        }
    }

    public int activitySelection(int[] start, int[] finish) {

        int n = start.length;

        Activity[] arr = new Activity[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Activity(start[i], finish[i]);
        }

        Arrays.sort(arr, (a, b) -> a.finish - b.finish);

        int count = 1;
        int lastEnd = arr[0].finish;

        for (int i = 1; i < n; i++) {

            if (arr[i].start > lastEnd) {
                count++;
                lastEnd = arr[i].finish;
            }
        }

        return count;
    }
}