//package practiceprogram;
//
//public class SumOfNumber {
//    static String findSum(String s1,String s2) {
//        if (s1.isEmpty()) {
//            return s2;
//        }
//        if (s2.isEmpty()) {
//            return s1;
//        }
//
//        int i = s1.length();
//        int j = s2.length();
//
//        int carry = 0;
//
//        while (i >= 0 || j >= 0 || carry > 0) {
//            int digit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
//            int digit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;
//
//            int sum = digit1 + digit2 + carry;
//
//            carry = sum / 10;
//            sum = sum % 10;
//
//            result.append((char) ('0' + sum));
//            i--;
//            j--;
//        }
//            while (result.length() > 1 && result.charAt(result.length() - 1) == '0') {
//                result.delteCharAt(result.length() - 1);
//            }
//            result.reverse();
//            return result.toString();
//        }
//
//
//        public static void main(String[] args){
//            String s1="25",s2="23";
//            System.out.println(findSum(s1,s2));
//        }
//    }
//
//
