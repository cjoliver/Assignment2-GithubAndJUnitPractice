import java.util.Arrays;
public class Finder {
    public Integer findMin(Integer[] intArray){
        if(intArray == null || intArray.length == 0) {
            System.out.println("Null or Empty");
            return null;
        }
        Arrays.sort(intArray);
        return intArray[0];
    }
    public Integer findMax(Integer[] intArray){
        if(intArray == null || intArray.length == 0) {
            System.out.println("Null or Empty");
            return null;
        }
        Arrays.sort(intArray);
        return intArray[intArray.length - 1];
    }
}
