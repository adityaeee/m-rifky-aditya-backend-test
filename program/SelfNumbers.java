import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SelfNumbers {

    public static int digitSum (int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n/=10;
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> nonSelfNumber = new ArrayList<>();
        int range = 5000;

        for (int i = 1; i < range; i++) {
            int res = digitSum(i) + i;
            if(res > range) {
                break;
            }
            nonSelfNumber.add(res);
        }

//        System.out.println(nonSelfNumber.get(0));

        List<Integer> listOfNumber = new ArrayList<>();
        for (int i = 1; i <= range; i++) {
            listOfNumber.add(i);
        }

//        System.out.println(listOfNumber);


        List<Integer> selfNumbers = new ArrayList<>();
        for (int i = 0; i < listOfNumber.size(); i++) {
            boolean flag = true;

            for (int j = 0; j < nonSelfNumber.size(); j++) {
                if (listOfNumber.get(i).equals(nonSelfNumber.get(j))) {
                    flag = false;
                }
            }

            if(flag == true) {
//                System.out.println(listOfNumber.get(i));
                selfNumbers.add(listOfNumber.get(i));
            }
        }

        System.out.println(selfNumbers);

    }
}