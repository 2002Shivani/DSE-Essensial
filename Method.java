public class Method {
    
    public int add(int a , int b){
        int ans = a+b;
        return ans;
    }
    public static void main(String args[]){ //entry point
        //user-defined method
        Method obj = new Method();
        int sum = obj.add(2,4);
        System.out.println("Sum = " +sum);

    }
}
