package CalculatorProj;
import java.util.Scanner;

class Calculator{
           public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            System.out.println("enter a symbol");
            String inp=sc.next();
            int res;
            switch(inp) {
                case "+":
                    res=n1+n2;
                    System.out.print("addition"+res);
                    break;
                case "-":
                    res=n1-n2;
                    System.out.print("substraction"+res);
                    break;
                case "*":
                    res=n1*n2;
                    System.out.print("multipication"+res);
                    break;
                case "/":
                    res=n1/n2;
                    System.out.print("division"+res);
                    break;
                default:
                    System.out.println("invalid inp");
                    break;
            }

        }

    }

