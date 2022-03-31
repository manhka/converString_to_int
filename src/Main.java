public class Main {
    public static void main(String[] args){
//         if String is liked number
//        String str="34";
//int number = Integer.parseInt(str);
//        System.out.println(number+2);
//         if String is like String
        String str1= "age :ddd37";
        str1=str1.replaceAll("\\D+","");
        System.out.println(str1);
        int number = Integer.parseInt(str1);
        System.out.println(str1+6);

    }
}
