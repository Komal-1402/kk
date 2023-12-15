public class MaximumNumberFinder{
    public static double findMax(object[] array){
        double Max = Double.NEGATIVE_INFINITE;
        for(Object element : array){
            if(element instanceof Object[]){
                double innerMax = findMax((Object[]) element);
            }else if (element instsnceof number){
                double num = ((number) element).doubleValue();
                max=Math.max(max, num);
            }
        }
        return max;
    }
    punlic static void main(String[]args){
        Object[] input = {2,4,10, new Object[]{12,4,new Object[]{100,90},4},new object[]{3,2,99},0};
        double maxNumber = findMax(input);
        System.out.println("The maximum number is: " + maxNumber);
    }
}