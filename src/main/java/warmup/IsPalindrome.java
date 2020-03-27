package warmup;

public class IsPalindrome {

  boolean check(int n) {
    int start=0;
    String checkN =Integer.toString(n);
    int mid=checkN.length()/2;
    int j=checkN.length();
    for (int i = 0; i < mid ; i++) {
      if(i==j) {j--;
      continue;}
      return false;
    }
    return true;
  }
}
