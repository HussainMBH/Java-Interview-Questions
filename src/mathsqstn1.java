//Find Minimum elements
public class mathsqstn1
{
    int arr[] = { 1, 2, 3, 4, 5 };

    public void minimumele(){

        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print (arr[i] + " ");
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println ();
        System.out.println (min);
    }

    public void maximumele(){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[0] + " ");
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println();
        System.out.println(max);
    }
    public static void main (String[]args)
    {
       mathsqstn1 obj = new mathsqstn1();
       obj.minimumele();
       obj.maximumele();
    }
}