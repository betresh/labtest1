import java.util.Scanner;
public class Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of in which you want store the numbers:");
        int n=sc.nextInt();
        int[] Sequence=new int[n];
        System.out.println("Enter the values in sequence:");
        int count=1;
        for(int i=0;i<n;i++){
            System.out.println("value "+count+":");
            Sequence[i]=sc.nextInt();
            count++;
        }
        System.out.println("Enter the value you want to search:");
        int value=sc.nextInt();
        boolean check=false;
        for(int i=0;i<n;i++){
            if(Sequence[i]==value){
               check=true;
            }
           }
        int clone=0;
        if(check){
            System.out.println("the value is in the sequence");
            for(int i=0;i<n;i++){
                if(Sequence[i]==value){
                    clone++;
                }
            }
        }
        else{
            System.out.println("the value is not in the sequence");
        }
System.out.println("and its displayed "+clone+"times");
    }
}
