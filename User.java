// import java.util.*;

// public class User
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int  n = sc.nextInt();
//         String s = sc.nextLine();
//         System.out.println(n);
//         System.out.println(s);
//     }
// }

// Try catch

// public class User
// {
//     public static void main(String[] args)
//     {
//         try{
//             int[] x  = {1 , 2 ,3};
//             System.out.println(x[8]);
//         }
//         catch(Exception e)
//         {
//             System.out.println("Array index out of bound");
//         }finally //It will executes
//         {
//             System.out.println("We carried exception");
//         }
//     }
// }

public class User
{
    public static void main(String[] args)
    {
        try{
            int y = 10/0;
            int[] x  = {1 , 2 ,3};
            System.out.println(x[8]);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Math error or array error occurred");
        // }finally //It will executes
        // {
        //     System.out.println("We carried exception");
        // }
        }
    }
}

// public class User
// {
//         static void checkAge(int age)
//         {  
//             if(age<18)
//             {
//             throw new ArithmeticException("Access denied need to be 18+");
//             }else
//             {
//                 System.out.println("Access granted");
//             }
//         }

//         public static void main(String[] args)
//         {
//             checkAge(13);
//         }
    
// }