package warmup;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchApp {
  static int[] unsorted = new Random().ints(0, 10000).limit(1000).toArray();
  static int[] sorted = unsorted.clone();

  // count number of `if` statements
  // executed to find the given element
  // find though unsorted data
  static int find_conventional(int[] origin, int number) {
    int counter = 0;
    // write your code here
    for (int el: origin) {
      if(number!=el) counter++;
      else break;
    }
    System.out.println(counter);
    return counter;

  }

  // count number of `if` statements
  // executed to find the given element
  // find through sorted data
  static int find_binary(int[] origin, int number) {
    int counter = 0;
    int min = 0;
    int max = origin.length-1;

    while (min<=max) {
      int mid = min + (max-min)/2;
      if (origin[mid]==number) {
        counter++;
        break;
      }
      if (origin[mid]<number) {
        counter++;
        min=mid+1;
      }
      else max=mid+1;
      counter++;
    }
    // write your code here
    return counter;
  }

  public static void main(String[] args) {
    Arrays.sort(sorted);
    System.out.println(Arrays.toString(unsorted));
    System.out.println(Arrays.toString(sorted));
    int rnd = sorted[(int) (Math.random()*1000)];
    System.out.println(rnd);
    int count1 = find_conventional(unsorted, rnd);
    int count2 = find_binary(sorted, rnd);
  }
}
