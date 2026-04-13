package binarySearch;

import java.util.PriorityQueue;

public class GasStations {
    public static double minimizeMaxDistanceBrute(int[] arr, int k) {
        int[] howMany = new int[arr.length - 1];
        for (int g = 1; g <= k; g++) {
            double maxSectionLength = -1;
            int maxIndex = -1;
            for (int i = 0; i < arr.length-1; i++) {
                double diff = Math.abs(arr[i] - arr[i+1]);
                double sectionLength = diff / ((double)howMany[i] + 1);
                if (sectionLength > maxSectionLength) {
                    maxSectionLength = sectionLength;
                    maxIndex = i;
                }
            }
            howMany[maxIndex]++;
        }
        double maxDistance = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            double diff = Math.abs(arr[i] - arr[i+1]);
            double sectionLength = diff / ((double)howMany[i] + 1);
            maxDistance = Math.max(maxDistance, sectionLength);
        }
        return maxDistance;
    }

    public static double minimizeMaxDistanceBetter(int[] arr, int k) {
        int[] howMany = new int[arr.length - 1];
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        for (int i = 0; i < arr.length-1; i++) {
            pq.offer(new double[]{(double)arr[i+1] - arr[i], (double)i});
        }
        for (int g = 1; g <= k; g++) {
            int index = (int)pq.element()[1];
            pq.poll();
            howMany[index]++;
            double diff = arr[index + 1] - arr[index];
            double newSectionLength = diff / ((double)howMany[index] + 1);
            pq.offer(new double[]{newSectionLength, index});
        }
        return pq.element()[0];
    }

    public static double minimizeMaxDistanceOptimal(int[] arr, int k) {
        double low = 0, high = maxDiff(arr);
        while (high - low > 0.000001) {
            double mid = (low + high) / 2.0;
            if (possible(arr, k, mid)) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return high;
    }

    public static int maxDiff(int[] arr) {
        int maxdiff = 0;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] -arr[i-1];
            if (diff > maxdiff) maxdiff = diff;
        }
        return maxdiff;
    }

    public static boolean possible(int[] arr, int k, double dist) {
        int gasStations = 0;
        for (int i = 1; i < arr.length; i++) {
            int gasStationsPerSection = (int)((arr[i] - arr[i-1]) / dist);
            if (arr[i] - arr[i-1] == gasStationsPerSection * dist) {
                gasStationsPerSection--;
            }
            gasStations += gasStationsPerSection;
        }
        return gasStations > k;
    }

    public static void main(String[] args) {
        int[] arr = {1, 13, 17, 23};
        int k = 763;
        System.out.println(minimizeMaxDistanceOptimal(arr, k));
    }
}
