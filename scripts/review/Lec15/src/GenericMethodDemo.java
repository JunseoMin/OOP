interface MyFnc<T>{ // 인터페이스 선언 함수의 전달인자로 나타내기 위함
    int fnc(T[] vals,T v);
}

class MyArrayOP{    // 함수가 정의된 class
    static <T> int countMAtching(T[] vals, T v){    // static 함수
        int cnt = 0;

        for (int i = 0; i < vals.length ; i++) {
            if (vals[i] == v) {
                cnt ++;
            }
        }
        return cnt;
    }
}

public class GenericMethodDemo {
    static <T> int myOP(MyFnc<T> f1, T[] vals, T v){    // 전달인자로 인터페이스 사용
        return f1.fnc(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1,2,3,4,523,523,3,3,2,4,2,5,6,9};
        String[] strs = {"One","Two","Three","Four","Five"};
        int cnt;

        cnt = myOP(MyArrayOP::countMAtching,vals,2);
        System.out.println(cnt);

        cnt = myOP(MyArrayOP::countMAtching,strs,"One");
        System.out.println(cnt);
    }
}
