public class FirstAndLastIndicies {

    public static void main(String[] args) {
        int targetNum = 2;
        int[] numbersArr = {1, 2, 2, 4, 5, 6, 2, 1, 3};
        int[] result = getFirstAndLastIndicies(numbersArr, targetNum);
     
    }
    
    
     private int[] getFirstAndLastIndicies(int[] numbersArr, int targetNum) {
        int[] result = {-1, -1};
        for (int i = 0; i < numbersArr.length; i++) {
            if (targetNum == numbersArr[i]) {
                if (result[0] == -1) {
                    result[0] = i;
                } else {
                    result[1] = i;
                }
            }
        }
        return result;
    }
}
