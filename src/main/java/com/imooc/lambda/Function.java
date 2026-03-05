/*
 * @Description:
 * @Date: 2026-03-02 22:42:23
 * @LastEditTime: 2026-03-03 11:27:47
 */

//public class FunctionSample {
//    public static void main(String[] args) {
//        Function<String, Integer> randomStringFunction=1->{
//          String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//          StringBuilder stringBuffer = new StringBuilder();
//          Random random = new Random();
//          for(int i=0;i<10;i++){
//            int position=random.nextInt(chars.length());
//            stringBuffer.append(chars.charAt(position));
//          }
//          return stringBuffer.toString();
//        }
//        String randomString = randomStringFunction.apply(32);
//        System.out.println(randomString);
//    }
//}