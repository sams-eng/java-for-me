public class operation2 {
        public static void main(String[] args) {
                //we are going to do
                        //  Addition of 2 numbers
                        // Subtraction of 2 numbers
                        // Division of 2 numbers
                        // Multiplication of 2 numbers
                        //Remainder of an Operation
        
                int num1 = 10;
                int num2 = 7;
                int add = num1 + num2;
                System.out.println(add); //17

                int sub = num1 - num2;
                System.out.println(sub); //3

                int mul = num1 * num2;
                System.out.println(mul); //70

                int div = num1 / num2;
                System.out.println(div); //1

                int rem = num1 % num2;
                System.out.println(rem); //3

                num1 = num1 +2;
                System.out.println(num1); //12
                //this method is also written as
                num1 += 2;
                System.out.println(num1); //14
                //we can use any symble in place of + as *,-,/,%
                 
                num1 +=1;
                System.out.println(num1);//15
                //it also written as 
                num1++; //increment (post-increment)
                System.out.println(num1);//16 
                //++num1;(pre-increment)
                //this is also same 
               
                //we can use another symble 
                num1--;
                System.out.println(num1);//15


        
        // pre - increment
        int num3 = 7;
        int sol = ++num3;//first increment and then fetch
        System.out.println(sol); //8

        //post-increment
        int sol2 = num3++; //first fetch the value then increment
        System.out.println(sol2);  //8

//time line - 1:26:53


        }

}
