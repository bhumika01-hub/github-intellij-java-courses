package org.example;//package org.example;
//
//public class Hello {
//    public static void main(String[] args)
//    {
////        byte a = 127;
////        int b = 12;
////
////        int result = (a=(byte) b);
//
////            int num = 5;
////           // num++; // num = num+1;
////           // num--;
////            int result = num++;
////
////            System.out.println(result);
//
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int k=1;k<=3;k++){
//            for(int m=3;m>=k;m--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//}


class Hello{
    public static void main(String args[]){
        System.out.println("I have started");

        for(int a =0;a<=5;a++){
            for(int b=0;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<=5;i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}