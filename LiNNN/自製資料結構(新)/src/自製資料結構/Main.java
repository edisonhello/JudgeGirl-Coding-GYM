package 自製資料結構;

import java.util.Comparator;

import Exception.StackEmptyException;

public class Main {

	public static void main (String[] args) {
        Comparator<Student> myComparator = new MyComparator();
		LinStack<Student> myStack = new LinStack<Student>(myComparator);  //宣告

        try{
                for ( int i = 0 ; i < 9 ; i ++ )  //放入1~10 學生
                        myStack.push(new Student(i));
               
               for (Student student : myStack)  // for-each走訪印出
                   System.out.print(student + " ");
			
                System.out.println();
			
                while(true)  //故意無限 pop 來觸發例外
                {
                        Student nextStudent = myStack.pop();
                        System.out.print(nextStudent + " ");  //看看是否跟走訪的順序一樣
                }
	        
        }catch(StackEmptyException err){
                System.out.println(err.getMessage());
        }
        
	
	}
	
}
