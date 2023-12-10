public class Arrays {

  public int max(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max)
        max = array[i];
    }
    return max;
  }

  public int min(int[] array) {
    int min = array[0];
    for(int i=1; i<array.length; i++) {
      if (array[i] < min)
        min = array[i];
    }
    return min;
  }

  public int sum(int[] array) {
    int sum = 0;
    for(int i=0; i<array.length; i++) {
      sum += array[i];
    }
    return sum;
  }
  
public int avg(int[] array) {
    int sum = 0;
    for(int i=0; i<array.length; i++) {
      sum += array[i];
    }
    return sum / array.length;
  }

  public static void main(String[] args) {
    Arrays a = new Arrays();
    int[] array = { 1, 2, 3, 4, 5 };
    System.out.println("max: " + a.max(array));
    System.out.println("min: " + a.min(array));
    System.out.println("sum: " + a.sum(array));
    System.out.println("avg: " + a.avg(array));
  }

  
}
