
public class operation {
        public static void main(String[] args) {
            //1st part
            int num = 3;
            System.out.println("num");
            
            //2nd part
            int num1 = 5;
            int num2 = 10;
            int result = num1 + num2 ;
            System.out.println(result);

            //3rd part DATATYPES
            int num3 = 9;
            byte by = 127 ;//range -128 to 127
            short sh = 618;
            long l = 5666l; //suffix l

            float f = 157.8f;//suffix f
            double d = 157.8;//same value but no need any suffix

            char c = 'k';//single coutes
            boolean b = true;


            
            //Literals
            int num4 = 0b101; //binary format (output = 5)
            System.out.println(num4);

            int num5 = 0x7e; //hexadecimal
            System.out.println(num5);

            int num6 = 10_00_00_000;
            System.out.println(num6); //output = 100000000(same number)


            char t = 'a';
            System.out.println(t); // output = a

            char y = 'a';
            y++;
            System.out.println(y); //output = b

            // compailation successfully
        }
}
