public class myArrays {
        public static void main(String[] args) {
        
        // Array of 8 integer elements
        int[] numbers = new int[8];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8; 
        numbers[4] = 10;
        numbers[5] = 12;
        numbers[6] = 14;
        numbers[7] = 16;

        // Array of 12 float elements
        float[] decimals = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        // Array of 5 double elements
        double[] decimals2 = new double[5];
        decimals2[0] = 4.6;
        decimals2[1] = 5.2;
        decimals2[2] = 8.3;
        decimals2[3] = 9.9;
        decimals2[4] = 2.6;

        // Array of 6 boolean elements
        boolean[] booleans = new boolean[6];
        booleans[0] = true;
        booleans[1] = false;
        booleans[2] = false; 
        booleans[3] = true;
        booleans[4] = false;
        booleans[5] = true;
    
        // Print 5th element to the screen
        System.out.println(numbers[4]);
        System.out.println(decimals[4]);
        System.out.println(decimals2[4]);
        System.out.println(booleans[4]);
    
    // Object[] matrix = new Object[]{intArr,floatArr,doubleArr,booleanArr};
    Object[] matrix = {intArr,floatArr,doubleArr,booleanArr};
    // Object[] matrix = new Object[4];
    // matrix[0] = intArr;
    // matrix[1] = floatArr;
    // matrix[2] = doubleArr;
    // matrix[3] = booleanArr;

    for (Object o: matrix) {
      System.out.println(Array.get(o,4));
    }
  }
}