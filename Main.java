import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String[] arr1 = {"hill", "mold", "tree", "lake"};
    int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
    double[] arr3 = {4.45, 6.45, 7.65, 2.545, 7.454, 5.534, 8.99};

    reverse(arr1);
    System.out.println(product(arr2));
    System.out.println(average(arr3));
    
  }

  public static void reverse(String[] arr)
  {
    for (String i : arr) {
      String reverse = "";
      for (int k = i.length(); k > 0; k--) {
        reverse = reverse + i.substring(k - 1 , k);
      }
      System.out.println(reverse);
    }
  }

  public static int product(int[] arr)
  {
    int product = 1;
    for (int i : arr) {
      product*=i;
    }
    return product;
  }

  public static double average(double[] arr)
  {
    double average = 0;
    for (double i : arr) {
      average+=i;
    }
    average/=arr.length;
    return average;
  }
}
