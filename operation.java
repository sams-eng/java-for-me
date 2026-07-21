
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

            //type conversion
            byte q = 127;
            System.out.println(q);

            byte w = 125;
            int a = w;
            System.out.println(a);

            // int r = 12;
            // byte p = r;
            // System.out.println(p);   ERROR

            //casting

            int r = 12;
            byte p = (byte)r;
            System.out.println(r); // 12 (just because 12 is a smaller number)

            int i = 257;
            byte o = (byte)i;
            System.out.println(o);  // 1 (because 257 % 256 = 1)

            float m = 12.8f;
            int g = (int)m;
            System.out.println(g); // 12 (it cut the number after(.)point)


            //type promotion

            byte z = 10;
            byte v = 20;
            //if we normaly do z*v it will more then the byte range.so we can promote it to int
            int res = z * v;
            System.out.println(res); //200






        }
}
