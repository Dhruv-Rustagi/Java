package Assignment_6;

public class Assignment_6_4 {

    Assignment_6_4(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Assignment_6_4[] arr = new Assignment_6_4[10];
        for(int i = 0;i<arr.length;i++)
        {
                arr[i] = new Assignment_6_4(Integer.toString(i));
        }
    }
}
