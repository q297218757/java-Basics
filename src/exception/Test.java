package exception;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public void display(int i) throws MyException{
        if(i == 0){
            throw new MyException("该值不能为0");
        }else {
            System.out.println(i/2);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        List list = new ArrayList();
        try {
            test.display(0);
        }catch (MyException e){
            e.printStackTrace();
        }
    }
}
