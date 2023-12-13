class Stats<T extends Number>{
    T[] nums;

    Stats(T[] o){
        nums = o;
    }

    double getAvg(){
        double sum = 0.;

        for (int i = 0; i < nums.length ; i++) {
            sum += nums[i].doubleValue();
        }

        return  sum/nums.length;
    }

    boolean issameAvg(Stats<?> ob){ // 와일드 카드 인자 이용 -> 어떤 Stats 오브젝트와도 호환되도록 함 => 어떤 인자와도 호환되도록
        if (ob.getAvg() == getAvg()) {
            return true;
        }
        else return false;
    }

}

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        System.out.println("iobavg = "+iob.getAvg());

        Double[] dnums = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        System.out.println("dobavg = "+dob.getAvg());

//        String[] strs = {"a","b","c","d","e"};
//        Stats<String> sob = new Stats<String>(strs);  //compile error! > Str은 Number class 하위가 아

    }
}
