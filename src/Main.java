import java.util.Arrays;

//7 kyu
public class Main {
    public static void main(String[] args) {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//
//        System.out.println(fizzBuzz.fizzBuzz(100));

//        SingleNumber singleNumber = new SingleNumber();
//        System.out.println(singleNumber.SingleNumber(new int[]{1, 2, 2, 3, 3}));
//        System.out.println(singleNumber.SingleNumber(new int[]{1, 1, 2, 4, 4}));
//        System.out.println(singleNumber.SingleNumber(new int[]{2, 2, 5, 5, 1}));

//        ReverseInteger reverseInteger = new ReverseInteger();
//
//        System.out.println(reverseInteger.reverseInteger(123));
//        System.out.println(reverseInteger.reverseInteger(-123));
//        System.out.println(reverseInteger.reverseInteger(120));

//        FindDivisor findDivisor = new FindDivisor();
//        System.out.println(findDivisor.numberOfDivisors(4));
//        System.out.println(findDivisor.numberOfDivisors(30));
//        System.out.println(findDivisor.numberOfDivisors(12));

//        String[] a1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
//        String []a2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
//
//        MaxDiffLength maxDiffLength = new MaxDiffLength();
//
////        System.out.println(a1.length);
////        System.out.println(a2.length);
//
//        System.out.println(a1[0].length());
//
//        System.out.println(maxDiffLength.mxdiflg(a1, a2));

//        Kata kata = new Kata();
//        int [] arr = {1,2,3,4,3,2,1};
//
//        System.out.println(kata.findEvenIndex(arr));

//        GoodVsEvil goodVsEvil = new GoodVsEvil();
//        System.out.println(goodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
//        System.out.println(goodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
//        System.out.println(goodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
//        System.out.println(goodVsEvil.battle("379 875 9329 3755 9578 1053", "5839 3227 8980 5551 1855 4488 1142"));
//        System.out.println(goodVsEvil.battle("8257 3064 3334 4644 5240 465", "1276 3522 238 1 1988 8857 1323"));

//        Solution solution = new Solution();
//
//        int [] nums = {0,1,0,3,12};
//        int [] nums2 = {0};
//        int [] nums3 = {0,0,1,2,0,4,5,234,563,234342,0,2,22,3};
//
//        solution.moveZeroes(nums);
//        solution.moveZeroes(nums2);
//        solution.moveZeroes(nums3);
//        FirstRepeatingNumber firstRepeatingNumber = new FirstRepeatingNumber();
//
//        int [] nums = {2,5,1,2,3,5,1,2,4};
//        int [] nums1 = {2,1,1,2,3,5,1,2,4};
//        int [] nums2 = {1,2,3,4,5,6};
//        int [] nums3 = {1,2,3,2,5,3};
//
//
//        System.out.println(firstRepeatingNumber.FirstRepeatingNumber(nums));
//        System.out.println("=================================================");
//        System.out.println(firstRepeatingNumber.FirstRepeatingNumber(nums1));
//        System.out.println(firstRepeatingNumber.FirstRepeatingNumber(nums2));
//        System.out.println(firstRepeatingNumber.FirstRepeatingNumber(nums3));

        TwoSum twoSum = new TwoSum();

        int [] nums = {1, 2, 4};
        int [] nums1 = {1, 3, 4,5,2};

        System.out.println(Arrays.toString(twoSum.twoSum(nums, 3)));
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 6)));
    }
}
