public class SearchAlgo {
    public static void main(String[] args){
        int nums[] = {2,4,5,6,7,9,13,14};
        int target = 13;
        
        int result = linearSearch(nums, target);

        if (result != -1) {
            System.out.println(String.format("search targrt - %d index %d ", target, result));
        }else{
            System.out.println("Element not found");
        }
    
    }

    public static int linearSearch(int[] data, int target){
        for(int i=0; i<data.length; i++){
            if(data[i]==target){
                return i; 
            }
        }
        return -1;
    }
}
