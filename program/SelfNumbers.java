import java.util.ArrayList;
import java.util.List;

public class SelfNumbers {

    public static int digitSum (int n) {
        int sum = n;

        String value = Integer.toString(n);
        for (int i = 0; i < value.length(); i++) {
            sum += Integer.parseInt(String.valueOf(value.charAt(i)));
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> nonSelfNumber = new ArrayList<>();
        int range = 5000;

        for (int i = 1; i < range; i++) {
            int res = digitSum(i);
            if(res > range) {
                break;
            }
            nonSelfNumber.add(res);
        }

        digitSum(123);

        List<Integer> listOfNumber = new ArrayList<>();
        for (int i = 1; i <= range; i++) {
            listOfNumber.add(i);
        }

        List<Integer> selfNumbers = new ArrayList<>();
        for (int i = 0; i < listOfNumber.size(); i++) {
            boolean flag = true;

            for (int j = 0; j < nonSelfNumber.size(); j++) {
                if (listOfNumber.get(i).equals(nonSelfNumber.get(j))) {
                    flag = false;
                }
            }

            if(flag == true) {
                selfNumbers.add(listOfNumber.get(i));
            }
        }

        System.out.println(selfNumbers);

    }
}