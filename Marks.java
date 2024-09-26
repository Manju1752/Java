// write java program to create class number that accept an array of five sub marks along with the following menu 
// a)display marks b)sum c)average d) exit

public class Marks{
public static void main(String args[])
{
int[] a={80,79,87,92,84,79};

System.out.println("display marks :");
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println(a[3]);
System.out.println(a[4]);
System.out.println(a[5]);

int sum =0;
for(int i=0;i<a.length;i++){
sum=sum+a[i];
}
System.out.println("sum="+sum);
}
}