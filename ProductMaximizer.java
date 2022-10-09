// or a given input array of numbers, find the two that result in the largest product. 
//The output should include the two numbers in the array along with their product.
//As an extra challenge, use an input of two arrays of numbers and find two numbers — 
//one from each input array — that results in the largest product.

// PROGRAM FAILED - YOU CAN HELP SOLVING IT

public class ProductMaximizer {

    public static void main(String[] args) throws Exception {

        int numbers[] = {14, 22, 20, 35, 18, 16, 10};
        int fixedIndex = 0;
        int result = 0;
        int newResult = 0;

        while (fixedIndex < (numbers.length * numbers.length)){

            for (int variableIndex = 0; variableIndex < numbers.length; variableIndex ++){

                // Same numbers can't be multiplied
                if (numbers[fixedIndex] != numbers[variableIndex]){
                    result = numbers[fixedIndex] * numbers[variableIndex];

                    if (newResult < result){
                        newResult = result;
                    }
                }

                if (variableIndex == 7){
                    break;
                }
            }

            fixedIndex ++;
        }
        
        System.out.println(newResult);
    }
}


