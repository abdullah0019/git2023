package project2023;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number[]=new int[5];
        int sum=0 ;
        System.out.println("Please enter 5 numbers");

        for (int i=0;i<5;i++){
            number[i]=input.nextInt();
        }

        for (int i=0;i<5;i++){
            sum=sum+number[i];
        }


        System.out.println("Total sum of Array  ="+sum); //sum of Array
        System.out.println("Average of array ="+sum/5);  //Average of Array

        //for Max
        int max=number[0];  //just I imagine index 0 is the max number .now I can compare.lecture 53
        int min=number[0];  //same as max
        for (int i=1;i<5;i++){      //i =1 because I imagine number[0] is max

            if (max<number[i]){
                max=number[i];
            }
            if (min>number[i]){
                min=number[i];
            }

        }
        //now print out max of Array
        System.out.println("Max Array is ="+max);
        System.out.println("Min Array is ="+min);
    }





}
}
