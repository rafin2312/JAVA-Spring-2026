import java.util.ArrayList;

public class ArrayListTask {
    ArrayList<Integer>numbers = new ArrayList<>();
    //10 integer
    public ArrayListTask() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }
    //sum
    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }
    //find maximum
    public int findmax(){
        int max = numbers.get(0);
        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    //find minimum
    public int findmin(){
        int min = numbers.get(0);
        for(int num : numbers){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
    //average
    public double findaverage(){
        return (double)calculateSum()/numbers.size();
    }
    public void show(){
        System.out.println("ArrayList: " + numbers);
        System.out.println("Sum: " + calculateSum());
        System.out.println("Min: " + findmin());
        System.out.println("Max: " + findmax());
        System.out.println("Average: " + findaverage());
    }
}