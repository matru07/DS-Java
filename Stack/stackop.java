import java.util.*;
class Stack
{   int arr[],top,capacity;
    Stack(int size)
    {
    int arr[]=new int[size];
    int top=-1;
    int capacity=size;
    }
    void push(int data)
    {
        top++;
        arr[top]=data;
        System.out.println(arr[top]+"Item pushed");
    }


}


class stackop
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack(4);

        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
      }


}


















