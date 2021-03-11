import java.io.*;
import java.util.*;
public class TargetSubsetSum{
  public static void main(String []args)throws Exception{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int []arr=new int [n];
    for(int i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
    }
    int target=s.nextInt();
    printtargetsubsetSum(arr,0," ",0,target);
  }
  public static void   printtargetsubsetSum(int []arr,int index,String set,int sumofset,int target){
    //base case 
  if(index==arr.length)
  {
    if(sumofset==target)
    {
      System.out.println(set+".");
    }
     return;
  }
     printtargetsubsetSum(arr,index+1, set+arr[index]+",",sumofset+arr[index],target);
     printtargetsubsetSum(arr,index+1,set,sumofset,target);
  }
}
    
      
