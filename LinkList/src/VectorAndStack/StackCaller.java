package VectorAndStack;

public class StackCaller {
    public static void main(String[] args) throws Exception {
        MyStackByLinkList<Integer> Stack=new MyStackByLinkList<>();
        AnotherStack<Integer> Stack1=new AnotherStack<>();
//        for(int i=0;i<7;i++){
//            Stack1.push(i);
//        }
        System.out.println(Stack1.pop());
        System.out.println(Stack1.peek());
    }

}
