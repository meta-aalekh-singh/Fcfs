
	import java.util.*;


	public class Fcfs
	{
	    static void waitingTime(int a[][],int wt[],int gant)
	    {
	        int i;
	        for(i=0;i<4;i++)
	        {
	            if((gant-a[i][0])<=0)
	            {
	                wt[i]=0;
	                gant=a[i][0]+a[i][1];
	            }
	            else
	            {
	                wt[i]=gant-a[i][0];
	            }
	        }
	    }
	    static void turnAroundTime(int a[][],int wt[],int tat[])
	    {   int i;
	        for(i=0;i<4;i++)
	        {
	        tat[i]=a[i][1]+wt[i];
	        }
	    }
	    static void completionTime(int a[][],int ct[],int tat[])
	    {   int i;
	        for(i=0;i<4;i++)
	        {
	        ct[i]=tat[i]+a[i][0];
	        }
	    }
	    static void averageWaitingTime(int a[][],int wt[],int gant)
	    {
	        waitingTime(a,wt,gant);
	        int totalWaitTime=0,i;
	        for(i=0;i<4;i++){
	            totalWaitTime+=wt[i];
	        }
	         System.out.println("\nThe Average waiting Time is : " + totalWaitTime/4);
	       
	    }
	    static void maxWaitingTime(int a[][],int wt[],int gant){
	        waitingTime(a,wt,gant);
	        int maxWaitingTime=0,i;
	        for(i=0;i<4;i++){
	            if(maxWaitingTime<wt[i]){
	                maxWaitingTime=wt[i];
	            }
	        }
	        System.out.println("\n The Maximum waiting Time is : " + maxWaitingTime);
	    }

	public static void main(String[] args)
	{   int [][] a={{0,10},{6,20},{60,10},{110,5}};
	   int []wt = new int[4];
	   int []tat = new int [4];
	   int []ct = new int [4];
	int i,choice,gant=0,flag=1,procNo;
	while(flag==1){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("\n1. For Completion Time : ");
	   System.out.println("\n2. For Waiting Time : ");
	   System.out.println("\n3. For Turn Around Time : ");
	   System.out.println("\n4. For Average Waiting time : ");
	   System.out.println("\n5. For Maximum Waiting time : ");
	   System.out.println("\n6. For Exit : ");
	   choice=sc.nextInt();
	   switch(choice)
	   {
	       case 1 : turnAroundTime(a,wt,tat);
	                completionTime(a,ct,tat);
	                System.out.println("\nThe Completion Time for each process is : ");
	                for(i=0;i<4;i++){
	                    procNo=i+1;
	                    System.out.println("\n Process "+ procNo +" : " + ct[i]);
	                }
	                break;
	       case 2 : waitingTime(a,wt,gant);
	                System.out.println("\nThe Waiting Time for each process is : ");
	                for(i=0;i<4;i++){
	                    procNo=i+1;
	                    System.out.println("\n Process "+ procNo +" : " + wt[i]);
	                }
	                break;
	       case 3 : turnAroundTime(a,wt,tat);
	                System.out.println("\nThe Turn Around Time for each process is : ");
	                for(i=0;i<4;i++){
	                    procNo=i+1;
	                    System.out.println("\nProcess "+ procNo +" : " + tat[i]);
	                }
	                break;
	       case 4 : averageWaitingTime(a,wt,gant);
	                break;
	       case 5 : maxWaitingTime(a,wt,gant);
	                break;
	       case 6 : flag=0;
	                break;
	       default : System.out.println("\nSorry! Wrong Choice. ");
	   }
	}
	}
	}

